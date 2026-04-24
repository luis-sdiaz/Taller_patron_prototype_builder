package marketing.profiles;

import java.util.ArrayList;
import java.util.List;

public class ProfileBuilder {
    private MarketingProfile profile = new MarketingProfile();

    public ProfileBuilder setBasics(String name, String city) {
        profile.setName(name);
        profile.setLocation(city);
        return this;
    }

    public ProfileBuilder setBudget(double amount) {
        profile.setBudget(amount);
        return this;
    }

    public ProfileBuilder setInterests(String... interests) {
        profile.setInterests(new ArrayList<>(List.of(interests)));
        return this;
    }

    // Final step that delivers the built object and resets the builder for reuse
    public MarketingProfile build() {
        MarketingProfile result = this.profile;
        this.profile = new MarketingProfile();
        return result;
    }
}
