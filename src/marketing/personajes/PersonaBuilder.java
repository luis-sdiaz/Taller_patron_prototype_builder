package marketing.personajes;

import java.util.ArrayList;
import java.util.List;

public class PersonaBuilder {
    private PersonaMarketing persona = new PersonaMarketing();

    public PersonaBuilder definirBasicos(String nombre, String ciudad) {
        persona.setNombre(nombre);
        persona.setUbicacion(ciudad);
        return this;
    }

    public PersonaBuilder definirDinero(double monto) {
        persona.setPresupuesto(monto);
        return this;
    }

    public PersonaBuilder definirIntereses(String... gustos) {
        persona.setIntereses(new ArrayList<>(List.of(gustos)));
        return this;
    }

    // El toque final que entrega el objeto
    public PersonaMarketing construir() {
        return this.persona;
    }
}
