
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
	String Ord[] = new String[] {"af","end","ingen","til","det","han","og","det er","i","det","-en","ved","end","jeg","-en","te","Jeg ved","det","med","til","mig","er","Ja","Ja","men","det","godt","mig","dens","at","her","af","til","hvordan","du","du","plus","alt","allerede","meget","dette","vi g�r","han har","nu","er","der er","er","noget","du","jeg har","godt","ikke noget","os","hvorn�r","hvordan","han","Jeg ved","Disse","alene","eller","Jeg vil have","�st","har","tak skal du have","jeg","maj l","okay","Jeg er","var","v�re","tid","g�re","alle sammen","hun","De er","var","du er","du","du har","kan","Hr","at","jeg g�r","hvem","Hus","Jeg tror","hvorfor","s�","fordel","Hej","hvor","aldrig","deres","du ved","to","rigtigt","du vil have","meget","s�","jeg var","vejr","mig","at","bedst","mand","g�r","g�r","Gud","ogs�","du","livstid","uden","er det s�dan","se","Hr","for evigt","�h","indtil","du","der","undskyld","kan","sige","ingen af  dem","p�","flere �r","vi har","en","dag","nat","ting og sager","nogen","F�r","min","g�","lille smule","Andet","har lyst","alene","ingen","OS","far","mennesker","Det synes","penge","at v�re","F�rdig","dem","samme","v�re","vi er","se","passere","job","sagde","de","Du g�r","Klar","morgen","De har","Andet","efter","siden","verden","tale","s�dan","havde","kender til","aftale","�jeblik","hvor","uden for","s�n","kunne","sikker","kvinde","ven","dage","mor","der","ting","jeres","placere","Han siger","synes godt om","v�re","store","lort","havde","mor","far","vente","i dag","at have","komme","godt","stat","ny","derefter","vi kan","tre","sagde","vores","v�ret","mindre","b�r","venlig","godt","med mig","forkert","alle","Navn","g�r","t�nke","alle","elsker","Egen","har set","Disse","�nskede at","Hej","sent","sager","en del","endnu","vores","de har","s� meget","hver","time","gange","havde brug for","med dig","g�","at have","godt","ordsprog","hvem","g�re hvad","ogs�","h�rer man","ah","g�re","m�nd","at vide","mellem","farvel","problem","nogle","g�","vi har","rigtigt","jeg m�","grund","nogen","de der","godt","Jeg ser","ide","pige","Virkelig","politibetjent","gjorde","Disse","venner","jer der","m�ske","jeg grinede","hoved","bror","jeg siger","g�","forbi","forlade","regning","familie","s�de","okay","nogle","mange","Frk","vi er","de kan","n�tter","d�d","Du","stadig","Quick","gammel","side","b�r","du ser","Jeg vidste","held","pas p�","gode","ville v�re","giver","Mens","frygt","f�rst","mod","d�r","snart","og","n�sten","ny","Jeg h�ber","nogen","de der","Vand","du","dreng","hvor meget","b�rn","kom nu","vej","F�rst","imod","jeg troede","inde","Han passerede","du m�","by","historie","�r","kommer","lade","i l�bet af","form","Vend tilbage","lykkelig","�jne","krig","sag","Drenge","kone","foran","Hvilken en","h�nd","jeg gjorde","sav","vil gerne have","d�d","der","mere","helt vildt","formodede","tage","minutter","det vil jeg g�re","jeg forst�r det","ske","jeg gik","hjerte","uge","chef","komme","h�nder","Hj�lp","problemer","sammen","Jeg formoder","Lad mig","vigtig","g� v�k","dreng","op","datter","andre","fru","personer","jorden","vej","taler","ende","Kvinder","ansigt","stor","nogen","vores","fem","opkald","Hej","taler","lav","sige","str�m","hvorn�r","m�ske","lytter","person","timer","onkel","selvom","io","kun","sagde","i det mindste","de vil have","ingen","n�r ved","lille","vi skal","Cree","give mig","f�lge efter","bil","fire","forlade","Mange","samme","jeg laver","parat","det betyder","kaptajn","klasse","n�","l�ge","nok","drikke","at leve","ung","at arbejde","b�g","ned","havde","f�rst","store","retf�rdig","t�nke","samme","t�ve","spise","beh�ver at","Jeg ved","jeg var","Nogle","Hop ind","st�rk","nummer","Frk","At d�","Nok","give","temmelig","elsker","bag","sige","sv�rt","�st","kan","punkt","kom","s�ster","s�nner","s�m","endelige","skole","jeg kunne","landsby","lave","blod","m�neder","bil","spil","finde","virkelighed","Legeme","h�jere","sidst","de var","resterne","okay","fred","Fort�l mig","Vend tilbage","gjorde","havde","alene","lave","v�k","K�re","jeg vil g�","skyld","d�rlig","piger","mad","Dollars","dr","de ved","let","h�j","muligt","forbandet","s�vn","du burde","for pokker","sp�rgsm�l","ogs� selvom","parti","ingen af dem","seng","langt","medium","bekymre","Oh","telefon","fort�lle","ei","om","udstyr","ord","hvor meget","fjols","�st","lys","jeg havde","Land","sekund","K�re","Devils","du g�r","g� glip af","mulighed","dr�be","nogle","venter","vi beh�ver","hvor","at se dig","vil v�re","jeg kommer","du var","var","seks","har","fjerde","himmel","i live","hukommelse","undskyld","mangel","lille","�re","tro p�","John","jeg tror","er","vente","du mangler","her","film","ogs�","mand","hund","generel","Gade","Nemlig","konge","for�ldre","liste","der vil v�re","v�relse","fanden","t�nkning","par","brand","pige","f�lge efter","musik","gav","der ville v�re","en masse","Han passerede","f�lelse","Jeg vil sige","kan du","uden for","du siger","ia","mine","d�de","det gav","kaffe","Du forst�r","vores","t�nke","det","b�rer","han var","seneste","ordsprog","stor","websted","Bestil","s�ger","baby","hold k�ft","vender tilbage","Aldrig","minut","v�ben","rejse","kun","drenge","faret vild","at lege","ti","vi ser","terning","vi ved","tusind","resten","smag","v�rst","forlade","donkraft","De var","bestille","g�r","lave om","m�rkelig","fattige","t�j","vi vil have","kontor","hvis ikke","mode","opst�r","dreng","Andet","vilje","ledig","ved godt","t�nke","Formand","s�rlig","ig�raftes","millioner","om","h�jre","sort","her","herrer","uger","ord","lede efter","sikker","H�jre","foran","vi laver","v�re","bag","Markedsbod","aff�re","varede","sker","at ringe","undskyld","mund","Opm�rksomhed","Se","v�ben","over","fik pokkers","d�rlig","tage med","Hvilken en","had","Hospital","b�r","dr�m","vil have","hvile","jeg opkald","at tabe","hedder","Perfekt","jeg vil v�re","rolige","york","sikkerhed","Hj�lp","Han havde","lang","smerte","sandsynligvis","I g�r","Fort�l ham","pr�ve","v�sen","p�n","Husk","lave","�gte","du vil se","fantastiske","jeg kunne godt t�nke mig","narre","ganske enkelt","Lad os g�","ville g�re","sp�rgsm�l","luft","kendt","kraft","brev","behandling","plan","at","se ham","sulten","vendt","Start","landskabet","lige","tale","liv","skib","Hotel","placere","gruppe","tanke","Sol","af dine","passere","joe","stemme","bad","brug","f�","forn�jelse","ankom","fort�lle dig","professor","nyheder","klagesang","fort�lle","hvid","Bliv","jeg var","fod","anda","Vente","alder","hemmelighed","vi kunne","Selskab","tog","Husk","efter","Sid ned","siv","udsigt","smuk","del","vi skulle","synes godt om","betale","george","fremtid","stilhed","f�les","l�ge","l�rer","vil have","jeg ankommer","helt vildt","lave om","�ben","Salt","styring","sj�lden","kjoler","k�reste","forskellige","umulig","jeg","ven","med det samme","opkald","give","venstre","m�ned","jeg er if�rt","fly","h�r","det","fejl","vilje","vil have","egen","f�lge","vinde","lov","smerte","guld","ti","f�rdig","forbande","officiel","situation","g�re ondt","du f�ler","det er underforst�et","�nske","sind","h�r","at k�be","d�d","tanke","Giv ham","Dum","Han sagde","f�rdig","David","det lyder","halvt","hest","snigmorder","han s�","Undskyld mig","de","arbejder","vidunderlig","bord","sjov","top","N�ste","g�r ind i","Tom","hav","syv","imod","k�n","elsker","venlige","besked","Information","dragt","sj�l","fundet","oberst","Forts�t","helgen","Aftensmad","jeg fandt","charlie","du vil have","aldre","egen","r�v","S�","indend�rs","sang","regering","Sam","frygt","�bner","de sagde","du var","halvt","du giver","vi var","Det ville","Jeg giver","du","kold","Foto","ulykke","h�jre","arbejder","g�","centrum","n�dvendig","se","smuk","F�r","forf�rdeligt","jeg kunne","l�jtnant","M�ne","venstre","Du","jeg giver","service","opkald","normal","sammen","butik","jul","retning","mormor","rundt om","kom","jeg vil have","frihed","kommer ud","linje","advokat","f�dder","�re","fors�ger","at vende tilbage","jeg taler","gammel dame","papir","f�rdig","venstre","jeg sv�rger","smuk","s�d","f�le","starten","interessant","boks","nogen som helst","otte","forf�rdelig","svar","hunhund","sjov","s","bringer","personlig","han dr�bte","fuldst�ndig","paul","de kommer","er","ankommer","bedstefar","du har","nuttet","vi vil have","Michael","dele","f�ngsel","der var","system","nuttet","direkt�r","g�r det","de lavede","tante","S�g","Don","lav","kunne","Sundhed","parat","aftale","havde","forretning","typer","kamera","agent","du vil se","helvede","til stede","flod","igennem","k�d","helt","Fort�l mig","etage","mand","h�re","harry","sergent","forlade","dine","begge to","at drikke","berolige","kjole","undtagen","at","rigtigt","affald","etage","race","f�dselsdag"};
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
			if(Inventory.contains(2140)||Inventory.contains(2138)){
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
			
		case GETTOOLS:
			AltTask = false;
			ChopTree(1, "Tree");
			log(ChoppingComplete);
			Walking.walk(new Tile(2969, 3217));
			sleep(4000);
			ClosestDoor("Door");
			sleep(4000);
			Walking.walk(new Tile(2964, 3213));
			sleep(4000);
			GroundItem pick = GroundItems.closest(groundItem -> groundItem != null && Arrays.asList(lootList).contains(groundItem.getName()));
			pick.interact("Take");
			sleep(4000);
			ClosestDoor("Door");
			sleep(4000);
			Walking.walk(new Tile(2952, 3214));
			sleep(8000);
			Walking.walk(new Tile(2949, 3217));
			sleep(3000);
			break;
		
		case BUYGOODS:
			log("buying goods");
			BuyTinderbox();
			if(Inventory.contains(Tinderbox)) {
				Walking.walk(new Tile(2955, 3229));
				sleep(200);
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
		TOSTOREROOM, FROMLUMBY, GETTOOLS, BUYGOODS, CHOPOAKS, BURNMOVE, BURN
	}
	
	//Checks if a certain condition is met, then return that state.
	private State getState() {
		if(LumbyCastle.contains(getLocalPlayer())&&LumbywalkDone==false){
			state = State.FROMLUMBY;
			
		}else if(storeroom.contains(getLocalPlayer())&& !Inventory.isFull()){
			state = State.LOOT;
			
		}else if(Wydin.contains(getLocalPlayer())&&AfterCooking == false&&Inventory.isFull()){
			state = State.WYDINEXIT;
			
		}else if(getLocalPlayer().getTile().distance(Door1Enter)<2&&AfterCooking == false&&Door1Entered == false) {
			state = State.ENTERDOOR1;
			
		}else if(getLocalPlayer().getTile().distance(Door2Enter)<2&&AfterCooking == false) {
			state = State.ENTERDOOR2;
			
		}else if(Range.contains(getLocalPlayer())&&CookingCount<3&&AfterCooking == false) {
			state = State.COOKING;
			
		}else if(Range.contains(getLocalPlayer())&&AfterCooking == true) {
			state = State.EXITDOOR2;
			
		}else if(getLocalPlayer().getTile().distance(Door1Exit)<2&&AfterCooking == true) {
			state = State.EXITDOOR1;
			
		}else if(Bank.contains(getLocalPlayer())&&AfterCooking == true&&Inventory.isFull()){
			state = State.BANKING;
			
		}else if (Bank.contains(getLocalPlayer())&&!Inventory.isFull()) {
			state = State.RETURNING;
			
		}else if(Wydin.contains(getLocalPlayer())&&AfterCooking == true&&!Inventory.isFull()){
			state = State.TOSTOREROOM;
			
		}else if(storeroom.contains(getLocalPlayer())&&Inventory.isFull()) {
			state = State.LEAVINGSTOREROOM;
			
		}else if (Rimmington.contains(getLocalPlayer())&AltTask == true) {
			state = State.GETTOOLS;
			
		}else if (GeneralStore.contains(getLocalPlayer())&& !Inventory.contains(Tinderbox)) {
			state = State.BUYGOODS;
			
		}else if (OakTrees.contains(getLocalPlayer())&& !Inventory.isFull()&&Inventory.contains(Tinderbox)) {
			state = State.CHOPOAKS;
			
		}else if (OakTrees.contains(getLocalPlayer())&& Inventory.isFull() && Inventory.contains(OakLogs)) {
			state = State.BURNMOVE;
			
		}else if (BurnStart.contains(getLocalPlayer())&& Inventory.contains(OakLogs)) {
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
			if (Dialogues.inDialogue()&&DialogOpen==true) {
				Keyboard.type("1",false);
				DialogOpen = false;
				sleep(100);
			}else {
				GameObject crates = GameObjects.getTopObjectOnTile(new Tile(3009,3209));
				if(crates != null && crates.hasAction("Search")){
					//log("searching crate");
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
		/*if(!Inventory.contains(2140,2138)){
			log("inv filled with burnts");
			AfterCooking = true;
		}else {*/
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
	//}
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
    	if(randomNum(1,2)<19) {
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
    	}else {
    		AltTask = true; 
    		WalktoRimmington();
    	}
    }
    
    private void toStoreroom(String nameofObject1) {
    	GameObject door = GameObjects.getTopObjectOnTile(StoreroomDoor);
    	if(door != null && door.hasAction("Open")){
        	log("click on door1");
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
				log("click logs");
				sleep(200);
				Inventory.interact(Tinderbox, "Use");
				sleep(randomNum(100, 120));
				Inventory.interact(OakLogs, "Use");
				sleep(randomNum(900, 1200));
			}
		}
		sleep(400);
		Inventory.interact("Bronze pickaxe", "Drop");
		sleep(150);
		Inventory.interact(Tinderbox, "Drop");
		sleep(150);
    	for(int i = 0; i < pathFromRimmintgon.length; i++) {
			while(getLocalPlayer().getTile().distance(pathFromRimmintgon[i])>3) {
				if(!getLocalPlayer().isMoving()) {
					log("on step" + i);
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
			while(getLocalPlayer().getTile().distance(pathtoRimmintgon[i])>3) {
				if(!getLocalPlayer().isMoving()) {
					log("on step" + i);
					Walking.walk(pathtoRimmintgon[i]);
					sleep(randomNum(1000, 2000));
				}
			}
		}
  
    }
	
	public int randomNum(int i, int k) {
		int num = (int)(Math.random() * (k - i + 1)) + i;
		return num;
	}

}
