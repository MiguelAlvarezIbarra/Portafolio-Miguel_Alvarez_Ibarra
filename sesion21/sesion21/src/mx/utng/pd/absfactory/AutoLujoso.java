package mx.utng.pd.absfactory;
/*
 * @Author: Miguel Angel Alvarez Ibarra
 * @Group: GDS0624
 * @Subject: Programación orientada a objetos
 */
public class AutoLujoso implements Auto{
    
private String nombre;

public AutoLujoso(String nombre) {
    this.nombre = nombre;
}

@Override
public String getCaracteristicas() {
    return nombre;
}

@Override
public String getNombre() {
    return "Auto con muchas caracteristicas de lujo";
}
}


