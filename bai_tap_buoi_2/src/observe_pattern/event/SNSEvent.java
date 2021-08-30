package observe_pattern.event;

import observe_pattern.entity.Account;

public class SNSEvent implements Event {

    private Account acount;

    public SNSEvent(Account acount) {
        this.acount = acount;
    }

    @Override
    public void register(String eventType, String name, String url) {
        System.out.println("SMS send to phone is: "+acount.getPhone()+", name is: "+name +",content: "+eventType);

    }
}
