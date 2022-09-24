def serieFibonacci(fibonacci):
    if fibonacci < 2:
        return fibonacci
    else:
        return serieFibonacci(fibonacci - 1) + serieFibonacci(fibonacci - 2)

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

def mainFibonacci():
    ejecutarPrograma = True
    lista = []
    while ejecutarPrograma:
        numero = 0
        print("\n1.imprimir serie fibonacci \n2.Salir")
        opcion = ingresarNumero()
        if opcion == 1:
            numero = ingresarNumero()
            for i in range(numero):
                print(serieFibonacci(i))
                #lista.append(serieFibonacci(i))
            #print(lista, " ")
        elif opcion == 2:
            ejecutarPrograma = False
        else:
            print("\nError, la opcion no existe, try again...")

mainFibonacci()
