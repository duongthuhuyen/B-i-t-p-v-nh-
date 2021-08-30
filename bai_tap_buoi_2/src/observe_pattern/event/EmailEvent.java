package observe_pattern.event;

import observe_pattern.entity.Account;

public class EmailEvent implements Event{
    private Account account;

    public EmailEvent(Account account) {
        this.account = account;
    }


    @Override
    public void register(String eventType, String name, String url) {
        System.out.println("send message to email is: "+account.getEmail()+", name: "+name+", url: "+url);
    }
}
