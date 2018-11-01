class Priemgetallen{

   public static void main (String[] args) {		
       int i =0;
       int num =0;
       
       String  priemgetallen = "";

       for (i = 1; i <= 1000; i++) { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--) {
             if(i%num==0) {
 		counter = counter + 1;
	     }
	  }
		
	 
	 if (priem =true) {
	     //priemgetal toevoegen aan de string
	     priemgetallen = priemgetallen + i + " ";
	  }	
       }
	
       System.out.println("Priemgetallen van 1 tot en met 1000 zijn: \n" + priemgetallen);
     

  
} // sluit main
	static boolean priem (int year){	
				
				if (counter ==2){
					return true;
				} else {
					return false;
				} // sluit if else
} //sluit class


// als een getal alleen maar 2 keer deelbaar is door alle getallen die even groot zijn tot aan 0,
// dan was het alleen deelbaar door zichzelf en door 1. Als de counter 2 is, is het een priemgetal.
// deelbaar houdt in % == 0
// 1e  iteratie bv 5/5, dan 5/4, 5/3, 5/2, 5/1. Alleen 5/5 en 5/1 geven % ==0, dus tweemaal counter+1.