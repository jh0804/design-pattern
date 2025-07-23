package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.SmsNotifier;

public class App {
    public static void main(String[] args) {
//        Notifier b1 = new BasicNotifier();
//        b1.send();
//        System.out.println("_end");
//
//        Notifier e1 = new EmailNotifier();
//        e1.send();
//        System.out.println("_end");
//
//        Notifier s1 = new SmsNotifier();
//        s1.send();
//        System.out.println("_end");

        // 1. 이메일 알림
        EmailNotifier n1 = new EmailNotifier(); // 의존하고 있는 알림이 없다 = 이메일 알림만 보내고 싶다!
        n1.send();
        System.out.println();

        // 2. 기본 알림 + 이메일 알림
        EmailNotifier n2 = new EmailNotifier(new BasicNotifier());
        n2.send();
        System.out.println();

        // 3. 문자 알림 + 이메일 알림
        EmailNotifier n3 = new EmailNotifier(new SmsNotifier());
        n3.send();
        System.out.println();

        // 4. 문자 알림
        SmsNotifier n4 = new SmsNotifier();
        n4.send();
        System.out.println();

        // 5. 문자 알림 + 이메일 알림 + 기본 알림
        SmsNotifier n5 = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        n5.send();
        System.out.println();

        // 6. 문자 알림 + 문자 알림 + 이메일 알림 + 기본 알림
        SmsNotifier n6 = new SmsNotifier(new SmsNotifier(new EmailNotifier(new BasicNotifier())));
        ClientNotification.send(n6);
        System.out.println();
        
    }
}
