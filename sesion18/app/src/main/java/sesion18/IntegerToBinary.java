package sesion18;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        int miNumero = 20;
        String binario = Integer.toBinaryString(miNumero); //Clase envoltoria (wrapped class)
        System.out.printf("El numero %d es en binario %s%n",miNumero, binario);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        scanner.close();
        String bin = Integer.toBinaryString(numero);
        System.out.printf("El numero %d es en binario %s%n",numero,bin);
    }
}

