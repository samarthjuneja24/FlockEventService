package controller;

import Interface.EventServiceInterface;
import model.EventModel;
import service.EventAService;
import service.EventBService;

public class EventController {

    public void eventProcesser(EventModel event) throws InterruptedException {
        EventServiceInterface eventServiceInterface;
        if (event.type == "A") {
            eventServiceInterface = new EventAService();
            eventServiceInterface.addNewEvent(event);
            eventServiceInterface.processEvent();
        } else if (event.type == "B") {
            eventServiceInterface = new EventBService();
            eventServiceInterface.addNewEvent(event);
            eventServiceInterface.processEvent();
        } else {
            System.out.println("Event type not found");
        }

    }
}
