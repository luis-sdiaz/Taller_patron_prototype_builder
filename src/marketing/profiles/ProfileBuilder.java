package marketing.profiles;

import java.util.ArrayList;
import java.util.List;

public class ProfileBuilder {
    private MarketingProfile profile = new MarketingProfile();

    public ProfileBuilder withBasicInfo(String name, String city) {
        profile.setName(name);
        profile.setLocation(city);
        return this;
    }

    public ProfileBuilder withBudget(double amount) {
        profile.setBudget(amount);
        return this;
    }

    public ProfileBuilder withInterests(String... interests) {
        profile.setInterests(new ArrayList<>(List.of(interests)));
        return this;
    }

    public MarketingProfile build() {
        MarketingProfile built = this.profile;
        this.profile = new MarketingProfile();
        return built;
    }
}
