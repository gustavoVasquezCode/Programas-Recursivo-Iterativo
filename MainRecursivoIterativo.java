import java.io.*;
import java.lang.NumberFormatException;

public class MainRecursivoIterativo {
public static void main(String[] args) throws IOException, NumberFormatException {

int opcion = 0;
boolean ingresoOpcion = true;
boolean ejecutarPrograma = true;

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

FactorialIterativa obj1 = new FactorialIterativa();
FibonacciIterativo obj2 = new FibonacciIterativo();
FactorialRecursivo obj3 = new FactorialRecursivo();
FibonacciRecursivo obj4 = new FibonacciRecursivo();

while (ejecutarPrograma) {
try{
System.out.println("\n\n********** Menu Opciones **********");
System.out.println("1.Factorial Iterativo \n2.Fibonacci Iterativo \n3.Factorial Recursivo \n4.Fibonacci Recursivo \n5.Salir");
System.out.print("\nIngrese la opcion: ");
opcion = Integer.valueOf(al.readLine()).intValue();
}
catch (NumberFormatException e) {
System.out.println("\n" + e);
}

if (opcion == 1){
System.out.println("\n********** Factorial Itearivo **********");
obj1.ingresarNumero();
obj1.numeroFactorial();
obj1.imprimirFactorial();
}
else if (opcion == 2) {
System.out.println("\n********** Fibonacci Itearivo **********");
obj2.ingresarNumero();
obj2.realizarFibonacci();
}
else if (opcion == 3) {
System.out.println("\n********** Factorial Recursivo **********");
obj3.ingresarNumero();
obj3.imprimirFactorial();
}
else if (opcion == 4) {
System.out.println("\n********** Fibonacci Recursivo **********");
obj4.ingresarNumeroElementos();
obj4.imprimirSerieFibonacci();
}
else if (opcion == 5)
ejecutarPrograma = false;
else
System.out.println("\nLa opcion que ingreso no existe, try again...");

} //while ejecutar

}
}