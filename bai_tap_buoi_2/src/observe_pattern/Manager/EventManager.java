package observe_pattern.Manager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import observe_pattern.event.Event;

public class EventManager {
    private Map<String , List<Event>> events;

    public EventManager(String... types) {
        this.events = new HashMap<>();
        for(String type:types){
            this.events.put(type,new ArrayList<>());
        }
    }

    public void subcrises(String type,Event event){
        List<Event> lists = this.events.get(type);
        lists.add(event);
    }

    public void unsubcrises(String type,Event event){
        List<Event> lists = this.events.get(type);
        lists.remove(event);
    }

    public void notify(String eventType,String name, String url){
        List<Event> lists = events.get(eventType);
        for(Event event:lists){
            event.register(eventType,name,url);
        }
    }
}
