package observe_pattern.Manager;

import observe_pattern.event.Event;

public class AccountPage {
    private String name;
    private EventManager eventManager;

    public AccountPage(String name) {
        this.name = name;
    }

    public AccountPage(String name, EventManager eventManager) {
        this.name = name;
        this.eventManager = eventManager;
    }

    public void sendSMS(String eventType, Event event){
        eventManager.subcrises(eventType,event);
    }
    public void sendEmail(String eventType, Event event){
        eventManager.subcrises(eventType,event);
    }

    public void removeSend(String type,Event event){
        eventManager.unsubcrises(type,event);
    }

    public void pushlish(String url){
        eventManager.notify(FollowType.EMAIL_DOB,name,url);
    }
}
