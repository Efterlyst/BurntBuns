
//import org.dreambot.api.methods.RSLoginResponse;
//import org.dreambot.api.methods.dialogues.Dialogues;
import org.dreambot.api.methods.login.LoginUtility;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.map.Tile;
import org.dreambot.api.methods.walking.impl.Walking;
import org.dreambot.api.methods.widget.Widgets;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.wrappers.interactive.GameObject;
import org.dreambot.api.wrappers.interactive.NPC;
import org.dreambot.api.wrappers.widgets.Menu;
import org.dreambot.api.wrappers.items.GroundItem;
import org.dreambot.api.wrappers.items.Item;

import java.util.Arrays;

import org.dreambot.api.methods.container.impl.Inventory;
import org.dreambot.api.methods.container.impl.Shop;
import org.dreambot.api.methods.dialogues.Dialogues;
import org.dreambot.api.methods.input.Keyboard;
import org.dreambot.api.methods.interactive.GameObjects;
import org.dreambot.api.methods.interactive.NPCs;
import org.dreambot.api.methods.item.GroundItems;
//import org.dreambot.api.methods.input.Keyboard;


//import java.util.List;

@ScriptManifest(author = "Me", description = "Yoinks Burnt Chicken in Port Sarim", name = "Burnt Yeeter", category = Category.MAGIC, version = 1)
public class PortSarim extends AbstractScript{

