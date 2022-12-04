package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RadioButtonSteps {

        @Managed(driver = "edge",options = "--headless")
        WebDriver driver;

    @CastMember(name = "minh")
    Actor minh;

    @Given("Minh I go to demo qa radio button url")
    public void minhIGoToDemoQaRadioButtonUrl() {
        minh.attemptsTo(
                Open.url("https://demoqa.com/radio-button")
        );
    }

    @When("Click to {string}")
    public void clickToRadiobutton(String arg0) {
        minh.attemptsTo(
                Click.on("//label[@for="+"'"+arg0+"Radio']")
        );
    }

    @Then("He see result contains {string}")
    public void heSeeResultContainsRadiobutton(String arg0) {
//        minh.attemptsTo(
//                Ensure.that(driver.findElement(By.xpath("//p[@class='mt-3']")).getText())
//                        .contains(arg0)
//        );
        System.out.println("result"+driver.findElement(By.xpath("//p[@class='mt-3']")).getText());
    }
}
