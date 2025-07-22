package ex02;

public class App {
    public static void main(String[] args) {
        // 1. init
        Mouse m1 = new Mouse();
        Doorman d1 = new Doorman();
        Cat c1 = new Cat();
        DoormanProxy dp = new DoormanProxy(d1);

        // 2. run
        dp.쫓아내(m1);
        dp.쫓아내(c1);
    }
}