	//122 total words
	String Ord[] = new String[] {"af","end","ingen","til","det","han","og","det er","i","det","-en","ved","end","jeg","-en","te","Jeg ved","det","med","til","mig","er","Ja","Ja","men","det","godt","mig","dens","at","her","af","til","hvordan","du","du","plus","alt","allerede","meget","dette","vi går","han har","nu","er","der er","er","noget","du","jeg har","godt","ikke noget","os","hvornår","hvordan","han","Jeg ved","Disse","alene","eller","Jeg vil have","Øst","har","tak skal du have","jeg","maj l","okay","Jeg er","var","være","tid","gøre","alle sammen","hun","De er","var","du er","du","du har","kan","Hr","at","jeg går","hvem","Hus","Jeg tror","hvorfor","så","fordel","Hej","hvor","aldrig","deres","du ved","to","rigtigt","du vil have","meget","så","jeg var","vejr","mig","at","bedst","mand","gør","går","Gud","også","du","livstid","uden","er det sådan","se","Hr","for evigt","åh","indtil","du","der","undskyld","kan","sige","ingen af  dem","på","flere år","vi har","en","dag","nat","ting og sager","nogen","Før","min","gå","lille smule","Andet","har lyst","alene","ingen","OS","far","mennesker","Det synes","penge","at være","Færdig","dem","samme","være","vi er","se","passere","job","sagde","de","Du går","Klar","morgen","De har","Andet","efter","siden","verden","tale","sådan","havde","kender til","aftale","øjeblik","hvor","uden for","søn","kunne","sikker","kvinde","ven","dage","mor","der","ting","jeres","placere","Han siger","synes godt om","være","store","lort","havde","mor","far","vente","i dag","at have","komme","godt","stat","ny","derefter","vi kan","tre","sagde","vores","været","mindre","bør","venlig","godt","med mig","forkert","alle","Navn","gør","tænke","alle","elsker","Egen","har set","Disse","ønskede at","Hej","sent","sager","en del","endnu","vores","de har","så meget","hver","time","gange","havde brug for","med dig","gå","at have","godt","ordsprog","hvem","gøre hvad","også","hører man","ah","gøre","mænd","at vide","mellem","farvel","problem","nogle","gå","vi har","rigtigt","jeg må","grund","nogen","de der","godt","Jeg ser","ide","pige","Virkelig","politibetjent","gjorde","Disse","venner","jer der","måske","jeg grinede","hoved","bror","jeg siger","gå","forbi","forlade","regning","familie","søde","okay","nogle","mange","Frk","vi er","de kan","nætter","død","Du","stadig","Quick","gammel","side","bør","du ser","Jeg vidste","held","pas på","gode","ville være","giver","Mens","frygt","først","mod","dør","snart","og","næsten","ny","Jeg håber","nogen","de der","Vand","du","dreng","hvor meget","børn","kom nu","vej","Først","imod","jeg troede","inde","Han passerede","du må","by","historie","år","kommer","lade","i løbet af","form","Vend tilbage","lykkelig","øjne","krig","sag","Drenge","kone","foran","Hvilken en","hånd","jeg gjorde","sav","vil gerne have","død","der","mere","helt vildt","formodede","tage","minutter","det vil jeg gøre","jeg forstår det","ske","jeg gik","hjerte","uge","chef","komme","hænder","Hjælp","problemer","sammen","Jeg formoder","Lad mig","vigtig","gå væk","dreng","op","datter","andre","fru","personer","jorden","vej","taler","ende","Kvinder","ansigt","stor","nogen","vores","fem","opkald","Hej","taler","lav","sige","strøm","hvornår","måske","lytter","person","timer","onkel","selvom","io","kun","sagde","i det mindste","de vil have","ingen","nær ved","lille","vi skal","Cree","give mig","følge efter","bil","fire","forlade","Mange","samme","jeg laver","parat","det betyder","kaptajn","klasse","nå","læge","nok","drikke","at leve","ung","at arbejde","bøg","ned","havde","først","store","retfærdig","tænke","samme","tæve","spise","behøver at","Jeg ved","jeg var","Nogle","Hop ind","stærk","nummer","Frk","At dø","Nok","give","temmelig","elsker","bag","sige","svært","Øst","kan","punkt","kom","søster","sønner","søm","endelige","skole","jeg kunne","landsby","lave","blod","måneder","bil","spil","finde","virkelighed","Legeme","højere","sidst","de var","resterne","okay","fred","Fortæl mig","Vend tilbage","gjorde","havde","alene","lave","væk","Kære","jeg vil gå","skyld","dårlig","piger","mad","Dollars","dr","de ved","let","høj","muligt","forbandet","søvn","du burde","for pokker","spørgsmål","også selvom","parti","ingen af dem","seng","langt","medium","bekymre","Oh","telefon","fortælle","ei","om","udstyr","ord","hvor meget","fjols","Øst","lys","jeg havde","Land","sekund","Kære","Devils","du gør","gå glip af","mulighed","dræbe","nogle","venter","vi behøver","hvor","at se dig","vil være","jeg kommer","du var","var","seks","har","fjerde","himmel","i live","hukommelse","undskyld","mangel","lille","øre","tro på","John","jeg tror","er","vente","du mangler","her","film","også","mand","hund","generel","Gade","Nemlig","konge","forældre","liste","der vil være","værelse","fanden","tænkning","par","brand","pige","følge efter","musik","gav","der ville være","en masse","Han passerede","følelse","Jeg vil sige","kan du","uden for","du siger","ia","mine","døde","det gav","kaffe","Du forstår","vores","tænke","det","bærer","han var","seneste","ordsprog","stor","websted","Bestil","søger","baby","hold kæft","vender tilbage","Aldrig","minut","våben","rejse","kun","drenge","faret vild","at lege","ti","vi ser","terning","vi ved","tusind","resten","smag","værst","forlade","donkraft","De var","bestille","går","lave om","mærkelig","fattige","tøj","vi vil have","kontor","hvis ikke","mode","opstår","dreng","Andet","vilje","ledig","ved godt","tænke","Formand","særlig","igåraftes","millioner","om","højre","sort","her","herrer","uger","ord","lede efter","sikker","Højre","foran","vi laver","være","bag","Markedsbod","affære","varede","sker","at ringe","undskyld","mund","Opmærksomhed","Se","våben","over","fik pokkers","dårlig","tage med","Hvilken en","had","Hospital","bør","drøm","vil have","hvile","jeg opkald","at tabe","hedder","Perfekt","jeg vil være","rolige","york","sikkerhed","Hjælp","Han havde","lang","smerte","sandsynligvis","I går","Fortæl ham","prøve","væsen","pæn","Husk","lave","ægte","du vil se","fantastiske","jeg kunne godt tænke mig","narre","ganske enkelt","Lad os gå","ville gøre","spørgsmål","luft","kendt","kraft","brev","behandling","plan","at","se ham","sulten","vendt","Start","landskabet","lige","tale","liv","skib","Hotel","placere","gruppe","tanke","Sol","af dine","passere","joe","stemme","bad","brug","få","fornøjelse","ankom","fortælle dig","professor","nyheder","klagesang","fortælle","hvid","Bliv","jeg var","fod","anda","Vente","alder","hemmelighed","vi kunne","Selskab","tog","Husk","efter","Sid ned","siv","udsigt","smuk","del","vi skulle","synes godt om","betale","george","fremtid","stilhed","føles","læge","lærer","vil have","jeg ankommer","helt vildt","lave om","åben","Salt","styring","sjælden","kjoler","kæreste","forskellige","umulig","jeg","ven","med det samme","opkald","give","venstre","måned","jeg er iført","fly","hår","det","fejl","vilje","vil have","egen","følge","vinde","lov","smerte","guld","ti","færdig","forbande","officiel","situation","gøre ondt","du føler","det er underforstået","ønske","sind","hær","at købe","død","tanke","Giv ham","Dum","Han sagde","færdig","David","det lyder","halvt","hest","snigmorder","han så","Undskyld mig","de","arbejder","vidunderlig","bord","sjov","top","Næste","går ind i","Tom","hav","syv","imod","køn","elsker","venlige","besked","Information","dragt","sjæl","fundet","oberst","Fortsæt","helgen","Aftensmad","jeg fandt","charlie","du vil have","aldre","egen","røv","Så","indendørs","sang","regering","Sam","frygt","Åbner","de sagde","du var","halvt","du giver","vi var","Det ville","Jeg giver","du","kold","Foto","ulykke","højre","arbejder","gå","centrum","nødvendig","se","smuk","Før","forfærdeligt","jeg kunne","løjtnant","Måne","venstre","Du","jeg giver","service","opkald","normal","sammen","butik","jul","retning","mormor","rundt om","kom","jeg vil have","frihed","kommer ud","linje","advokat","fødder","Ære","forsøger","at vende tilbage","jeg taler","gammel dame","papir","færdig","venstre","jeg sværger","smuk","sød","føle","starten","interessant","boks","nogen som helst","otte","forfærdelig","svar","hunhund","sjov","s","bringer","personlig","han dræbte","fuldstændig","paul","de kommer","er","ankommer","bedstefar","du har","nuttet","vi vil have","Michael","dele","fængsel","der var","system","nuttet","direktør","gør det","de lavede","tante","Søg","Don","lav","kunne","Sundhed","parat","aftale","havde","forretning","typer","kamera","agent","du vil se","helvede","til stede","flod","igennem","kød","helt","Fortæl mig","etage","mand","høre","harry","sergent","forlade","dine","begge to","at drikke","berolige","kjole","undtagen","at","rigtigt","affald","etage","race","fødselsdag"};
	String[] lootList = {"Bronze pickaxe"};
	
