package ex98;

public class App {

    static int start(Email email) {
        return email.send("받는놈", "보내는놈", "메시지");
    }

    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Doorman d1 = new Doorman();
        Cat c1 = new Cat();

        // 동물이 침입하려고 했어요!! (email 보내고 쫓아내야함)
        int result = start(new OuterEmail());

        if (result == 1) {
            d1.쫓아내(m1);
            d1.쫓아내(c1);
        }


    }
}