import java.io.*;

// Find the Symmetrical in a matrix
class Simetria {
 public static void main (String arg[]) {
  
  System.out.println("Enter the dimension of your matrix (NxN)");
  int n = Lectura.readInt();
  int a[][]=new int[n][n];
  
   for(int i=0;i<n;i++) {
    for(int j=0;j<n;j++) {
     System.out.println("Enter de value of the matrix in the position: "+(i+1)+"x"+(j+1));
     int x = Lectura.readInt();
     a[i][j]=x;
    }
   }
   
   int t = 0;
   for(int j=0;j<n;j++) {
    for(int i=0;i<n;i++) {
     if(a[i][j]==a[j][i])
      t++; 
    }
   }
  
  if(t==(n*n))
   System.out.println("Is symmetrical.");
   else
    System.out.println("Is not symmetrical.");
  
 }
}     