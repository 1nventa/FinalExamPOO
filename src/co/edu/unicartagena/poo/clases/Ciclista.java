
package co.edu.unicartagena.poo.clases;

/**
 *
 * @author Carlos
 */
public class Ciclista {
     private String nombre;
    private int edad;
    private String nivel;

    public Ciclista(String nombre, int edad, String nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}

