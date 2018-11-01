class Dagen{

	public static void main (String [] args){
	
		Week vandaag = Week.DINSDAG;
				
	switch(vandaag){
		case MAANDAG:  System.out.println("Maandag: de week is weer begonnen.");
		break;
		case DINSDAG:  System.out.println("Dinsdag: de file viel vandaag niet mee!");
		break;
		case WOENSDAG: System.out.println("Woensdag: De week is doormidden");
		break;
		case DONDERDAG: System.out.println("Donderdag, thuisstudie");
		break;
		case VRIJDAG:  System.out.println("Vrijdag: Stel je laatste vragen voor je huiswerkopdracht!");
		break;
		case ZATERDAG:  System.out.println("Zaterdag: Lekker weekend, maar wel werken hoor!");
		break;
		case ZONDAG: System.out.println("Zondag: Lekker weekend, ook even ontspannen.");
		break;

		default: System.out.println("een andere dag");
	} // sluit switch

	} // sluit main


	public enum Week {
		MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG, ZONDAG
	} // sluit enum

} // sluit class