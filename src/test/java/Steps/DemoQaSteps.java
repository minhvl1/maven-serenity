package Steps;

import commons.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class DemoQaSteps {
    @Managed(driver = "edge",options = "--headless")
    WebDriver driver;
//    public WebDriver driver;
//    public DemoQaSteps(){
//        this.driver = BaseTest.openAndQuitBrowser();
//    }
    @Given("I go to demo qa url")
    public void iGoToDemoQaUrl() {
        driver.get("https://demoqa.com/text-box");
    }

    @When("input {string} fullname textbox")
    public void inputFullnameTextbox(String arg0) {
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(arg0);
    }

    @Then("See result after input textbox")
    public void seeResultAfterInputTextbox() {
        System.out.println(driver.getCurrentUrl());
    }
}