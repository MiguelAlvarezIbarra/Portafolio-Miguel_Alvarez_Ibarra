package mx.utng.s15;
/*
 * @author: Miguel Angel Alvarez Ibarra
 * @group: GDS0624
 * @subject: Programación orientada a objetos
 */
import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        String nombreCompletoPersona1 = p1.getNombre()+p1.getApellido();
        String nombreCompletoPersona2 = p2.getNombre()+p2.getApellido();
        return nombreCompletoPersona1.compareTo(nombreCompletoPersona2);
    }
    
    
}
