package controllers;
import models.TestObject;
import play.mvc.*;
import play.*;
import views.html.*;

public class TestController extends Controller {
    public static Result test(){
        return ok(test.render());
    }

    public static Result getTestObject(){
        TestObject testObject = new TestObject("one","two","three");
        return ok(displayObject.render(testObject));
    }
}
