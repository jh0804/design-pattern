package ex99;

public class GoogleProfile extends UserProfile {
    private int id;
    private String username;

    public GoogleProfile(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}