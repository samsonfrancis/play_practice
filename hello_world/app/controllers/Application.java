package controllers;

import models.Chat;
import models.Item;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalTime;
import play.*;
import play.mvc.*;
import scala.collection.Seq;
import views.html.*;

import static java.util.Arrays.asList;
import static scala.collection.JavaConversions.asScalaBuffer;

import java.util.*;

public class Application extends Controller {

    public static Result index2() {
        Map<String,String> messageMap = new HashMap<String, String>();
        messageMap.put("message1","message1");
        return ok(play.libs.Json.toJson(messageMap));
    }

    public static Result index3(){
        int level = 1;
        List<Item> list = new ArrayList<Item>();
        Item item = new Item("User 1 ", new LocalTime(), "Message1");
        list.add(item);
        item = new Item("User 2 ", new LocalTime(), "Message2");
        list.add(item);
//        return ok(index.render("OK",level,asScalaBuffer(list)));
        return null;
    }

    public static Result index(){
        DateTime today = new DateTime();
//        DateTime yesterday = new DateTime(Days.ONE);

        Chat chat1 = new Chat(today,1,asList(
                new Item("User1",new LocalTime(),"Message 1"),
                new Item("User2",new LocalTime(),"Message 2"),
                new Item("User3",new LocalTime(),"Message 3"),
                new Item("User4",new LocalTime(),"Message 4")
        ));
        Chat chat2 = new Chat(today,2,asList(
                new Item("User11",new LocalTime(),"Message 1"),
                new Item("User12",new LocalTime(),"Message 2"),
                new Item("User13",new LocalTime(),"Message 3"),
                new Item("User14",new LocalTime(),"Message 4")
        ));
        Chat chat3 = new Chat(today,3,asList(
                new Item("User21",new LocalTime(),"Message 1"),
                new Item("User22",new LocalTime(),"Message 2"),
                new Item("User23",new LocalTime(),"Message 3"),
                new Item("User24",new LocalTime(),"Message 4")
        ));
        Chat chat4 = new Chat(today,4,asList(
                new Item("User31",new LocalTime(),"Message 1"),
                new Item("User32",new LocalTime(),"Message 2"),
                new Item("User33",new LocalTime(),"Message 3"),
                new Item("User34",new LocalTime(),"Message 4")
        ));

        return ok(index.render("Chat List", asScalaBuffer( asList(chat1,chat2,chat3,chat4))));
    }
}
