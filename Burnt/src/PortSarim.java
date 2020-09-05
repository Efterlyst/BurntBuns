import org.dreambot.api.methods.dialogues.Dialogues;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.map.Tile;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.wrappers.interactive.GameObject;
//import org.dreambot.api.wrappers.interactive.NPC;
import org.dreambot.api.wrappers.widgets.Menu;
//import org.dreambot.api.wrappers.widgets.WidgetChild;

//import java.util.List;

@ScriptManifest(author = "Me", description = "Yoinks Burnt Chicken in Port Sarim", name = "Burnt Yeeter", category = Category.MAGIC, version = 1)
public class PortSarim extends AbstractScript{

	State state;
	Menu menu;
	
	boolean Houseentering = false;
	boolean Houseexiting = false;
	boolean Wydinentering = false;
	boolean Wydinexiting = false;
	boolean Bankentering = false;
	boolean Bankexiting = false;
	
	boolean AfterCooking = false;
	
	
	
	Area storeroom = 	new Area(new Tile(3009, 3209), new Tile(3011, 3204));
	Area Wydin = 		new Area(new Tile(3012, 3208), new Tile(3016, 3203));
	Area Range = 		new Area(new Tile(3017, 3239), new Tile(3018, 3236));
	Area Bank = 		new Area(new Tile(3042, 3237), new Tile(3047, 3234));
	Area CrateArea = 	new Area(new Tile(3009, 3210), new Tile(3011, 3209));
	

	Tile WydinDoorExit = 	new Tile(3016, 3206);
	Tile WydinDoorEnter = 	new Tile(3017, 3206);
	Tile Door1Enter = 		new Tile(3012, 3239);
	Tile Door2Enter =		new Tile(3014,3237);
	Tile Door2Exit = 		new Tile(3015,3237);
	Tile Door1Exit = 		new Tile(3012,3238);
	Tile Storeroomenter = 	new Tile(3012,3204);
	Tile Cratetile = 		new Tile(3010,2309);

	
	Tile[] pathtoHouse = {new Tile(3008, 3219), new Tile(3008, 3234), new Tile(3012, 3239)};
	Tile[] pathtoBank = {Door1Exit, new Tile(3026, 3241), new Tile(3038, 3236), new Tile(3045, 3235)};
	Tile[] returnpath = {new Tile(3033, 3237), new Tile(3027, 3228), new Tile(3027, 3213), WydinDoorEnter};
	
	
	int CookingCount;
	
	@Override //Infinite loop
	public int onLoop() {
		
		//Determined by which state gets returned by getState() then do that case.
		switch(getState()) {
		
		case LOOT:
			log("Looting state");
			GetChicken("Crates");
			Wydinexiting = true;
			Wydinentering = false;
			Houseentering = true;
			Houseexiting = false;
			break;
			
		case LEAVINGSTOREROOM:
			log("Leaving Storeroom");
			StoreroomDoorExit("Door");
			break;
			
		case WYDINEXIT:
			log("Starting Wydinexit");
			getWalking().walk(WydinDoorExit);
			log("Walking to Wydin Door");
			sleep(randomNum(3500, 4500));
			WydinDoorExit("Door");
			Wydinexiting = false;
			Wydinentering = true;
			sleep(2000);
			break;
			
		case ENTERDOOR1:
			log("Entering Door 1");
			Door1Enter("Door");
			break;
			
		case ENTERDOOR2:
			log("Entering Door 1");
			Door2Enter("Door", "Range");
			CookingCount = 0;
			break;
			
		case COOKING:
			Houseentering = false;
			log("Starting to cook");
			Cooking("Range");
			Houseexiting = true;
			break;
			
		case EXITDOOR2:
			AfterCooking = true;
			log("Starting Exit Door 2");
			getWalking().walk(Door2Exit);
			sleep(2000);
			Door2Exit("Door");
			break;
			
		case EXITDOOR1:
			getWalking().walk(Door1Exit);
			sleep(3000);
			Door1Exit("Door");
			CookingCount = 0;
			Bankentering = true;
			break;
			
		case BANKING:
			sleep(1000);
			Banking("Bank deposit box");
    		Bankentering = false;
    		Bankexiting = true;
    		Houseentering = true;
    		Houseexiting = false;
			sleep(2000);
			break;
			
		case RETURNING:
			sleep(1000);
			Returning("Door");
			sleep(2000);
			break;
			
		case TOSTOREROOM:
			sleep(1000);
			toStoreroom("Door");
    		Bankentering = true;
    		Bankexiting = false;
			sleep(2000);
			AfterCooking = false;
			break;
		

		default: log("an error has occurred");
		}
		return 0;
	}
	
