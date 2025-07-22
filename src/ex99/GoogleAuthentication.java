package ex99;

// SRP를 지키기 위해
public class GoogleAuthentication extends Authentication {

    public UserProfile login() {
        System.out.println("구글 로그인 완료");
        return new GoogleProfile(500, "cos");
    }
}