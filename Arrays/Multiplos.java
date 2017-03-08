import java.io.*;

// Find multiples for specific value.
class Multiplos{
  public static void main (String arg[]){

     int num[]=new int[50];
     
     for (int x=0;x<50;x++){
        System.out.println("Enter value: "+(x+1));
        num[x]=Lectura.readInt();
     }
     
     System.out.println("Enter the number to compare."); 
     int n=Lectura.readInt();
     
     int c=0;
     
     for (int x=0;x<50;x++){
        if(num[x]%n==0)
        c++;
     }
     
     System.out.println("The total multiples for the value: "+n+" is: "+c);
   
   }
}    