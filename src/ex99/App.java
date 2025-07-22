package ex99;

import java.util.Scanner;

// FacebookProfile -> uId, uName (이게 추가될때 기존 코드를 손되지 않을 수 있게 하는게 목표)
public class App {

    static void mainPage(UserProfile profile) {
        System.out.println("로그인 하신 아이디는 " + profile.getUsername() + " 입니다.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String provider = sc.nextLine();

        // 객체 생성 전담 클래스를 만들어서 처리해주면 좋다.
        Authentication authentication;
        if (provider.equals("google")) {
            authentication = new GoogleAuthentication();
        } else if (provider.equals("kakao")) {
            authentication = new KakaoAuthentication();
        } else if (provider.equals("facebook")) {
            authentication = new FacebookAuthentication();
        } else if (provider.equals("naver")) {
            authentication = new NaverAuthentication();
        } else {
            System.out.println("지원하지 않는 Provider 입니다.");
            return;
        }

        UserProfile userProfile = authentication.login();
        mainPage(userProfile);
    }
}