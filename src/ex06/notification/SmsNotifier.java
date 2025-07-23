package ex06.notification;

public class SmsNotifier implements Notifier {

    private Notifier notifier;

    public SmsNotifier() {
    }

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        System.out.println("문자 알림");
        if (notifier != null) notifier.send();
    }
}
