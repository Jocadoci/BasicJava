import java.io.*;

// Classes usage with arrays.
class Encuesta{  
      
  public static void main(String arg[]){
    String nom[] = new String [5];
    nom = Encuesta.LlenarNombres();

    String inte[] = new String [4];
    inte = Encuesta.LlenarMoneda();

    int check[][] = new int [5][4];
    check = Encuesta.LlenarDinero(nom,inte);

    Encuesta.CalcularTotal (nom,inte,check);
  }

  public static String[]LlenarNombres(){
    String nom[] = new String [5];

    for (int i=0; i<5; i++){
      System.out.println("Enter the name of the service.");
      nom[i] = Lectura.readString();
    }

    return nom;
  }
      
  public static String[]LlenarMoneda(){
    String inte[] = new String [4];

    for (int i=0; i<4; i++){
      System.out.println("Enter the interest level. ");
      inte[i] = Lectura.readString();
    }

    return inte;
  }
      
      
  public static int[][] LlenarDinero(String nom[],String inte[]){
    int  check[][] = new int  [5][4];
    int res = 0;

    for (int r=0;r<3;r++){  
      for (int j=0;j<5;j++){

          System.out.println("How much are you interested "+nom[j]+"?");

          for (int k=0;k<4;k++){
              System.out.println(inte[k]);
              res = Lectura.readInt();

              if (res==1)
                check [j][k]= check [j][k]+1;

              }
          }
      }
      return check;
  }
      
  public static void CalcularTotal(String nom[],String inte[],int check [][]){
    for (int j=0;j<5;j++){
      System.out.println(nom[j]+" has: ");

      for (int k=0;k<4;k++){
        System.out.println("In "+inte[k]);
        System.out.println("A total of:" +check [j][k]);
      }
    }
      
  }
      
}
