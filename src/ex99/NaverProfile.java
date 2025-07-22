package ex99;

public class NaverProfile extends UserProfile {
    private int id;
    private String mainName;

    public NaverProfile(int id, String mainName) {
        this.id = id;
        this.mainName = mainName;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getMainName() {
        return mainName;
    }
}