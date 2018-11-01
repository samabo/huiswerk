import java.util.Scanner;

class Landen{

	public static void main (String[] args){
	
	Scanner scanner = new Scanner(System.in);
	String valutaEU = "Euro";
	String valutaVS = "US Dollar";
	String valutaBR = "Braziliaanse Real";
	
		game:			// label van de loop
		for(int a = 0; a<1000; a++) {		// hier begint de loop, je kunt 1000 keer spelen.
			System.out.println("Voer een van de volgende landcodes in: NL / BE / DE / FR / BR / VS, of typ STOP om het programma te verlaten.");
		
		String invoer = scanner.next();
		String code = invoer.toUpperCase();		// maakt van evt invoer nl  -> NL
	
			switch (code){	
				case "NL":
			System.out.println(code + " = Nederland, valuta: "+ valutaEU);
				break;
			case "BE":
				System.out.println(code + " = België, valuta: "+ valutaEU);
				break;
			case "DE":
				System.out.println(code + " = Duitsland, valuta: "+ valutaEU);
				break;
			case "FR":
				System.out.println(code + " = Frankrijk, valuta: "+ valutaEU);
				break;
			case "BR":
				System.out.println(code + " = Brazilië, valuta: "+ valutaBR);
				break;
			case "VS":
				System.out.println(code + " = de Verenigde Staten, valuta: "+ valutaVS);
				break;
			case "STOP": 
				System.out.println("U heeft het programma verlaten. Tot ziens!");
				break game;
			default:
				System.out.println("Deze code is onbekend. Probeer het opnieuw.");
		
			} // sluit switch
		} // sluit for loop
	} // sluit main
} // sluit class
