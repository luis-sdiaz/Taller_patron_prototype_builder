package marketing.profiles;

public class Main {
    public static void main(String[] args) {
        // 1. USE THE BUILDER
        // Create a base prototype for a young tech-savvy customer
        ProfileBuilder builder = new ProfileBuilder();

        MarketingProfile techProfile = builder
                .setBasics("Base Profile", "Colombia")
                .setBudget(800000)
                .setInterests("Java", "Gaming", "AI")
                .build();

        System.out.println("--- 1. PROTOTYPE CREATED (BUILDER) ---");
        System.out.println(techProfile);

        // 2. USE THE PROTOTYPE
        // Clone the prototype to create Luis without redefining everything
        MarketingProfile clientLuis = techProfile.clone();
        clientLuis.setName("Luis Sebastian Diaz"); // Customize
        clientLuis.setLocation("Pasto");

        // 3. TEST (OOP)
        // Add an extra interest only to Luis to verify independence
        clientLuis.getInterests().add("Cybersecurity");

        System.out.println("\n--- 2. CUSTOMIZED CLONE (PROTOTYPE) ---");
        System.out.println(clientLuis);

        // 4. FINAL VERIFICATION
        System.out.println("\n--- 3. INDEPENDENCE VERIFICATION ---");
        System.out.println("Original interests: " + techProfile.getInterests());
        System.out.println("Luis's interests: " + clientLuis.getInterests());
    }
}
