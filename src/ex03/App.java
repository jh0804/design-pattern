package ex03;

public class App {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Doorman d1 = new Doorman();

        d1.쫓아내(m1);

        Cat c1 = new Cat();
        d1.쫓아내(c1);

        TigerAdapter t1 = new TigerAdapter(new OuterTiger());
        d1.쫓아내(t1);
    }
}
