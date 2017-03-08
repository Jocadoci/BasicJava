import java.io.*;

// Classes usage. Calculation of areas.
class Geometrias {
  public static void main (String arg[]) {  

    byte op = 0;

    do {
      System.out.println("\n\tCalculate area.\n\n1. Circle\n2. Square\n3. Rectangle\n4. Triangle\n5. Exit\n\nOption:");
      op = Lectura.readByte();
        
      switch (op) {
        case 1: Geometrias.calcularACirculo(); break;
        case 2: Geometrias.calcularACuadrado(); break;
        case 3: Geometrias.calcularARectangulo(); break;
        case 4: Geometrias.calcularATriangulo(); break;
      }
       
    }while(op!=5); 
  }
  
  public static void imprimir(double area) {
       
    System.out.println("The area is: "+area);
       
  } 

  public static void calcularACirculo() { 

    System.out.println("Enter the radius.");
    double r = Lectura.readDouble();
    double area = Math.pow(r,2);
     
    Geometrias.imprimir(area);
  }

  public static void calcularACuadrado() { 
   
    System.out.println("Enter side.");
    double l = Lectura.readDouble();
    double area = l * l;
     
    Geometrias.imprimir(area);
  } 
    
  public static void calcularARectangulo() { 
   
    System.out.println("Enter base.");
    double b = Lectura.readDouble();
    System.out.println("Enter height.");
    double h = Lectura.readDouble();
    double area = b * h;
      
    Geometrias.imprimir(area);
  }

  public static void calcularATriangulo() { 
   
    System.out.println("Enter base.");
    double b = Lectura.readDouble();
    System.out.println("Enter height.");
    double h = Lectura.readDouble();
    double area = (b * h)/2;
      
    Geometrias.imprimir(area);
  }   
      
}  