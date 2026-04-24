package marketing.profiles;

public class Main {
    public static void main(String[] args) {
        ProfileBuilder builder = new ProfileBuilder();

        MarketingProfile prototipoTech = builder
                .withBasicInfo("Prototipo Base", "Colombia")
                .withBudget(800000)
                .withInterests("Java", "Gaming", "AI")
                .build();

        System.out.println("--- 1. PROTOTIPO CREADO (BUILDER) ---");
        System.out.println(prototipoTech);

        MarketingProfile clienteLuis = prototipoTech.clone();
        clienteLuis.setName("Luis Sebastian Diaz");
        clienteLuis.setLocation("Pasto");

        clienteLuis.getInterests().add("Ciberseguridad");

        System.out.println("\n--- 2. CLON PERSONALIZADO (PROTOTYPE) ---");
        System.out.println(clienteLuis);

        System.out.println("\n--- 3. VERIFICACIÓN DE INDEPENDENCIA ---");
        System.out.println("Intereses Originales: " + prototipoTech.getInterests());
        System.out.println("Intereses de Luis: " + clienteLuis.getInterests());
    }
}
