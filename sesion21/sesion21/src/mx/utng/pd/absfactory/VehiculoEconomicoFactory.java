package mx.utng.pd.absfactory;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
public class VehiculoEconomicoFactory extends VehiculoFactory{
    
    @Override
    public Auto getAuto() {
        return new AutoEconomico("A-E");
    }

    @Override 
    public Camioneta getCamioneta() {
        return new ("C-E");
    }
}
