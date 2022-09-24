import java.io.*;
import java.lang.NumberFormatException;

public class FactorialRecursivo {

private int numero;
private int factorial;

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

public FactorialRecursivo() {
this.numero = 0;
this.factorial = 1;
}

public void ingresarNumero() throws IOException, NumberFormatException {
boolean ingresoNumero = true;
while (ingresoNumero) {
try {
System.out.print("\nIngrese un numero: ");
numero = Integer.valueOf(al.readLine()).intValue();
ingresoNumero = false;
}
catch (NumberFormatException e) {
System.out.println("\n" + e);
}
}
}

public int calcularFactorial(int factorial){
if (factorial == 0)
return 1;
else
return factorial * calcularFactorial(factorial - 1);
}

public void imprimirFactorial() {
System.out.println("El numero factorial de " + numero + "! es: " + calcularFactorial(numero));
}

}