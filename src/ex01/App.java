package ex01;

public class App {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Doorman d1 = new Doorman();

        d1.쫓아내(m1);

        Tiger t1 = new Tiger();
        d1.쫓아내(t1);

        Cat c1 = new Cat();
        d1.쫓아내(c1);
    }
}
