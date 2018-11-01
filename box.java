import java.util.*;

class Box{

    public static void main(String[] args) { 
        char ch = 'a'; 
  
        // Autoboxing: primitive to Character 
        Character a = ch; 
  
       	System.out.println(ch);
        System.out.println(a); 

	byte myByte = 0;
    	int myInt = 50;

   	myByte = (byte)myInt;
    	System.out.println("Value of myByte = "+ myByte);
		

	} // sluit main

} // sluit class