package mx.utng.pd.absfactory;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
public class CamionetaLujosa implements Camioneta{
    
private String nombre;

public CamionetaLujosa(String nombre) {
    this.nombre = nombre;
}

@Override
public String getCaracteristicas() {
    return nombre;
}

@Override
public String getNombre() {
    return "Camioneta con muchas caracteristicas de lujo";
}
}



