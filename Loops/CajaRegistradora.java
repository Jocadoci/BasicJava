import java.io.*;
import java.text.*;

// Cash register function. Using while statements.
class CajaRegistradora {
  public static void main (String args[]){
    DecimalFormat cc = new DecimalFormat("0.00");

    double total = 0;

    int c = 1;
    while (c == 1) {    
      System.out.println("Enter the unitary price of the product.");
      float producto = Lectura.readFloat();
      System.out.println("Enter the quantity of this product.");
      int cant = Lectura.readInt();

      total = total + (cant*producto);   

      System.out.println("Do you want to enter another product?\n[1 for Yes or 2 for No]");
      int c1 = Lectura.readInt();
      c = c1;  
    }     

    System.out.println("Enter the amount with which you are going to pay.");
    float ef = Lectura.readFloat();

    while (ef<total) { 
      System.out.println("Insufficient amount.");
      System.out.println("Enter the amount with which you are going to pay.");
      float ef1 = Lectura.readFloat();
      ef = ef1;
    }  

    double sobrante = ef - total; 

    System.out.println("The total to pay is: $"+total);
    System.out.println("Your change: $"+cc.format(sobrante));    


  }
} 