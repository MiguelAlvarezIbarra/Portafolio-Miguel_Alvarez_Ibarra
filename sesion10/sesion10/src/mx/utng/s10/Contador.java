package mx.utng.s10;

    /**
     @Author Miguel Angel Alvarez Ibarra
     @Group GDS0624
     @Subject Programación orientada a objetos
     */
public class Contador {
    private static short contadorClase;
    private short contadorInstancia;

    public Contador(){
        contadorClase++;
        contadorInstancia++;
    }

    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }

    public static void setContadorClase(short contadorClase) {
        Contador.contadorClase = contadorClase;
    }

    public void setContadorInstancia(short contadorInstancia) {
        this.contadorInstancia = contadorInstancia;
    }
}
