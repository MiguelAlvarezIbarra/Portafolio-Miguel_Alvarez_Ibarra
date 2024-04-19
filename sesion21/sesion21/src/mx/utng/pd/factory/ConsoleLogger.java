package mx.utng.pd.factory;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
public class ConsoleLogger implements Logger{
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
