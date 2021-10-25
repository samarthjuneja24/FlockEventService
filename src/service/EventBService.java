package service;

import Interface.EventServiceInterface;
import model.EventModel;

import java.util.PriorityQueue;
import java.util.Queue;

public class EventBService implements EventServiceInterface {

    public Queue<EventModel> eventQueue = new PriorityQueue<>();

    public void processEvent() throws InterruptedException {
        EventHelperService eventHelperService = new EventHelperService();
        EventModel event = this.getNewEvent();
        if (!eventHelperService.hasEventOccuredBefore(event)) {
            System.out.println("Executing event B");
            Thread.sleep(10);
        } else {
            System.out.println("Event already occured, ignoring the message");
        }
    }

    public void addNewEvent(EventModel event) {
        eventQueue.add(event);
    }

    public EventModel getNewEvent() {
        return eventQueue.poll();
    }
}
