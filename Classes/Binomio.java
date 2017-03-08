import java.io.*;

// Basic usage of classes. Binomio numbers, calling Euler class.
class Binomio { 
  public static void main(String arg[]) {
   
    int n = Binomio.leern();
    int m = Binomio.leerm();
    double res = Binomio.calcularSerie(m,n);
    SerieEuler.desplegar(res);
  
  }
     
  public static int  leerm() {
       
    System.out.println("Enter the value m");
    int m = Lectura.readInt();
    return m;
  
  }
       
  public static int  leern() {
       
    System.out.println("Enter the value n");
    int n = Lectura.readInt();
    return n;
  
  }  
     
  public static double calcularSerie(int m, int n) { 
          
    if(m==0)
      m = 1;
          
      int mn=(m-n); 
      double res = SerieEuler.factorial(m)/(SerieEuler.factorial(n)*SerieEuler.factorial(mn));
      return res;
      
  }
}  
 
 

 
  

     