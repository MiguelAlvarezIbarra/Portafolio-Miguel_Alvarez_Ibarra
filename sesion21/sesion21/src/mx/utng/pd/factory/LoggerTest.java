package mx.utng.pd.factory;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        logger.log("Este es el mensaje a mostrar");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea el tipo de registro a realizar ");
        int tipo = scanner.nextInt();
        scanner.close();
        logger = factory.getLogger(tipo);
        logger.log("Este fue un tipo de logger elegido por usuario");
    }
}