	State state;
	Menu menu;
	LoginUtility LoginUtility;
	Inventory inventory;
	Item item;
	GroundItem pick;
	
	
	
	boolean AfterCooking = false;
	boolean LumbywalkDone = false;
	boolean DialogOpen = false;
	boolean Door1Entered = false;
	boolean AltTask = false;
	
	boolean ChoppingComplete = false;
	
	
	Area storeroom = 	new Area(new Tile(3009, 3209), new Tile(3011, 3204));
	Area Wydin = 		new Area(new Tile(3012, 3208), new Tile(3016, 3203));
	Area Range = 		new Area(new Tile(3017, 3239), new Tile(3018, 3236));
	Area Bank = 		new Area(new Tile(3042, 3237), new Tile(3047, 3234));
	Area CrateArea = 	new Area(new Tile(3009, 3210), new Tile(3011, 3209));
	Area LumbyCastle=	new Area(new Tile(3203, 3226), new Tile(3224, 3207));
	//In development:
	Area Rimmington = 	new Area(new Tile(2971, 3220), new Tile(2973, 3218));
	Area GeneralStore = new Area(new Tile(2945, 3219), new Tile(2950, 3210));
	Area OakTrees = 	new Area(new Tile(2949, 3238), new Tile(3960, 3227));
	Area BurnStart = 	new Area(new Tile(2983, 3224), new Tile(2985, 3224));
	Area BurnEnd = 		new Area(new Tile(2957, 3225), new Tile(2959, 3223));
	
	//Walking Locations
	Tile WydinDoorExit = 	new Tile(3016, 3206);
	Tile WydinDoorEnter = 	new Tile(3017, 3206);
	Tile Door1Enter = 		new Tile(3012, 3239);
	Tile Door2Enter =		new Tile(3014,3237);
	Tile Door2Exit = 		new Tile(3015,3237);
	Tile Door1Exit = 		new Tile(3012,3238);
	Tile Storeroomenter = 	new Tile(3012,3204);
	Tile Cratetile = 		new Tile(3010,2309);
	
