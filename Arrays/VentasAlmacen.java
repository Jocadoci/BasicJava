import java.io.*;

// Sells of a Warehouse with their mean.
class VentasAlmacen{
  public static void main (String arg[]){

    double acum=0; 
    double a[]= new double[10];
    for (int i=0;i<10;i++){
      System.out.println("Enter the sells of the Warehouse "+(i+1));
      a[i]=Lectura.readDouble();
      acum+=a[i];
    }
      
    double media=acum/10;
    System.out.println("Warehouse\t\t\tSells");
      
    for (int i=0;i<10;i++)
      System.out.println((i+1)+"\t\t\t$"+a[i]);
       
      System.out.println("Mean of the sells\t\t\t$"+media);
      System.out.println("\tWarehouse that were high\n\tthat the mean.");
      System.out.println("Warehouse\t\t\tSells");
      
      for (int i=0;i<10;i++)
         if (a[i]>media)
          System.out.println((i+1)+"\t\t\t$"+a[i]);
  }
}      
      
    
    
   