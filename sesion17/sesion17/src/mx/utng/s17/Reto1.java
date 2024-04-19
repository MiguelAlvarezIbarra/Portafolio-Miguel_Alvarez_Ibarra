package mx.utng.s17;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
import java.io.File;

public class Reto1 {
    public static void main(String[] args) {
        File directorioInicial = new File("C:\\Users\\Miguel Alvarez\\Downloads\\POO - Tachito\\sesion17\\sesion17\\src\\mx\\utng\\s17");

        muestraContenidoDirectorio(directorioInicial);
    }

    private static void muestraContenidoDirectorio(File directorio){
        //Poner la marca de incio y el nombre del primer directorio
        colocaEspacios(directorio.getParent(), 'D'); //Los caracteres se ponen con comillas simples''
        System.out.println(directorio.getName());

        //Crea un arreglo de subdirectorios 
        File[] subdirectorios = directorio.listFiles();

        //Recorrer la lista de archivos y verificamos que sean A o D
        //se utiliza for each por que se tiene un arreglo, y es mas sencillo trabajarlo con for each que con for i
        for (File archivo : subdirectorios) {
            //Verificar si es archivo
            if (archivo.isFile()) {
                colocaEspacios(archivo.getParent(), 'A');
                System.out.println(archivo.getName());
            }else if (archivo.isDirectory()) {
                muestraContenidoDirectorio(archivo);
            }
        }

    }

    private static void colocaEspacios(String padre, char simbolo){
        //Colocar la marca de inicio de linea [A] - Archivo [D]-Directorio
        System.out.print("["+simbolo+"]");

        //Colocar serie de guiones de acuerdo a la profundidad del directorio
        for (int i = 0; i <padre.length(); i++) {
            System.out.print("-");
        }
    }
}
