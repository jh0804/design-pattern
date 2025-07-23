package ex08.push.pub;

import ex08.push.sub.Customer;

public interface Mart { // Publisher
    // 1. 구독
    void add(Customer customer);

    // 2. 구독취소
    void remove(Customer customer);

    // 3. 출판
    void received();

    // 4. 알림
    void notify(String msg);
}
