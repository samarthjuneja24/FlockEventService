package model;

public class EventModel {

    public String id;

    public String message;

    public String type;

    public String source;

    public EventModel(String id, String message, String type, String source) {
        this.id = id;
        this.message = message;
        this.type = type;
        this.source = source;
    }
}