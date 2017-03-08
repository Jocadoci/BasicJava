import java.io.*;

// Addition of bidimensional arrays.
class SumaArreglosBI{
  public static void main(String arg[]){

    System.out.println("Enter the amount of rows.");
    int m=Lectura.readInt();
    System.out.println("Enter the amount of columns.");
    int n=Lectura.readInt();

    int a[][]= new int[m][n];
    int b[][]= new int[m][n];
    int c[][]= new int[m][n];

    for(int i=0;i<m;i++)
       for(int j=0;j<n;j++){
          System.out.println("Set the value of the array A in the position: "+(i+1)+","+(j+1));
          a[i][j]=Lectura.readInt();
          System.out.println("Set the value of the array B in the position: "+(i+1)+","+(j+1));
          b[i][j]=Lectura.readInt();
          c[i][j]=a[i][j]+b[i][j];
       }
       
        for(int i=0;i<m;i++){
           for(int j=0;j<n;j++)
              System.out.println("The values of the array C is:\n"+c[i][j]+"\t");
              System.out.println("\n");
        } 
      
   }
} 