import java.io.*;
import java.text.*;

// Loops activities.
class Codificacion {
  public static void main(String arg[]){
    DecimalFormat cc = new DecimalFormat("0.00");

    // 1) Show the total of interest for each year's deposit. 
    System.out.println("Enter the deposit's amount.");
    float deposito = Lectura.readFloat();
    System.out.println("Enter the year's deposit.");
    int a = Lectura.readInt();
    System.out.println("Enter the interest for year.");
    float inte = Lectura.readFloat();

    System.out.println(" ");
    int c=0;

    while(c!=a) {
      float total = deposito + (deposito*(inte/100));
      deposito = total;

      System.out.println(cc.format(total));

      c++; 
    }


    // 2) Print the sticker require.   
    System.out.println("Enter the class's code.");
    int clase = Lectura.readInt();
    System.out.println("Enter the professor's name.");
    String profesor = Lectura.readString();
    System.out.println("Enter the section's number.");
    int seccion = Lectura.readInt();
    System.out.println("Classroom number.");
    int aula = Lectura.readInt();
    System.out.println("Enter the number of students.");
    int inscritos = Lectura.readInt();

    int c = 0; 

    do {
      System.out.println("\tMy name is: \n\tClassroom:"+aula+"\n\tTeacher: "+profesor+"\n\tCourse:"+clase+" Section: "+seccion+"\n");
      c++; 

    } while(c!=(inscritos+1));

    // 3) Stickers that show the number of boxes sent.
    System.out.println("Ingrese los siguientes datos:");
    System.out.println("Title desire.");
    String titulo = Lectura.readString();
    System.out.println("Name/s:");
    String nombre = Lectura.readString();
    System.out.println("Last Name:");
    String apellido = Lectura.readString();
    System.out.println("Street:");
    String calle = Lectura.readString();
    System.out.println("City:");
    String ciudad = Lectura.readString();
    System.out.println("State:");
    String estado = Lectura.readString();
    System.out.println("Boxes:");
    int cajas = Lectura.readInt();

    int c = 1;

    while(c!=cajas+1) {
    System.out.println("\tBoxes "+c+" of "+cajas+"\nTitle: "+titulo+"\nName: "+apellido+" "+nombre+"\nStreet: "+calle+" City: "+ciudad+" State:"+estado+"\n");
    c++;

    }

    System.out.println("The total of boxes are: "+cajas);		

  }
}