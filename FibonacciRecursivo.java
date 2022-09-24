import java.io.*;
import java.lang.NumberFormatException;

public class FibonacciRecursivo {

private int numeroElementos;
private int fibonacci;

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

public FibonacciRecursivo() {
numeroElementos = 0;
}

public void ingresarNumeroElementos() throws IOException, NumberFormatException {
boolean ingresoNumero = true;
while (ingresoNumero) {
try {
System.out.print("\nIngrese un numero: ");
numeroElementos = Integer.valueOf(al.readLine()).intValue();
ingresoNumero = false;
}
catch (NumberFormatException e) {
System.out.println("\n" + e);
}
}
}

public int serieFibonacci(int fibonacci) {
if(fibonacci < 2)
return fibonacci;
else
return serieFibonacci(fibonacci - 1) + serieFibonacci(fibonacci - 2);
}

public void imprimirSerieFibonacci() {
int i;
for(i = 0; i < numeroElementos; ++i)
System.out.print(serieFibonacci(i) + ", ");
}

}