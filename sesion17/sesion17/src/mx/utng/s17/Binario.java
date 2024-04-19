package mx.utng.s17;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binario {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //Declaramos instacion de BufferedInputStream
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\mx\\utng\\s17\\imagen.png"));
        //Declaramos instancia de BufferedOutputStream
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\\\mx\\\\utng\\\\s17\\\\imagen_copia.png"));

        //Definimos el buffer de escritura de datos
        byte[] buffer = new byte[1024];
        //inicar la copia del archivo
        int bytesLeidos = 0;
        while ((bytesLeidos = bis.read(buffer))>0) {
            bos.write(buffer, 0,bytesLeidos);
        }

        bos.close();
        bis.close();
    }
}
