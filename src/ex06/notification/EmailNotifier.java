package ex06.notification;

public class EmailNotifier implements Notifier {

    private Notifier notifier;

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public EmailNotifier() {
    }

    public void send() {
        System.out.println("이메일 알림");
        if (notifier != null) notifier.send();
    }
}
