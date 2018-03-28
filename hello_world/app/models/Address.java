package models;

import play.data.validation.Constraints.*;

public class Address {
    @Required
    @Pattern(value = "[A-Z]{1}\\w*, [0-9]+", message = "A Street name starts with ...")
    public String street;
    public Integer houseNumber;
    public String city;
    @Required @MaxLength(2)
    public String country;
}
