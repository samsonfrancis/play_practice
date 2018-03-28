package models;

import play.data.validation.Constraints.*;
import play.libs.F.Option;

import javax.validation.Valid;
import java.util.List;

public class User {
    @Required
    public String name;
    @Required@Min(0)@Max(120)
    public Integer age;
    @Required
    public Boolean female;
    @Required@Email
    public String email;
    @Valid@Required
    public Address address = new Address();
    //    @Valid
    public List<User> friends;
    //    @Valid
    public Option<User> spouse;

}
