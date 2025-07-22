package ex99;

// SRP를 지키기 위해
public class NaverAuthentication extends Authentication {

    public UserProfile login() {
        System.out.println("네이버 로그인 완료");
        NaverProfile naverProfile = new NaverProfile(7, "nav");
        return new NaverProfileAdapter(naverProfile);
    }
}