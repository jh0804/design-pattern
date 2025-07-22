package ex04;

public class Doorman {

    public static Doorman instance = new Doorman(); // 원래는 private 하고 getter를 만들어야 하지만 여기서는 중요X

//    // 이건 책임이고 싱글톤 아님 -> 복잡한 객체일때
//    public static Doorman createInstance(){
//        return new Doorman();
//    }
//    // 책임X 상태확인
//    public Doorman getInstance() {
//        return instance;
//    }

    private Doorman() {
    }

    // 객체의 책임 = 메서드
    public void 쫓아내(Animal a) {
        System.out.println(a.getName() + " 나가!");
    }
}
