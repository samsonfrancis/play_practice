package controllers;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.user_form;

public class UserDataController extends Controller {
    public static Form<User> userForm = Form.form(User.class);
    public static Result view(){
        return ok(user_form.render(userForm));
    }
    public static Result save(){
        return ok(user_form.render(userForm.bindFromRequest()));
    }
}
