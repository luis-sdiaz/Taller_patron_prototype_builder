package marketing.personajes;

import java.util.ArrayList;
import java.util.List;

// Usamos "implements Cloneable" para decirle a Java que este objeto se puede duplicar
public class PersonaMarketing implements Cloneable {

    // Atributos (Estado del objeto)
    private String nombre;
    private String ubicacion;
    private int edadMin;
    private int edadMax;
    private double presupuesto;
    private List<String> intereses;

    // Constructor: Aquí nace el objeto
    public PersonaMarketing() {
        this.intereses = new ArrayList<>();
    }

    // --- PATRÓN PROTOTYPE ---
    // Este método es como una fotocopiadora
    @Override
    public PersonaMarketing clone() {
        try {
            PersonaMarketing copia = (PersonaMarketing) super.clone();
            // Esto es POO pura: creamos una nueva lista para que la copia sea independiente
            copia.intereses = new ArrayList<>(this.intereses);
            return copia;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Setters: Para darle valores a los atributos
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public void setEdadMin(int edadMin) { this.edadMin = edadMin; }
    public void setEdadMax(int edadMax) { this.edadMax = edadMax; }
    public void setPresupuesto(double presupuesto) { this.presupuesto = presupuesto; }
    public void setIntereses(List<String> intereses) { this.intereses = intereses; }

    // Getter: Para sacar información
    public List<String> getIntereses() { return intereses; }

    // toString: Para que al imprimirlo se vea bonito en consola
    @Override
    public String toString() {
        return "Perfil: " + nombre + " | Ciudad: " + ubicacion + " | Presupuesto: $" + presupuesto;
    }
}
