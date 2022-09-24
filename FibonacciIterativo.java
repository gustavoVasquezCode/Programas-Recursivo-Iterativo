import java.io.*;
import java.lang.NumberFormatException;

public class FibonacciIterativo {
private int numero;
private int fibonacci;

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

public FibonacciIterativo() {
numero = 0;
fibonacci = 0;
}

public void ingresarNumero() throws IOException, NumberFormatException {
boolean bandera = true;
while(bandera){
try {
System.out.print("\nIngrese la cantidad de numeros a generar: ");
numero = Integer.valueOf(al.readLine()).intValue();
bandera = false;
}
catch(NumberFormatException e){
System.out.println("\n" + e + "\n");
}
}
}

public void realizarFibonacci() {
int i;
int termino1=1;
int termino2;
for(i=0; i<numero; ++i){
   termino2 = fibonacci;
   fibonacci += termino1;
   termino1 = termino2;
   System.out.print(termino1 + ",  ");
}
}

}