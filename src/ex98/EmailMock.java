package ex98;

public class EmailMock implements Email {

    public int send(String to, String from, String msg) {
        System.out.println("가짜로 전송 완료");
        return 1;
    }
}