import java.io.*;
import java.lang.NumberFormatException;

public class FactorialIterativa {
private int numero;
private int factorial;

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

public FactorialIterativa() {
numero = 0;
factorial = 1;
}

public void ingresarNumero() throws IOException, NumberFormatException{
try {
System.out.print("\nIngrese el numero factorial: ");
numero = Integer.valueOf(al.readLine()).intValue();
}
catch(NumberFormatException e) {
System.out.println("\n\n" + e + "\n\n");
}
}

public void numeroFactorial() {
int i = 1;
while(i <= numero){
factorial *= i;
i++;
}
}

public void imprimirFactorial() {
System.out.println("El numero factorial de " + numero + "! es: " + factorial);
}

/*public static void main(String[] args) throws IOException, NumberFormatException{
FactorialIterativa obj1 = new FactorialIterativa();
obj1.ingresarNumero();
obj1.numeroFactorial();
obj1.imprimirFactorial();
}*/

}