	//Object Locations
	Tile StoreroomDoor = 	new Tile(3012,3204);
	Tile WydinDoor = 		new Tile(3017,3206);
	//Tile WydinDoorClosed =	new Tile(3016,3206);
	Tile Door1 = 			new Tile(3012,3238);
	//Tile Door1Closed = 		new Tile(3012,3239);
	Tile Door2 = 			new Tile(3014,3237);
	//Tile Door2Closed =		new Tile(3014,3238);
	Tile RangeSouth = 		new Tile(3019,3237);
	Tile BankDeposit = 		new Tile(3045,3234);

	
	Tile[] pathtoHouse = {new Tile(3008, 3219), new Tile(3008, 3234), new Tile(3012, 3239)};
	Tile[] pathtoBank = {Door1Exit, new Tile(3026, 3241), new Tile(3038, 3236), new Tile(3045, 3235)};
	Tile[] returnpath = {new Tile(3033, 3237), new Tile(3027, 3228), new Tile(3027, 3213), WydinDoorEnter};
	Tile[] pathfromLumby = {new Tile(3208, 3212), new Tile(3193, 3216), new Tile(3179, 3221), new Tile(3166, 3225), new Tile(3151, 3228), new Tile(3134, 3227), new Tile(3119, 3226), new Tile(3106, 3234), new Tile(3097, 3248), new Tile(3081, 3254), new Tile(3073, 3269), new Tile(3058, 3264), new Tile(3053, 3252), new Tile(3041, 3243), new Tile(3028, 3233), new Tile(3022, 3217), new Tile(3013, 3206)};
	Tile[] pathtoRimmintgon = {new Tile(3003, 3210), new Tile(2989, 3212), new Tile(2975, 3211), new Tile(2973, 3220)};
	Tile[] pathFromRimmintgon = {new Tile(2973, 3220) ,new Tile(2974, 3211), new Tile(2989, 3212), new Tile(3003, 3210), new Tile(3013, 3206)};
	Tile[] toBurn = {new Tile(2967, 3224) ,new Tile(2984, 3224)};

			
	int CookingCount = 0;
	int Loops = 0;
	int BurntChickenID = 2144;
	int LastInvSlot = 28;
	int OakLogs = 1521;
	int Logs = 1511;
	int Tinderbox = 590;
	
	@Override //Infinite loop
	public int onLoop() {
		
		//Determined by which state gets returned by getState() then do that case.
		switch(getState()) {
		
		case LOOT:
			log("Looting state");
			GetChicken("Crates");/*
			if(Loops>21) {
				stop();
			}*/
			break;
			
		case LEAVINGSTOREROOM:
			log("Leaving Storeroom");
			LumbywalkDone = false;
			StoreroomDoorExit("Door");
			if(randomNum(1,10)>5) {
				Keyboard.type(Ord[randomNum(1,Ord.length)]+" "+Ord[randomNum(1,Ord.length)]+" "+Ord[randomNum(1,Ord.length)]+" "+Ord[randomNum(1,Ord.length)]+"!?",true);
			}else {
				log("no ingame message");
			}
			sleep(500);
			break;
			
		case WYDINEXIT:
			log("Starting Wydinexit");
			Walking.walk(WydinDoorExit);
			log("Walking to Wydin Door");
			sleep(randomNum(3500, 4500));
			sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
			WydinDoorExit("Door");
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
			log("Starting to cook");
			if(Inventory.contains(2140)||Inventory.contains(2138)){			//cooked and raw chicken
				log("inv has food to process, proceed to cook");
				Cooking("Range");
			}else {
				AfterCooking = true;
			}
			break;
			
		case EXITDOOR2:
			AfterCooking = true;
			log("Starting Exit Door 2");
			Walking.walk(Door2Exit);
			sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
			Door2Exit("Door");
			break;
			
		case EXITDOOR1:
			Walking.walk(Door1Exit);
			sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
			Door1Exit("Door");
			CookingCount = 0;
			break;
			
		case BANKING:
			sleep(1000);
			Banking("Bank deposit box");
			sleep(2000);
			Loops++;
			break;
			
		case RETURNING:
			sleep(1000);
			Returning("Door");
			sleep(2000);
			break;
			
		case TOSTOREROOM:
			sleep(1000);
			toStoreroom("Door");
			sleep(2000);
			AfterCooking = false;
			break;
			
		case FROMLUMBY:
			sleep(1000);
			fromlumby();
			sleep(2000);
			AfterCooking = true;
			break;	
			
		case GETLOG:
			log("getting log to sell");
			AltTask = false;
			while(!Inventory.contains(Logs)) {
				ChopTree(1, "Tree");	
			}
			log(ChoppingComplete);
			break;
			
		case GETPICK:
			log("get pick");
			if (!GeneralStore.contains(getLocalPlayer())) {
				Walking.walk(new Tile(2969, 3217));
				sleep(2000);
				sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
				ClosestDoor("Door");					//first door of the pickaxe building
				sleep(2000);
				Walking.walk(new Tile(2964, 3213));
				sleep(2000);
				sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
				GroundItem pick = GroundItems.closest(groundItem -> groundItem != null && Arrays.asList(lootList).contains(groundItem.getName()));		//identify pickaxe
				pick.interact("Take");
				sleep(2000);
				ClosestDoor("Door");					//second door of the pickaxe building	
				sleep(2000);
				Walking.walk(new Tile(2952, 3214));		//walk near the general store
				sleep(2000);
				sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
				Walking.walk(new Tile(2949, 3217));		//walk into the general store
				sleep(2000);
				sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
				sleep(500);
			}
			break;
		
		case BUYGOODS:
			log("buying goods");
			BuyTinderbox();
			if(Inventory.contains(Tinderbox)) {
				if(!getLocalPlayer().isMoving()) {
					Walking.walk(new Tile(2955, 3229));
					sleep(randomNum(1000, 2000));
				}else {
					sleep(3000);
				}
			}else {
				sleep(400);
			}

			
			break;
			
		case CHOPOAKS:
			log("chopping oaks");
			ChopTree(1, "Oak");
			
			break;
			
		case BURNMOVE:
			log("Burnt move");
	    	for(int i = 0; i < toBurn.length; i++) {
				while(getLocalPlayer().getTile().distance(toBurn[i])>2) {
					if(!getLocalPlayer().isMoving()) {
						Walking.walk(toBurn[i]);
						sleep(randomNum(1000, 2000));
					}
				}
			}
	    	sleep(3000);

			break; 
			
		case BURN:
			log("Now burning");
			Burn();
			AfterCooking = true;
			break;
			
		default: log("an error has occurred");
		}
		return 0;
	}
	
