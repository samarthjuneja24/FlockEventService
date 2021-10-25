package Interface;

import model.EventModel;

public interface EventServiceInterface {
    public void processEvent() throws InterruptedException;

    public void addNewEvent(EventModel event);

    public EventModel getNewEvent();
}
