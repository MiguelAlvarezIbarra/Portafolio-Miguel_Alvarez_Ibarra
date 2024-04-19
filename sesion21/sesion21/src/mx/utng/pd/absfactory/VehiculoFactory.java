package mx.utng.pd.absfactory;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
public abstract class VehiculoFactory {
    private static final String VEHICULO_LUJO = "LUJO";
    private static final String VEHICULO_ECONOMICO = "Economico";

    public abstract Auto getAuto();
    public abstract Camioneta getCamioneta();
}
