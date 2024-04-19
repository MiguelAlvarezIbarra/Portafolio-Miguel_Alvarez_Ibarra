package mx.utng.s11.Reto1;
 /**
     @Author Miguel Angel Alvarez Ibarra
     @Group GDS0624
     @Subject Programación orientada a objetos
     */
import java.time.LocalDate;

public class Empleado extends Persona {
    private float salario;

    public Empleado(String nombre, byte edad, LocalDate fechaDeNacimiento, float salario) {
        super(nombre, edad, fechaDeNacimiento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
}
