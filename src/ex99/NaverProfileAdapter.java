package ex99;

public class NaverProfileAdapter extends UserProfile {
    private NaverProfile profile;

    public NaverProfileAdapter(NaverProfile profile) {
        this.profile = profile;
    }

    @Override
    public String getUsername() {
        return profile.getMainName();
    }
}
