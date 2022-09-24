# Numero factorial iterativo
def ingresarNumero():
    ingresoNumero = True
    while ingresoNumero:
        try:
            numero = int(input("\nIngrese un numero: "))
        except ValueError:
            print("\nError, introdujo un dato no valido")
        else:
            ingresoNumero = False
    return numero

def factorial():
    factorial = 1
    i = ingresarNumero()
    numero = i
    while i > 0:
        factorial = factorial * i
        i-=1
    print(f"\nEl factorial de {numero}! es: {factorial}.")


def pedirOpcion():
    opc = 0
    ingresoOpcion = True
    while ingresoOpcion:
        try:
            opc = int(input("Digite una opcion y de enter: "))
        except ValueError:
            print("\n¡Vaya! Ingreso un caracter, debe ser un numero. Try again.")
        else:
            ingresoOpcion = False
    return opc

def main():
    opcion = 0
    ejecutarPrograma = True

    while ejecutarPrograma:
        print("\n\n********** Menu de opciones Numero Factorial **********")
        print("1.Ingresar Numero y calcular Factorial \n2.Salir")
        opcion = pedirOpcion()

        if opcion == 1:
            factorial()
        elif opcion == 2:
            ejecutarPrograma = False
        else:
            print(f"\nError, la opcion ingresada {opcion} no existe, vuelva a intentar...")
            
main()
