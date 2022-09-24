# Serie Fibonacci Iterativa

def ingresarNumero():
    numero = 0
    ingresoNumero = True
    while ingresoNumero:
        try:
            numero = int(input("Ingrese el numero de elementos de la serie: "))
        except ValueError:
            print("\nError, caracter no valido, vuelva a intentar...")
        else:
            ingresoNumero = False
    return numero

def serieFibonacci():
    incremento = ingresarNumero()
    fibonacci = 0
    valor1 = 1
    valor2 = 0
    for i in range(0, incremento-1):
        valor2 = fibonacci
        fibonacci = valor1 + fibonacci
        valor1 = valor2
        print(valor2, "  ")

serieFibonacci()