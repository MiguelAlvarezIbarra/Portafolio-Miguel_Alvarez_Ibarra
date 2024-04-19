package mx.utng.pd.absfactory;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
public class VehiculoLujoFactory extends VehiculoFactory{
    @Override
    public Auto getAuto() {
        return new AutoLujoso("A-L");
    }

    @Override 
    public Camioneta getCamioneta() {
        return new CamionetaLujosa("C-L");
    }

}
