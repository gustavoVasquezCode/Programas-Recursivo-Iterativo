# numero factorial recursivo

def funcionFactorial(factorial):
    if factorial == 0:
        return 1
    else:
        return factorial * funcionFactorial(factorial - 1)

def ingresarNumero():
    ingresoNumero = True
    numero = 0
    while ingresoNumero:
        try:
            numero = int(input("\nIngrese un numero: "))
        except ValueError:
            print("\nError, caracter no valido, try again...")
        else:
            ingresoNumero = False
    return numero

def mainFactorial():
    ejecutarPrograma = True
    while ejecutarPrograma:
        numero = 0
        print("\n1.Calcular factorial \n2.Salir")
        opcion = ingresarNumero()
        if opcion == 1:
            numero = ingresarNumero()
            print(f"\nEl numero factorial de {numero}! es: ", funcionFactorial(numero))
        elif opcion == 2:
            ejecutarPrograma = False
        else:
            print("\nError, la opcion no existe, try again...")

mainFactorial()
