import java.io.*;

class Encuentra {
   public static void main (String arg[]){
    
    // ------------------------------------------------------ 
    // Arrays that indentified the total amount of numbers, positivies, negatives and zeros.
     int neg=0; 
     int pos=0; 
     int ceros=0;

     System.out.println("Enter the dimension wanted.");
     int x=Lectura.readInt();
     int a[]=new int[x];
     
      for(int i=0;i<x;i++){
         System.out.println("Enter the number in position: "+(i+1));
         a[i]=Lectura.readInt(); 
       }
       
       for(int i=0;i<x;i++){   
        
        if(a[i]<0)
           neg+=1;
           if(a[i]==0)
              ceros+=1; 
         else
          pos+=1; 
       }

     System.out.println("\nThe total:\nPositives: "+pos+"\nNegatives: "+neg+"\nZeros: "+ceros);
    
     // ------------------------------------------------------
     // The addition of two requested array into another array.
     System.out.println("Enter the dimension wanted for the arrays.");
     int x=Lectura.readInt();
     int a[]=new int [x];
     int b[]=new int [x];
     int c[]=new int [x];
     
      for(int i=0;i<x;i++){
       System.out.println("Set the value of the array A in the position: "+(i+1));
       a[i]=Lectura.readInt();
       System.out.println("Set the value of the array B in the position: "+(i+1));
       b[i]=Lectura.readInt();

       c[i]=a[i]+b[i];
      }
      
      System.out.print("Arrays:\nA[]: { ");  
      for(int i=0;i<x;i++){
        System.out.print(a[i]+" ");
      } 
       System.out.print("}\nB[]: { ");  
      for(int i=0;i<x;i++){
        System.out.print(b[i]+" ");
      }
       System.out.print("}\nC[]: { ");  
      for(int i=0;i<x;i++){
        System.out.print(c[i]+" ");
      }
       System.out.println("}");  
   
     // ------------------------------------------------------
     // Register expenses from everyday and give you a total from days and week.
     int n=0;
     int a[]=new int[7];
     
      while(n!=2){
         System.out.println("Enter the day wanted to register.");
         String dia=Lectura.readString();
         
         switch(dia){
            case "monday":System.out.println("Enter expenses:");
                         float gastos=Lectura.readFloat();
                         a[0]+=gastos; break;
            case "tuesday":System.out.println("Enter expenses:");
                          gastos=Lectura.readFloat();
                          a[1]+=gastos; break;
            case "wednesday":System.out.println("Enter expenses:");
                             gastos=Lectura.readFloat();
                             a[2]+=gastos; break;
            case "thursday":System.out.println("Enter expenses:");
                          gastos=Lectura.readFloat();
                          a[3]+=gastos; break;
            case "friday":System.out.println("Enter expenses:");
                           gastos=Lectura.readFloat();
                           a[4]+=gastos; break;
            case "saturday":System.out.println("Enter expenses:");
                          gastos=Lectura.readFloat();
                          a[5]+=gastos; break;
            case "sunday":System.out.println("Enter expenses:");
                           gastos=Lectura.readFloat();
                           a[6]+=gastos; break;                                                                                             
         }
         
        System.out.println("Do you want to continue?\n[1 for Yes or 2 for No]");
        int z=Lectura.readInt();
        n=z; 
      }
      
      int total=0;
      for(int i=0;i<7;i++){
       total+=a[i];
      }
      
      System.out.println("Monday: $"+a[0]+"\nTuesday: $"+a[1]+"\nWednesday: $"+a[2]+"\nThursday: $"+a[3]+"\nFriday: $"+a[4]+"\nSaturday: $"+a[5]+"\nSunday: $"+a[6]+"\nTotal: $"+total); 
    
   }
}

