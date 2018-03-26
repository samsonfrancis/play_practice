package controllers;
import play.mvc.*;
import play.*;
import views.html.*;

public class TestController extends Controller {
    public static Result test(){
        return ok(test.render());
    }
}
