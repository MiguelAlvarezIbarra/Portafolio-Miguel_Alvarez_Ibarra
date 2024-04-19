package mx.utng.pd.absfactory;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
public class AutoEconomico implements Auto{
    
    private String nombre;

    
    public AutoEconomico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getCaracteristicas() {
        return nombre;
    }

    @Override
    public String getNombre() {
       return "Auto economico con pocas caracteristicas";
    }

}
