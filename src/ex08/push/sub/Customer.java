package ex08.push.sub;

// subscriber 구독자 -> 구득의 책임을 지지X(출판사의 책임), 알림만 받으면 됨 => 여기서 구독을 책임지지 X, 고객은 단지 호출할 뿐
public interface Customer {
    void update(String msg);
}
