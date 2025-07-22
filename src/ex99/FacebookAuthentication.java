package ex99;

// SRP를 지키기 위해
public class FacebookAuthentication extends Authentication {

    public UserProfile login() {
        System.out.println("페이스북 로그인 완료");
        return new FacebookProfile(999, "love");
    }
}