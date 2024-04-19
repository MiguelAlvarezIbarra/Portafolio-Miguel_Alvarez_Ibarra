package mx.utng.pd.absfactory;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
public class CamionetaEconomica implements Camioneta{
    
    private String nombre;

    
    public CamionetaEconomica(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getCaracteristicas() {
        return nombre;
    }

    @Override
    public String getNombre() {
       return "Camioneta economica con pocas caracteristicas";
    }

}
