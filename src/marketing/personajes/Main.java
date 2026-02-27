package marketing.personajes;

public class Main {
    public static void main(String[] args) {
        // 1. USAMOS EL BUILDER
        // Creamos un "Prototipo" de cliente joven interesado en tech
        PersonaBuilder builder = new PersonaBuilder();

        PersonaMarketing prototipoTech = builder
                .definirBasicos("Prototipo Base", "Colombia")
                .definirDinero(800000)
                .definirIntereses("Java", "Gaming", "AI")
                .construir();

        System.out.println("--- 1. PROTOTIPO CREADO (BUILDER) ---");
        System.out.println(prototipoTech);

        // 2. USAMOS EL PROTOTYPE
        // Clonamos el prototipo para crear a Luis sin tener que definir todo de nuevo
        PersonaMarketing clienteLuis = prototipoTech.clone();
        clienteLuis.setNombre("Luis Sebastian Diaz"); // Personalizamos
        clienteLuis.setUbicacion("Pasto");

        // 3. PRUEBA (POO)
        // Agregamos un interés extra solo a Luis para ver si son independientes
        clienteLuis.getIntereses().add("Ciberseguridad");

        System.out.println("\n--- 2. CLON PERSONALIZADO (PROTOTYPE) ---");
        System.out.println(clienteLuis);

        // 4. VERIFICACIÓN FINAL
        System.out.println("\n--- 3. VERIFICACIÓN DE INDEPENDENCIA ---");
        System.out.println("Intereses Originales: " + prototipoTech.getIntereses());
        System.out.println("Intereses de Luis: " + clienteLuis.getIntereses());
    }
}