package service;

import model.EventModel;

import java.util.HashMap;

public class EventHelperService {

    public HashMap<String, Integer> eventOccurence = new HashMap<>();

    public boolean hasEventOccuredBefore(EventModel event) {
        if (eventOccurence.containsKey(event.id)) {
            return true;
        } else {
            eventOccurence.put(event.id, 1);
        }
        return false;
    }
}
