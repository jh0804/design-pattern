package ex99;

public class FacebookProfile extends UserProfile {
    private int uId;
    private String uName;

    public FacebookProfile(int uId, String uName) {
        this.uId = uId;
        this.uName = uName;
    }

    public int getId() {
        return uId;
    }

    public String getUsername() {
        return uName;
    }
}