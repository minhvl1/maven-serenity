package Steps;

import commons.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class ScreenplaySteps {

    @Managed(driver = "firefox",options = "--headless")
    WebDriver driver;

//    @Managed(driver = "chrome", options = "--headless")
//    WebDriver driver;

//    @Managed(driver = "edge",options = "--headless")
//    WebDriver driver;

    @CastMember(name = "Toby")
    Actor toby;


    @Given("Toby I go to demo qa url")
    public void tobyIGoToDemoQaUrl() {
        toby.attemptsTo(
                Open.url("https://demoqa.com/text-box")
        );


    }
    @When("he input {string} fullname textbox")
    public void heInputFullnameTextbox(String arg0) {
        toby.attemptsTo(
                Enter.theValue(arg0)
                        .into("//input[@class=' mr-sm-2 form-control']")
                        .thenHit(Keys.RETURN)
        );

    }
    @Then("he See result after input textbox")
    public void heSeeResultAfterInputTextbox() {
        System.out.println(driver.getCurrentUrl());
    }

    @When("he input {string} email textbox")
    public void heInputEmailTextbox(String arg0) {
        toby.attemptsTo(
                Enter.theValue(arg0)
                        .into("//input[@id='userEmail']")
                        .thenHit(Keys.RETURN)
        );
    }
}
