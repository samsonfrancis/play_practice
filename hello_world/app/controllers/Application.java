package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import static scala.collection.JavaConversions.asScalaBuffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application extends Controller {

    public static Result index2() {
        Map<String,String> messageMap = new HashMap<String, String>();
        messageMap.put("message1","message1");
        return ok(play.libs.Json.toJson(messageMap));
    }

    public static Result index(){
        int level = 1;
        List<String> list = Arrays.asList("One","Two","Three","Four");
        return ok(index.render("OK",level,asScalaBuffer(list)));
    }

}
