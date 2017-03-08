import java.io.*;

// Basic usage of classes. Euler's serie.
class SerieEuler {

  public static void main(String arg[]) {
    
    int n = SerieEuler.leerLimite();
    double suma = SerieEuler.calcularSerie(n);
    SerieEuler.desplegar();
  
  }
       
  public static int  leerLimite() {
       
    System.out.println("Enter de value desire to calculate.");
    int n = Lectura.readInt();

    return n;
  
  }
       
  public static double calcularSerie(int n) {
    double suma = 1;
        
    for(int i=1;i<=n;i++) 
    suma+=1.0/SerieEuler.factorial(i);
         
    return suma; 
  
  }
       
  public static int factorial(int i) {
        
    int fact = 1;
        
    for(int j=1;j<=i;j++)
    fact*=j;

    return fact;
  
  }
       
  public static void desplegar(double suma) {
        
    System.out.println("Serie Euler = "+suma);
  
  }
}
           