import java.io.*;

class Lectura{
public static int readInt(){
String z;
DataInputStream w = new DataInputStream(System.in);
try {
z = w.readLine();
}
catch(IOException e){z = "o";}
int z2 = Integer.parseInt(z);
return z2; 
}

public static char readChar(){
String z;
DataInputStream w = new DataInputStream(System.in);
try {
z = w.readLine();
}
catch(IOException e){z = " ";}
char z2 = z.charAt(0);
return z2; 
}

public static byte readByte(){
String z;
DataInputStream w = new DataInputStream(System.in);
try {
z = w.readLine();
}
catch(IOException e){z = "o";}
byte z2 = Byte.parseByte(z);
return z2; 
}

public static double readDouble(){
String z;
DataInputStream w = new DataInputStream(System.in);
try {
z = w.readLine();
}
catch(IOException e){z = "o";}
double z2 = Double.parseDouble(z);
return z2; 
}

public static float readFloat(){
String z;
DataInputStream w = new DataInputStream(System.in);
try {
z = w.readLine();
}
catch(IOException e){z = "o";}
float z2 = Float.parseFloat(z);
return z2; 
}

public static short readShort(){
String z;
DataInputStream w = new DataInputStream(System.in);
try {
z = w.readLine();
}
catch(IOException e){z = "o";}
short z2 = Short.parseShort(z);
return z2; 
}

public static long readLong(){
String z;
DataInputStream w = new DataInputStream(System.in);
try {
z = w.readLine();
}
catch(IOException e){z = "o";}
long z2 = Long.parseLong(z);
return z2; 
}

public static String readString(){
String z;
DataInputStream w = new DataInputStream(System.in);
try {
z = w.readLine();
}
catch(IOException e){z = "o";}
return z; 
}
}
