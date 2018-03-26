package models;

import org.joda.time.DateTime;

import java.util.List;

public class Chat {
    public DateTime dateTime;
    public int occurrence;
    public List<Item> items;

    public Chat(DateTime dateTime, int occurrence, List<Item> items) {
        this.dateTime = dateTime;
        this.occurrence = occurrence;
        this.items = items;
    }
}
