package ex99;

public class KakaoProfile extends UserProfile {
    private int sub;
    private String name;

    public KakaoProfile(int sub, String name) {
        this.sub = sub;
        this.name = name;
    }

    public int getId() {
        return sub;
    }

    public String getUsername() {
        return name;
    }
}