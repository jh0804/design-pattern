package ex98;

public class OuterEmail implements Email {
    public int send(String to, String from, String msg) {
        System.out.println("진짜 이메일 전송됨");
        return 1;
    }
}