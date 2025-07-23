package ex08.push;

import ex08.push.pub.EMart;
import ex08.push.pub.LotteMart;
import ex08.push.sub.Cus1;
import ex08.push.sub.Cus2;

public class App {
    public static void main(String[] args) {
        // 1. 객체 초기화
        LotteMart lotteMart = new LotteMart();
        EMart emart = new EMart();
        Cus1 cus1 = new Cus1();
        Cus2 cus2 = new Cus2();

        // 2. 구독 (구독의 행위자 = 고객)
        lotteMart.add(cus1);
        lotteMart.add(cus2);

        emart.add(cus1);
        emart.add(cus2);

        // 3. 구독 취소
        lotteMart.remove(cus2);

        // 4. 출판 (누가 할지는 나중에 정하면 됨)
        new Thread(() -> {
            lotteMart.received();
        }).start();
        new Thread(() -> {
            emart.received();
        }).start();

        // lotteMart.received();
        // 호출되는 notify 메서드 = received를 call했는데 notify가 back됐으므로 callback = 메서드 출판이 끝났을때 notify됨
    }
}