	//State names
	private enum State{
		LOOT, LEAVINGSTOREROOM, WYDINEXIT, WALKTOHOUSE, ENTERDOOR1, ENTERDOOR2, COOKING, EXITDOOR2, EXITDOOR1, BANKING, RETURNING,
		TOSTOREROOM
	}
	
	//Checks if a certain condition is met, then return that state.
	private State getState() {
		if(storeroom.contains(getLocalPlayer())&&getInventory().isFull()) {
			state = State.LEAVINGSTOREROOM;
		}else if(storeroom.contains(getLocalPlayer())&& !getInventory().isFull()){
			state = State.LOOT;
		}else if(Wydin.contains(getLocalPlayer())&&AfterCooking == false){
			state = State.WYDINEXIT;
		}else if(getLocalPlayer().getTile().distance(Door1Enter)<2&&AfterCooking == false) {
			state = State.ENTERDOOR1;
		}else if(getLocalPlayer().getTile().distance(Door2Enter)<2&&AfterCooking == false) {
			state = State.ENTERDOOR2;
		}else if(Range.contains(getLocalPlayer())&&CookingCount<3) {
			state = State.COOKING;
		}else if((CookingCount>=3)&&AfterCooking == false) {
			state = State.EXITDOOR2;
		}else if(getLocalPlayer().getTile().distance(Door1Exit)<2&&AfterCooking == true) {
			state = State.EXITDOOR1;
		}else if(Bank.contains(getLocalPlayer())&&AfterCooking == true&&getInventory().isFull()){
			state = State.BANKING;
		}else if (Bank.contains(getLocalPlayer())&&!getInventory().isFull()) {
			state = State.RETURNING;
		}else if(Wydin.contains(getLocalPlayer())&&AfterCooking == true){
			state = State.TOSTOREROOM;
		}
		return state;
	}
	
	//When script start load this.
	public void onStart() {
		log("The 1M burnt journey has Started");
	}
	
