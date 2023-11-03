import java.util.Scanner;

public class NumberConversion {

    public static String decimalToBinary(int decimal) {
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    public static int binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }

    public static String octalToBinary(String octal) {
        int decimal = Integer.parseInt(octal, 8);
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    public static String binaryToOctal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        return octal;
    }

    public static String hexadecimalToBinary(String hexadecimal) {
        int decimal = Integer.parseInt(hexadecimal, 16);
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    public static String binaryToHexadecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        return hexadecimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nElige una opción:");
            System.out.println("1. Decimal a Binario");
            System.out.println("2. Binario a Decimal");
            System.out.println("3. Octal a Binario");
            System.out.println("4. Binario a Octal");
            System.out.println("5. Hexadecimal a Binario");
            System.out.println("6. Binario a Hexadecimal");
            System.out.println("7. Salir");

            String opcion = scanner.next();

            if (opcion.equals("1")) {
                System.out.print("Ingrese un número decimal (Del 0 al 9): ");
                int decimalNumber = scanner.nextInt();
                System.out.println("\nDecimal a Binario: " + decimalToBinary(decimalNumber));
            } else if (opcion.equals("2")) {
                System.out.print("Ingresa un número binario: ");
                String binaryNumber = scanner.next();
                System.out.println("\nBinario a Decimal: " + binaryToDecimal(binaryNumber));
            } else if (opcion.equals("3")) {
                System.out.print("Ingrese un número octal (Del 0 al 7): ");
                String octalNumber = scanner.next();
                System.out.println("\nOctal a Binario: " + octalToBinary(octalNumber));
            } else if (opcion.equals("4")) {
                System.out.print("Ingresa un número binario: ");
                String binaryNumber = scanner.next();
                System.out.println("\nBinario a Octal: " + binaryToOctal(binaryNumber));
            } else if (opcion.equals("5")) {
                System.out.print("Ingrese un número hexadecimal (Del 0 a la F): ");
                String hexadecimalNumber = scanner.next();
                System.out.println("\nHexadecimal a Binario: " + hexadecimalToBinary(hexadecimalNumber));
            } else if (opcion.equals("6")) {
                System.out.print("Ingresa un número binario: ");
                String binaryNumber = scanner.next();
                System.out.println("\nBinario a Hexadecimal: " + binaryToHexadecimal(binaryNumber));
            } else if (opcion.equals("7")) {
                System.out.println("\nSaliendo del programa.");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, elige una opción válida (1/2/3/4/5/6/7).");
            }
        }

        scanner.close();
    }
}
