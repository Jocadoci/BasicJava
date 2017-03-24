import java.io.*;

// A simple example of inverting the order of a serie of numbers.
// Like 78945 to 54987
class Matricula{
	public static void main(String arg[]){

		System.out.println("Ingrese su matricula por favor.");
		int x = Lectura.readInt();

		int x1 = x%10;
		System.out.print(x1);
		int x2 = (x%100)/10;
		System.out.print(x2);
		int x3 = (x%1000)/100;
		System.out.print(x3);
		int x4 = x/1000;
		System.out.print(x4); 
	}
}
