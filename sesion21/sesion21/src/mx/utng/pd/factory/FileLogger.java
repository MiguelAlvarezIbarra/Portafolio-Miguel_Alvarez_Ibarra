package mx.utng.pd.factory;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileLogger implements Logger {
    @Override
    public void log(String msg) {
        try{

        
        BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt"));
        bw.write(msg);
        bw.close();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error de entrada y salida"+e.getMessage());
        }
    }  
}