	//When script ends do this.
	public void onExit() {
		log("Bot Ended");
	}
	
	
    private void GetChicken(String nameofObject){	//
    	log("in get chicken");
    		log("Next to crate, beginning loot");
			Dialogues d = getDialogues();
			if (d.inDialogue()) {
				d.chooseOption(1);
			}else {
				GameObject crates = getGameObjects().getTopObjectOnTile(new Tile(3009,3209));
				if(crates != null && crates.hasAction("Search")){
					log("searching crate");
					crates.interact("Search");
					sleep(3000);
			}		
    	}
    }
	

	
    private void StoreroomDoorExit(String nameofObject){	//
        GameObject door = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject));
        if(door != null && door.hasAction("Open")){
        	log("open storeroom door");
        	door.interact("Open");
        	sleep(randomNum(1500, 2500));
        }else {
        	log("Other Player Interacting with Storeroom door");
			sleep(randomNum(1000, 2000));
		}
	}

    
    private void WydinDoorExit(String nameofObject){	//
        GameObject door = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject));
        if(door != null && door.hasAction("Open")){
        	log("open Wydin door");
        	door.interact("Open");
        	sleep(randomNum(1500, 2500));
        }else {
        	log("Wydin door was open");
        	for(int i = 0; i < pathtoHouse.length; i++) {			//about to alter the below code to add 1 tile relaxation
				while(getLocalPlayer().getTile().distance(pathtoHouse[i])>2) {
					if(!getLocalPlayer().isMoving()) {
						getWalking().walk(pathtoHouse[i]);
						sleep(randomNum(1000, 2000));
					}
				}
			}
        }
    }	
	
    
    private void Door1Enter(String nameofObject){	//used when entering door1
        GameObject door = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject));
        if(door != null && door.hasAction("Open")){
        	log("open door1");
        	door.interact("Open");
        	sleep(randomNum(1500, 2500));
        }else {
        	log("Door 1 was open");
        	getWalking().walk(Door2Enter);
			sleep(randomNum(1000, 2000));
		}
	}
    
    private void Door2Enter(String nameofObject1, String nameofObject2){	//used when entering door1
        GameObject door = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject1));
        if(door != null && door.hasAction("Open")){
        	log("open door2");
        	door.interact("Open");
        	sleep(randomNum(1500, 2500));
        }else {
        	log("Door 2 was open");
        	GameObject range = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject2));
        	if(range != null && range.hasAction("Cook")){
            	log("click on the range(withinDoor2Enter)");
            	range.interact("Cook");
            	sleep(randomNum(1500, 2500));
            }
			sleep(randomNum(1000, 2000));
		}
	}

    private void Cooking(String nameofObject){	//
		log("Beginning to Cook");
			if (getWidgets().getWidget(270) !=null) {
				log("Eureka, widget found");
				if (getWidgets().getWidget(270).getChild(15) !=null) {
					getWidgets().getWidget(270).getChild(15).interact();
				}
				if (getWidgets().getWidget(270).getChild(14) !=null) {
					getWidgets().getWidget(270).getChild(14).interact();
				}
				sleep(2000);
		        if (getLocalPlayer().getAnimation() == 896)
		        {
		            //sleep until the player is idle or 30000
		            sleepUntil(() -> getLocalPlayer().getAnimation() == -1, 120000);
		        }
				
			}
			if (getWidgets().getWidget(270) ==null) {
				log("Widget not found");
				GameObject range = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject));
	        	if(range != null && range.hasAction("Cook")){
	            	log("click on the range(within cook)");
	            	range.interact("Cook");
	            	sleep(randomNum(2000, 2500));
	            	CookingCount++;
	        	}
		}
			
	}

    private void Door2Exit(String nameofObject1){	//used when entering door1
        GameObject door = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject1));
        if(door != null && door.hasAction("Open")){
        	log("Evaluate door2");
        	door.interact("Open");
        	sleep(randomNum(2500, 3500));
        }else {
        	log("Door 2 was open");
        	getWalking().walk(Door1Exit);
        	sleep(randomNum(3500, 4000));
        	CookingCount = 0;
            }
		}
	
    private void Door1Exit(String nameofObject1){	//used when entering door1
        GameObject door = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject1));
        if(door != null && door.hasAction("Open")){
        	log("Evaluate door1");
        	door.interact("Open");
        	sleep(randomNum(2500, 3500));
        }else {
        	log("Door 1 was open");
        	for(int i = 0; i < pathtoBank.length; i++) {
				while(getLocalPlayer().getTile().distance(pathtoBank[i])>2) {
					if(!getLocalPlayer().isMoving()) {
						getWalking().walk(pathtoBank[i]);
						sleep(randomNum(1000, 2000));
					}
				}
			}
            }
		}
    
    private void Banking(String nameofObject1) {
    	log("banking");
    	GameObject bank = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject1));
    	if(bank != null && bank.hasAction("Deposit")){
        	log("click on the Bank");
        	bank.interact("Deposit");
        	sleep(randomNum(1500, 2500));
        }
    	if (getWidgets().getWidget(192).getChild(4) !=null) {
    		log("deposit button found");
    		getWidgets().getWidget(192).getChild(4).interact();
    	}
    }
    
    private void Returning(String nameofObject1) {
    	log("returning");
    	for(int i = 0; i < returnpath.length; i++) {
			while(getLocalPlayer().getTile().distance(returnpath[i])>2) {
				if(!getLocalPlayer().isMoving()) {
					getWalking().walk(returnpath[i]);
					sleep(randomNum(1000, 2000));
				}
			}
		}
    	GameObject door = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject1));
    	if(door != null && door.hasAction("Open")){
        	log("click on the door");
        	door.interact("Open");
        	sleep(randomNum(1500, 2500));
        }else {
        	getWalking().walk(Storeroomenter);
        }
    }
    
    private void toStoreroom(String nameofObject1) {
    	GameObject door = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject1));
    	if(door != null && door.hasAction("Open")){
        	log("click on the door");
        	door.interact("Open");
        	sleep(randomNum(1500, 2500));
    	}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	public int randomNum(int i, int k) {
		int num = (int)(Math.random() * (k - i + 1)) + i;
		return num;
	}

}
