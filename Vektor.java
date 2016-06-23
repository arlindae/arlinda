import java.util.*;

public class Vektor {

   public static void main(String args[]) {
      // Madh�sia fillestar �sht� 3, rritja �sht� 2
      Vector v = new Vector(3, 2);
		
      System.out.println("Madh�sia fillestare: " + v.size());
		
      System.out.println("Kapaciteti fillestar: " +
      v.capacity());
		
         v.addElement(new Integer(1));
			
         v.addElement(new Integer(2));
				 
         v.addElement(new Integer(3));
					 
         v.addElement(new Integer(4));
						 
         System.out.println("Kapaciteti pas kat�r shtesave: " + v.capacity());

      v.addElement(new Double(5.45));
		
      System.out.println("Kapaciteti aktual: " +
      v.capacity());
		
        v.addElement(new Double(6.08));
		  
            v.addElement(new Integer(7));
				
              System.out.println("Kapaciteti aktual: " +  v.capacity());
				  
         v.addElement(new Float(9.4));
			
      v.addElement(new Integer(10));
		
      System.out.println("Kapaciteti aktual: " + v.capacity());
		
      v.addElement(new Integer(11));
		
      v.addElement(new Integer(12));
		
      System.out.println("Elementi i pare: " + (Integer)v.firstElement());
		
      System.out.println("elementi i funditt: " +(Integer)v.lastElement());
		
      if(v.contains(new Integer(3)))
		
         System.out.println("Vektori permban 3.");
			
      // num�roj elementet n� vektor.
		
      Enumeration vEnum = v.elements();
		
      System.out.println("\nElementet ne vektor:");
		
      while(vEnum.hasMoreElements())
		
         System.out.print(vEnum.nextElement() + " ");
			
      System.out.println();
   }
}