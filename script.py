def decimal_to_binary(decimal):
    binary = bin(int(decimal))
    return binary[2:]

def binary_to_decimal(binary):
    return int(binary, 2)

def octal_to_binary(octal):
    binary = bin(int(octal, 8))
    return binary[2:]

def binary_to_octal(binary):
    decimal = int(binary, 2)
    octal = oct(decimal)
    return octal[2:]

def hexadecimal_to_binary(hexadecimal):
    decimal = int(hexadecimal, 16)
    binary = bin(decimal)
    return binary[2:]

def binary_to_hexadecimal(binary):
    decimal = int(binary, 2)
    hexadecimal = hex(decimal)
    return hexadecimal[2:]

while True:
    print("\nElige una opción:")
    print("1. Decimal a Binario")
    print("2. Binario a Decimal")
    print("3. Octal a Binario")
    print("4. Binario a Octal")
    print("5. Hexadecimal a Binario")
    print("6. Binario a Hexadecimal")
    print("7. Salir")
    
    opcion = input("Ingresa el número de opción (1/2/3/4/5/6/7): ")
    
    if opcion == "1":
        decimal_number = input("Ingrese un número decimal (Del 0 al 9): ")
        print("\nDecimal a Binario:", decimal_to_binary(decimal_number))
    elif opcion == "2":
        binary_number = input("Ingresa un número binario: ")
        print("\nBinario a Decimal:", binary_to_decimal(binary_number))
    elif opcion == "3":
        octal_number = input("Ingrese un numero octal (Del 0 al 7): ")
        print("\nOctal a Binario:", octal_to_binary(octal_number))
    elif opcion == "4":
        binary_number = input("Ingresa un número binario: ")
        print("\nBinario a Octal:", binary_to_octal(binary_number))
    elif opcion == "5":
        hexadecimal_number = input("Ingrese un número hexadecimal (Del 0 a la F): ")
        print("\nHexadecimal a Binario:", hexadecimal_to_binary(hexadecimal_number))
    elif opcion == "6":
        binary_number = input("Ingresa un número binario: ")
        print("\nBinario a Hexadecimal:", binary_to_hexadecimal(binary_number))
    elif opcion == "7":
        print("\nSaliendo del programa.")
        break
    else:
        print("Opción no válida. Por favor, elige una opción válida (1/2/3/4/5/6/7).")





