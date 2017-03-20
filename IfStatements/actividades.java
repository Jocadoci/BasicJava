import java.io.*;
import java.text.*;

// Ifs statements. Switchs. Loops exercises.
class actividades {

  public static void main (String args[]) {

    DecimalFormat cc = new DecimalFormat("0.00");

    // 1) Ask three califications and give average.
    System.out.println("Enter the first calification.");
    float c1 = Lectura.readFloat();
    System.out.println("Enter the second calification.");
    float c2 = Lectura.readFloat();
    System.out.println("Enter the third calification.");
    float c3 = Lectura.readFloat();

    double calif = (c1 + c2 + c3)/3.00;

    if (calif>=100)
      System.out.println("Your grade is: A");
    else
      if (calif>=80)
        System.out.println("Your grade is: B");
      else
        if (calif>=70)
          System.out.println("Your grade is: C");
        else
          if (calif>=60)
            System.out.println("Your grade is: D");
          else
            System.out.println("Your grade is: F");*/

    // 2) Show contamination's status along a set value.
    System.out.println("Enter the contamintaion registered.");
    int cont = Lectura.readInt();

    if (cont<35)
      System.out.println("The contamination is: Pleasant.");
    else
      if (cont <= 60)
        System.out.println("The contamintion is: Unpleasant." );
      else
        System.out.println("The contamination is: Dangerous.");*/ 

    // 3) Bills depending of months and taxes.
    System.out.println("Enter the cubic meters of last month.");
    int mesAnterior = Lectura.readInt();
    System.out.println("Enter the cubic meters of the actual month.");
    int mesActual = Lectura.readInt();

    int gasConsumido = mesAnterior + mesActual;

    if (gasConsumido<=60)
      System.out.println("The bill is: $15"); 
    else
      if (gasConsumido<=160){
        double factura = 15 + ((gasConsumido-60) * 0.5); 
        System.out.println("The bill is: $"+factura);
      } 
      else
        if (gasConsumido<=260){
          double factura = 15 + 100*0.5 + ((gasConsumido-160)*0.025);
          System.out.println("The bill is: $"+factura);
        }
        else
          if (gasConsumido>260){
            double factura = 15 + 100*0.5 + 100*0.025 + ((gasConsumido-260)*0.015);
            System.out.println("The bill is:: $"+factura);
          }

    // 4) Register and show total on products boughts.
    int x = 1;

    while(x==1){
      System.out.println("Enter the product's number.");
      int nP = Lectura.readInt();
      System.out.println("Enter the amount of products.");
      float pU = Lectura.readFloat();

      double cuentaT = 0;

      switch(nP){
        case 10: cuentaT = pU * 24.30;break;
        case 20: cuentaT = pU * 105; break;
        case 30: cuentaT = pU * 10.35; break;
        case 40: cuentaT = pU * 200; break;
      }

      if (cuentaT >= 1000){
        double T = cuentaT-(cuentaT*0.02);
        System.out.println("You earn a discount for your shop!! and the total is: $"+cc.format(T));
      }
      else
        if (cuentaT>=800 && cuentaT<=999.99){
          double T = cuentaT-(cuentaT*0.01);
          System.out.println("You earn a discount for your shop!! and the total is: $"+cc.format(T));
        }
        else
          System.out.println("Your bill is: $"+cc.format(cuentaT));

      System.out.println("\nDo you want to continue?\n[1 = Yes / 2 = No]");
      int y = Lectura.readInt();
      x = y;   
    }

    // 5) Mostrar los dias de descanso dependiendo de tipo de empleado que sea.
    System.out.println("Enter the type of employee.");
    char tipo = Lectura.readChar();
    System.out.println("Enter the years worked.");
    int a = Lectura.readInt();

    if ( tipo!='Q' && tipo!='R' && tipo!='L')
      System.out.println("You don not have vacations.");
    else 
      switch(tipo){
        case 'Q': System.out.println("You have seven days of vacations.");break;
        case 'R': System.out.println("You have 21 days of vacations.");break;
      }
    // This if statements could be a switch-case.
    if (tipo=='L' && a<=6)
      System.out.println("You have 20 days of vacations.");
    else
      if(tipo=='L' && a>6)
        System.out.println("You have 25 days of vacations.");

    // 6) Which number is the greatest.
    System.out.println("Enter the first number.");
    int n1 = Lectura.readInt();
    System.out.println("Enter the second number.");
    int n2 = Lectura.readInt();
    System.out.println("Enter the third number.");
    int n3 = Lectura.readInt();

    if (n1==n2 && n1==n3)
      System.out.println("All numbers are equals.");
    else
      if(n1==n2 && n1>n3)
        System.out.println("The first two are equals and the greaters.");
      else
        if (n1==n3 && n1>n2)
          System.out.println("The first and the last are equals and the greaters.");
        else
          if (n2==n3 && n2>n1)
            System.out.println("The last two numbers are equals and the greaters.");

    if (n1 > n2 && n1 > n3)
      System.out.println("The greatest number is: "+n1);
    else
      if (n2 > n1 && n2 > n3)
        System.out.println("The greatest number is: "+n2);
      else
        System.out.println("The greatest number is: "+n3);

    // 7) Determinar las calorias que debe consumir, dependiendo de su edad, peso, sexo y actividad.
    System.out.println("Enter gender\n[M for Male and F for Female].");
    char sexo = Lectura.readChar();
    System.out.println("Enter the wieght in kg.");
    float peso = Lectura.readFloat();
    System.out.println("Enter age.");
    int edad = Lectura.readInt();
    System.out.println("Enter the kind of activity you has.\n[L = Lower, I = Intermedium or H = High]");
    char act = Lectura.readChar();

    float calorias;

    if (sexo == 'M')
      calorias = peso * 24;
    else
      calorias = peso * 21;

    if (edad < 25)
      calorias+=300;
    else
      if (edad>45)
        calorias = calorias - (((edad-45)/10)*100);

    if (act == 'I')
      calorias+=100;
    else
      if(act == 'H')
        calorias+=400; 

    System.out.println("\n"+calorias+" kcal, you need to keep your weight.");

    // 8) Calculator.
    System.out.println("Enter first number.");
    float n1 = Lectura.readFloat();
    System.out.println("Enter the operation desired.\n[*,/,+,-]");
    char ch = Lectura.readChar();
    System.out.println("Enter the second number.");
    float n2 = Lectura.readFloat();


    switch (ch){
      case '*': System.out.println(n1+" * "+n2+" = "+(n1*n2));break;
      case '/': if (n2 == 0)
                  System.out.println("Error");
                else
                  System.out.println(n1+" / "+n2+" = "+(n1/n2));break;
      case '+': System.out.println(n1+" + "+n2+" = "+(n1+n2));break;
      case '-': System.out.println(n1+" - "+n2+" = "+(n1-n2));break;
    }

  }
}