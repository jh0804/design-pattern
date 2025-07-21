package ex00;

// 동적 바인딩
class Car {
    void run() {
        System.out.println("Car run");
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
        Car car = new Sonata();
        car.run();
    }
}
