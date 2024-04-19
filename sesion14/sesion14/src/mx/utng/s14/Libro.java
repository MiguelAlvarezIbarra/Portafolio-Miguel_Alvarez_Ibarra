package mx.utng.s14;
/*
 * @author: Miguel Angel Alvarez Ibarra
 * @group: GDS0624
 * @subject: Programación orientada a objetos
 */
public class Libro implements Comparable{
    //Para declarar que es una constante se escribe FINAL
    private final String TITULO;
    private int prioridad;


    public Libro(String tITULO, int prioridad) {
        TITULO = tITULO;
        this.prioridad = prioridad;
    }

    public String getTITULO() {
        return TITULO;
    }

    @Override
    public int compareTo(Object libro) {
        return this.prioridad = libro.prioridad;


    }
}