	//State names
	private enum State{
		LOOT, LEAVINGSTOREROOM, WYDINEXIT, WALKTOHOUSE, ENTERDOOR1, ENTERDOOR2, COOKING, EXITDOOR2, EXITDOOR1, BANKING, RETURNING,
		TOSTOREROOM, FROMLUMBY, GETLOG, GETPICK, BUYGOODS, CHOPOAKS, BURNMOVE, BURN
	}
	
	//Checks if a certain condition is met, then return that state.
	private State getState() {
	if(LumbyCastle.contains(getLocalPlayer())&&LumbywalkDone==false){															//0, starting from Lumbridge
			state = State.FROMLUMBY;
			
		}else if(storeroom.contains(getLocalPlayer())&& !Inventory.isFull()){													//1, first step
			state = State.LOOT;
			
		}else if(storeroom.contains(getLocalPlayer())&& Inventory.isFull()) {													//2, second step
			state = State.LEAVINGSTOREROOM;
			
		}else if(Wydin.contains(getLocalPlayer())&&AfterCooking == false&&Inventory.isFull()){									//3, third step
			state = State.WYDINEXIT;
			
		}else if(getLocalPlayer().getTile().distance(Door1Enter)<2&&AfterCooking == false&&Door1Entered == false) {				//4, fourth step
			state = State.ENTERDOOR1;												//revise for robustness
			
		}else if(getLocalPlayer().getTile().distance(Door2Enter)<2&&AfterCooking == false) {									//5, fifth step
			state = State.ENTERDOOR2;												//revise for robustness
			
		}else if(Range.contains(getLocalPlayer())&&CookingCount<3&&AfterCooking == false) {										//6, sixth step
			state = State.COOKING;																			//Improve this to inspect inventory for product yet to be cooked, this will prevent final click on range
			
		}else if(Range.contains(getLocalPlayer())&&AfterCooking == true) {														//7, seventh step
			state = State.EXITDOOR2;												//revise for robustness
			
		}else if(getLocalPlayer().getTile().distance(Door1Exit)<2&&AfterCooking == true) {										//8, eighth step
			state = State.EXITDOOR1;												//revise for robustness									
			
		}else if(Bank.contains(getLocalPlayer())&&AfterCooking == true&&Inventory.isFull()){									//9, ninth step
			state = State.BANKING;
			
		}else if (Bank.contains(getLocalPlayer()) && !Inventory.isFull()) {														//10, tenth step
			state = State.RETURNING;
			
		}else if(Wydin.contains(getLocalPlayer())&&AfterCooking == true&&!Inventory.isFull()){									//11, eleventh step
			state = State.TOSTOREROOM;
			
//$$$$$$$$$$$$$$$$$$$$$$$$          RIMMINGTON SECTION         $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
			
		}else if (Rimmington.contains(getLocalPlayer())&&AltTask == true&&!Inventory.contains(Logs)) {														//Trigger to go to Rimmington Step 0
			state = State.GETLOG;
			
		}else if (Inventory.contains(Logs)&&!Inventory.contains("Pickaxe") && !GeneralStore.contains(getLocalPlayer())) {
			state = State.GETPICK;
			
		}else if (GeneralStore.contains(getLocalPlayer())&& !Inventory.contains(Tinderbox)) {									//Rimmington Step 1
			state = State.BUYGOODS;		//risk of logs delivering 0 money when sold, inspect coins in the inventory
			
		}else if (OakTrees.contains(getLocalPlayer()) && !Inventory.isFull() && Inventory.contains(Tinderbox)) {					//Rimmington Step 2
			state = State.CHOPOAKS;
			
		}else if (OakTrees.contains(getLocalPlayer()) && Inventory.isFull() && Inventory.contains(OakLogs)) {					//Rimmington Step 3	
			state = State.BURNMOVE;
			
		}else if (BurnStart.contains(getLocalPlayer()) && Inventory.contains(OakLogs)) {											//Rimmington Step 4
			state = State.BURN;
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
    		while(!Inventory.isFull()) {
	    		sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
				if (Dialogues.inDialogue()&&DialogOpen==true) {
					Keyboard.type("1",false);
					DialogOpen = false;
					sleep(100);
				}else {
					GameObject crates = GameObjects.getTopObjectOnTile(new Tile(3009,3209));
					if(crates != null && crates.hasAction("Search")){
						//log("searching crate");
						sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
						crates.interact("Search");
						DialogOpen = true;
						sleep(randomNum(3333,3666));
				}		
			}	
		}
    }
	
    private void StoreroomDoorExit(String nameofObject){	//
        GameObject door = GameObjects.getTopObjectOnTile(StoreroomDoor);
        if(door != null && door.hasAction("Open")){
        	log("open storeroom door");
        	door.interact("Open");
        	sleep(750);
        	sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
        }else {
        	log("Other Player Interacting with Storeroom door");
			sleep(randomNum(1000, 2000));
		}
	}
 
    private void WydinDoorExit(String nameofObject){	//
    	boolean DoorOpenStatus = false;
        GameObject door = GameObjects.getTopObjectOnTile(WydinDoor);
        if(door != null && door.hasAction("Open")){
        	log("open Wydin door");
        	door.interact("Open");
        	DoorOpenStatus = true;
        	sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
        }else {
        	DoorOpenStatus = true;
        }
        if(DoorOpenStatus == true) {
        	log("Wydin door was open");
        	DoorOpenStatus = false;
        	for(int l = 0; l < pathtoHouse.length; l++) {			//about to alter the below code to add 1 tile relaxation
				while(getLocalPlayer().getTile().distance(pathtoHouse[l])>2) {
					if(!getLocalPlayer().isMoving()) {
						Walking.walk(pathtoHouse[l]);
						sleep(randomNum(1000, 2000));
					}
				}
			}
        }
    }	
	
    private void Door1Enter(String nameofObject){	//used when entering door1
    	boolean DoorOpenStatus = false;
        GameObject door = GameObjects.getTopObjectOnTile(Door1);
        if(door != null && door.hasAction("Open")){
        	log("open door1");
        	door.interact("Open");
        	sleep(randomNum(1500, 2500));
        }else {
        	DoorOpenStatus = true;
        }
        if(DoorOpenStatus == true) {
        	DoorOpenStatus = false;
        	log("Door 1 was open");
        	Walking.walk(Door2Enter);
        	Door1Entered = true;
        	sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
		}
	}
    
    private void Door2Enter(String nameofObject1, String nameofObject2){	//used when entering door1
    	boolean DoorOpenStatus = false;
        GameObject door = GameObjects.getTopObjectOnTile(Door2);
        if(door != null && door.hasAction("Open")){
        	log("open door2");
        	door.interact("Open");
        	sleep(randomNum(1500, 2500));
        }else {
        	DoorOpenStatus = true;
        }
        if(DoorOpenStatus == true) {
        	DoorOpenStatus = false;
        	log("Door 2 was open");
        	GameObject range = GameObjects.getTopObjectOnTile(RangeSouth);
        	if(range != null && range.hasAction("Cook")){
            	log("click on the range(withinDoor2Enter)");
            	range.interact("Cook");
            	sleep(randomNum(1500, 2500));
            }
			sleep(randomNum(1000, 2000));
		}
	}

    private void Cooking(String nameofObject){	//
    	Door1Entered = false;
		log("Beginning to Cook");
		log("Name = " + Inventory.contains(2140,2138));
		if(!Inventory.contains(2140) && !Inventory.contains(2138)){
			log("inv filled with burnts");
			AfterCooking = true;
		}else {
			if (Widgets.getWidget(270) !=null) {
				log("Eureka, widget found");
				if (Widgets.getWidget(270).getChild(15).getChild(38) !=null) {
					Widgets.getWidget(270).getChild(15).interact();
				}
				if (Widgets.getWidget(270).getChild(14) !=null&&Widgets.getWidget(270).getChild(15).getChild(38) ==null) {
					Widgets.getWidget(270).getChild(14).interact();
				}
				sleep(2000);
		        if (getLocalPlayer().getAnimation() == 896)
		        {
		            //sleep until the player is idle or 30000
		            sleepUntil(() -> getLocalPlayer().getAnimation() == -1, 120000);
		        }
				
			}
			if (Widgets.getWidget(270) == null&&AfterCooking == false) {
				log("Widget not found");
				GameObject range = GameObjects.getTopObjectOnTile(RangeSouth);
	        	if(range != null && range.hasAction("Cook")){
	            	log("click on the range(within cook)");
	            	range.interact("Cook");
	            	sleep(randomNum(2000, 2500));
	            	CookingCount++;
	        	}
			}
		}
	}
    private void Door2Exit(String nameofObject1){	//used when entering door1
    	boolean DoorOpenStatus = false;
        GameObject door = GameObjects.getTopObjectOnTile(Door2);
        if(door != null && door.hasAction("Open")){
        	log("Evaluate door2");
        	door.interact("Open");
        	sleep(randomNum(2500, 3500));
        }else {
        	DoorOpenStatus = true;
        }
        if(DoorOpenStatus == true) {
        	DoorOpenStatus = false;
        	log("Door 2 was open");
        	Walking.walk(Door1Exit);
        	sleep(randomNum(3500, 4000));
        	CookingCount = 0;
            }
	}
	
    private void Door1Exit(String nameofObject1){	//used when entering door1
    	boolean DoorOpenStatus = false;
        GameObject door = GameObjects.getTopObjectOnTile(Door1);
        if(door != null && door.hasAction("Open")){
        	log("Evaluate door1");
        	door.interact("Open");
        	sleep(randomNum(2500, 3500));
        }else {
        	DoorOpenStatus = true;
        }
        if(DoorOpenStatus == true) {
        	DoorOpenStatus = false;
        	log("Door 1 was open");
        	for(int k = 0; k < pathtoBank.length; k++) {
				while(getLocalPlayer().getTile().distance(pathtoBank[k])>2) {
					if(!getLocalPlayer().isMoving()) {
						Walking.walk(pathtoBank[k]);
						sleep(randomNum(1000, 2000));
					}
				}
			}
            }
		}
    
    private void Banking(String nameofObject1) {
    	log("banking");
    	GameObject bank = GameObjects.getTopObjectOnTile(BankDeposit);
    	if(bank != null && bank.hasAction("Deposit")){
        	log("click on the Bank");
        	bank.interact("Deposit");
        	sleep(randomNum(1500, 2500));
        }
    	if (Widgets.getWidget(192).getChild(4) !=null) {
    		log("deposit button found");
    		Widgets.getWidget(192).getChild(4).interact();
    	}
    }
    
    private void Returning(String nameofObject1) {
    	boolean DoorOpenStatus = false;
    	log("returning");
    	for(int i = 0; i < returnpath.length; i++) {
			while(getLocalPlayer().getTile().distance(returnpath[i])>2) {
				if(!getLocalPlayer().isMoving()) {
					Walking.walk(returnpath[i]);
					sleep(randomNum(1000, 2000));
				}
			}
		}
    	if(randomNum(1,21)<19) {
	    	GameObject door = GameObjects.getTopObjectOnTile(WydinDoor);
	    	if(door != null && door.hasAction("Open")){
	        	log("click on Wydin door");
	        	door.interact("Open");
	        	sleep(randomNum(1500, 2500));
	        }else {
	        	DoorOpenStatus = true;
	        }
	        if(DoorOpenStatus == true) {
	        	DoorOpenStatus = false;
	        	log("Wydin Door was open");
				while(getLocalPlayer().getTile().distance(Storeroomenter)>3) {
					if(!getLocalPlayer().isMoving()) {
						Walking.walk(Storeroomenter);
						sleep(randomNum(1000, 2000));
					}
				}
	        	
	        }
    	}else if (AltTask == false){
    		AltTask = true; 
    		WalktoRimmington();
    		log("Walk to Rimmington function complete");
    	}
    }
    
    private void toStoreroom(String nameofObject1) {
    	GameObject door = GameObjects.getTopObjectOnTile(StoreroomDoor);
    	if(door != null && door.hasAction("Open")){
        	log("click on storeroom door");
        	door.interact("Open");
        	sleep(randomNum(1500, 2500));
    	}
    }
    
    private void fromlumby() {
    	log("Walking from lumby");
    	for(int j = 0; j < pathfromLumby.length; j++) {
			while(getLocalPlayer().getTile().distance(pathfromLumby[j])>3) {
				if(!getLocalPlayer().isMoving()) {
					Walking.walk(pathfromLumby[j]);
					sleep(randomNum(1000, 2000));
				}
			}
		}
    	LumbywalkDone = true;
    	log("Done Walking from Lumbridge");
    	return;
    }
    
    private void ChopTree (int TreesToChop, String target) {
    	log("Starting to chop trees");
		sleep(600);
		if(!Inventory.contains(Logs)) {
			for(int j = 0; j < TreesToChop; j++) {
				GameObject TargetTree = GameObjects.closest(gameObject -> gameObject != null && gameObject.getName().equals(target));
				if (getLocalPlayer().getAnimation() == -1) {
					TargetTree.interact("Chop down");
					sleep(3200);
					//sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
				}else {
					sleep(randomNum(500, 900));
				}
			}
			while(getLocalPlayer().getAnimation() != -1) {
				sleep(1000);
			}
    	}else{
    		ChopTree(TreesToChop, target);
    	}
    		
    }
    
    
    private void ClosestDoor(String nameofObject){	//
    	GameObject door = GameObjects.closest(gameObject -> gameObject != null && gameObject.getName().equals(nameofObject));
        if(door != null && door.hasAction("Open")){
        	log("open door");
        	door.interact("Open");
        	sleep(750);
        	sleepUntil(() -> getLocalPlayer().isMoving() == false, 10000);
        }else {
        	log("Door was open");
			sleep(randomNum(1000, 2000));
		}
	}
    
    private void BuyTinderbox () {
    	NPC Storeowner = NPCs.closest(npc -> npc != null && npc.hasAction("Trade"));
    	if (!Inventory.contains(Tinderbox)) {
	    	if (Shop.isOpen()) {
	    		Shop.sell(Logs, 1);
	    		sleep(randomNum(500, 800));
	    		Shop.purchase(Tinderbox, 1);
	    		sleep(randomNum(500, 800));
	    	}else {
	        	Storeowner.interact("Trade");
	        	sleep(randomNum(500, 800));
	    	}
    	}
    }
    
    private void Burn() {
		while (Inventory.contains(Tinderbox)&&Inventory.contains(OakLogs)) {
			if (getLocalPlayer().getAnimation() == 733 || getLocalPlayer().isMoving() == true) {
				sleep(randomNum(100, 300));
			}else {
				//log("click logs");
				sleep(200);
				Inventory.interact(Tinderbox, "Use");
				sleep(randomNum(100, 120));
				Inventory.interact(OakLogs, "Use");
				sleep(randomNum(900, 1200));
			}
		}
		sleep(1200);
		Inventory.interact("Bronze pickaxe", "Drop");
		sleep(350);
		Inventory.interact(Tinderbox, "Drop");
		sleep(350);
    	for(int i = 0; i < pathFromRimmintgon.length; i++) {
			while(getLocalPlayer().getTile().distance(pathFromRimmintgon[i])>3) {
				if(!getLocalPlayer().isMoving()) {
					log("on walk back to wydin step" + i);
					Walking.walk(pathFromRimmintgon[i]);
					sleep(randomNum(1000, 2000));
				}
			}
		}
    	log("done walking back");
    	sleep(4000);
    	
    }
    
    
    private void WalktoRimmington(){
    	for(int i = 0; i < pathtoRimmintgon.length; i++) {
			while(getLocalPlayer().getTile().distance(pathtoRimmintgon[i])>2) {
				if(!getLocalPlayer().isMoving()) {
					log("on walk to rimmington step" + i);
					Walking.walk(pathtoRimmintgon[i]);
					sleep(randomNum(1000, 2000));
				}
			}
		}
    	sleep(2200);
    }
	
	public int randomNum(int i, int k) {
		int num = (int)(Math.random() * (k - i + 1)) + i;
		return num;
	}

}
