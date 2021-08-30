package observe_pattern.Manager;

import observe_pattern.entity.Account;
import observe_pattern.event.EmailEvent;
import observe_pattern.event.SNSEvent;

public class Test {

    public static void main(String[] args) {
        Account account1 = Account.Builder().name("huyen").phone("0868209871").email("huyen26122001@gmail.com").build();
        Account account2 = Account.Builder().name("Thao").email("thao@gmail.com").phone("012312111").build();

        SNSEvent snsEvent = new SNSEvent(account1);
        EmailEvent emailEvent = new EmailEvent(account2);

        AccountPage accountPage = new AccountPage("huyendtt");
        accountPage.sendSMS(FollowType.SMS_DOB,snsEvent);
        accountPage.pushlish("https::a/dtth");

    }
}
