package models;

import org.joda.time.LocalTime;

public class Item {
    public String user;
    public LocalTime localTime;
    public String message;

    public Item(String user, LocalTime localTime, String message) {
        this.user = user;
        this.localTime = localTime;
        this.message = message;
    }
}
