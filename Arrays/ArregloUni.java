import java.io.*;

// Even and odd arrays indentificator.
class ArregloUni{
  public static void main(String arg[]){


    int a[]= new int [20];
    int b[]= new int [20];
    char c[]= new char[20];
    
    for (int i=0;i<20;i++){
    
      System.out.println("Set the value of the array A in the position: "+i);
      a[i]=Lectura.readInt();
      System.out.println("Set the value of the array B in the position: "+i);
      b[i]=Lectura.readInt(); 
      
      if(a[i]%2==0 && b[i]%2==0)
        c[i]='P';
      
      else
       if(a[i]%2!=0 && b[i]%2!=0)
        c[i]='I';
        else
          c[i]='N';
     
    }
    
    for(int i=0;i>20;i++)
      System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]);
   
   } 
}   