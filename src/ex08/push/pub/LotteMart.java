package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart {
    // 메서드의 책임을 명확하게 알고 전반적인 그림을 알아야 구현 가능.

    // 구독자 명단
    private List<Customer> customerList = new ArrayList<>();

    // 구독 등록
    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    // 구독 취소
    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }

    // 출판
    @Override
    public void received() {
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notify("LotteMart : 바나나");
    }

    // 출판 완료
    @Override
    public void notify(String msg) {
        // 마트를 구독했기 때문에 뭐라도 들어오면 가능
        for (Customer customer : customerList) {
            customer.update(msg);
        }
    }
}
