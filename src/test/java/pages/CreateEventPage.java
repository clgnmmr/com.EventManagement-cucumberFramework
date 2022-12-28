package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateEventPage {
    public CreateEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
