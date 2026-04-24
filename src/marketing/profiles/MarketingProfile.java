package marketing.profiles;

import java.util.ArrayList;
import java.util.List;

// Implements Cloneable to allow Java to duplicate this object
public class MarketingProfile implements Cloneable {

    // Attributes (object state)
    private String name;
    private String location;
    private int ageMin;
    private int ageMax;
    private double budget;
    private List<String> interests;

    // Constructor: where the object is born
    public MarketingProfile() {
        this.interests = new ArrayList<>();
    }

    // --- PROTOTYPE PATTERN ---
    // This method acts as a photocopier
    @Override
    public MarketingProfile clone() {
        try {
            MarketingProfile copy = (MarketingProfile) super.clone();
            // Deep copy: create a new list so the clone is independent
            copy.interests = new ArrayList<>(this.interests);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    // Setters: assign values to attributes
    public void setName(String name) { this.name = name; }
    public void setLocation(String location) { this.location = location; }
    public void setAgeMin(int ageMin) { this.ageMin = ageMin; }
    public void setAgeMax(int ageMax) { this.ageMax = ageMax; }
    public void setBudget(double budget) { this.budget = budget; }
    public void setInterests(List<String> interests) { this.interests = interests; }

    // Getter: retrieve information
    public List<String> getInterests() { return interests; }

    // toString: formatted output for console display
    @Override
    public String toString() {
        return "Profile: " + name + " | City: " + location + " | Budget: $" + budget;
    }
}
