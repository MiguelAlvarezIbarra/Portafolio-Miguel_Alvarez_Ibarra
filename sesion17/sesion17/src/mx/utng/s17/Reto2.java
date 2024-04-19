package mx.utng.s17;
/*
 * @author: Miguel Angel Alvarez Ibarra
 * @grade: GDS0624
 * @date: 16/02/2024
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Reto2 {
    public static void main(String[] args) throws IOException{
        
        //Crear una instancia de archivos
        File archivo = new File("src\\mx\\utng\\s17\\poema.txt");

        //Nombre del archivo
        System.out.println("Nombre del archivo: "+archivo.getName());

        //Ruta del archivo
        System.out.println("Ruta: "+archivo.getPath());

        //Crear un escritor de archivos
        FileWriter fw = new FileWriter("src\\mx\\utng\\s17\\poema.txt");

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Escrito por: Miguel Angel Alvarez Ibarra - MAAI \n");
        bw.newLine();
        bw.write("Poema 14 Febrero.\n\n");
        bw.write("En el día de los enamorados brillará, \n");
        bw.write("un cielo de estrellas y un dulce paladar, \n");
        bw.write("susurros de amor en cada rincón, \n");
        bw.write("un baile de emociones en el corazón. \n");
        bw.newLine();
        bw.write("Rosa en mano, el suspiro se eleva, \n");
        bw.write("bajo la luna, la pasión se desvela, \n");
        bw.write("besos robados, promesas en el aire, \n");
        bw.write("un universo de amor a nuestro alcance. \n");
        bw.newLine();
        bw.write("En el cálido abrazo, el tiempo se detiene, \n");
        bw.write("dos almas unidas, un destino que sostiene, \n");
        bw.write("en este día especial, el amor florece, \n");
        bw.write("en cada latido, en cada promesa que crece. \n");
        
        //Creo un objeto que permita la lectura de archivo
        FileReader fr = new FileReader("src\\mx\\utng\\s17\\poema.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea = null;

        while ((linea = br.readLine())!=null) {
            System.out.println(linea);
        }
        bw.close();
        br.close();
    }
}
