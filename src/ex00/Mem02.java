package ex00;

// 동적 바인딩
abstract class Car {
    abstract void run();
}

class Genesis extends Car {
    // 재정의
    void run() {
        System.out.println("Genesis run");
    }
}

class Sonata extends Car {
    // 재정의
    void run() {
        System.out.println("Sonata run");
    }
}

public class Mem02 {
    public static void main(String[] args) {
        Car car1 = new Sonata();
        car1.run();

        Car car2 = new Genesis();
        car2.run();
    }
}
