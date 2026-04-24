package marketing.profiles;

import java.util.ArrayList;
import java.util.List;

public class MarketingProfile implements Cloneable {

    private String name;
    private String location;
    private int ageMin;
    private int ageMax;
    private double budget;
    private List<String> interests;

    public MarketingProfile() {
        this.interests = new ArrayList<>();
    }

    @Override
    public MarketingProfile clone() {
        try {
            MarketingProfile copy = (MarketingProfile) super.clone();
            copy.interests = new ArrayList<>(this.interests);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setName(String name) { this.name = name; }
    public void setLocation(String location) { this.location = location; }
    public void setAgeMin(int ageMin) { this.ageMin = ageMin; }
    public void setAgeMax(int ageMax) { this.ageMax = ageMax; }
    public void setBudget(double budget) { this.budget = budget; }
    public void setInterests(List<String> interests) { this.interests = new ArrayList<>(interests); }

    public List<String> getInterests() { return interests; }

    @Override
    public String toString() {
        return "Perfil: " + name + " | Ciudad: " + location + " | Presupuesto: $" + budget;
    }
}
