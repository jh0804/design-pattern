package ex97;


interface 나이프 {
    void 킬();

    void 요리();
}

abstract class 전투칼 implements 나이프 {
    @Override
    public void 요리() {

    }
}

abstract class 요리칼 implements 나이프 {
    @Override
    public void 킬() {

    }
}

class 덱스 extends 전투칼 {

    @Override
    public void 킬() {

    }
}

// 이 경우 덱스는 나이프로 요리를 하지 않지만 요리 또한 구현해두어야 한다.
//class 덱스 implements 나이프 {
//    @Override
//    public void 킬() {
//
//    }
//
//    @Override
//    public void 요리() {
//
//    }
//}


class 백종원 {

}

public class App {
    public static void main(String[] args) {

    }
}