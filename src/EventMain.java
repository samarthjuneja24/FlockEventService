/*
Design an Event orchestration service, which receives events from arbitrary sources and handles passing it on to respective consumers.

Properties:
- 1000 events/sec
- each events take 10 ms to consume
- each event has a single consumer based on it's eventType

Guarantees:

- it should behave as a "real time" service
- in-order handling: per source (identified by sourceId)
- deduplication: if a event is recvd multiple times, ignore all after first one (identified by eventId)
 */

import controller.EventController;
import model.EventModel;

public class EventMain {
    public static void main(String args[]) throws InterruptedException {
        EventController eventController = new EventController();
        EventModel event1 = new EventModel("1", "Hey there event A", "A", "Producer1");
        eventController.eventProcesser(event1);
    }
}
