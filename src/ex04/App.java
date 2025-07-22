package ex04;

public class App {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Cat c1 = new Cat();

        Doorman d1 = Doorman.instance;

        d1.쫓아내(m1);
        d1.쫓아내(c1);
    }
}
