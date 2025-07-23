package ex08.polling;

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();

//        // 1. 마트는 입고 준비
//        lotteMart.received(); // 5초
        new Thread(() -> {
            lotteMart.received(); // 5초
        }).start();

//        // 2. 입고 확인
//        String value = lotteMart.getValue();
//        System.out.println("받은 값 : " + value); // value에 값 들어오기 전에 쥬금ㅠ

        // 2. 입고 확인 (데몬)
        while (true) {
            try {
                Thread.sleep(100); // 점유권 ? (선점/비선점)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lotteMart.getValue() != null) { // request (폴링)
                customer1.update(lotteMart.getValue() + "이 들어왔습니다.");
                break;
            } else {
                System.out.println("상품이 아직 들어오지 않았어요!");
            }
        }
    }
}
