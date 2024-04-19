package mx.utng.s15;
/*
 * @author: Miguel Angel Alvarez Ibarra
 * @group: GDS0624
 * @subject: Programación orientada a objetos
 */
import java.io.File;

public class Archivo {
    public static void main(String[] args) {
        File archivo = new File("C:/temp/cursos/cursos.txt");

        System.out.println("Nombre del archivo: "+archivo.getName());
        System.out.println("Ruta: "+archivo.getPath());
        System.out.println("Ruta absoluta: "+archivo.getAbsolutePath());
        System.out.println("Padre: "+archivo.getParent());
        System.out.println("Existe? "+archivo.exists());
        System.out.println("Esta oculto?"+archivo.isHidden());
    }
}
