package Steps;

import commons.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginSteps {

    public WebDriver driver;
    public LoginSteps(){
    this.driver = BaseTest.openAndQuitBrowser();
    }

    @Given("I go to google")
    public void iGoToGoogle() {
        driver.get("https://www.google.com/");
    }

    @When("search {string}")
    public void search(String arg0) {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(arg0);
    }

    @When("click search button")
    public void clickSearchButton() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
    }

    @Then("See result")
    public void seeResult() {
        String url =driver.getCurrentUrl();
        System.out.println(url);
    }

    @And("URL contains {string}")
    public void urlContains(String arg0) {
        String url =driver.getCurrentUrl();
        Assert.assertTrue(url.contains(arg0));
    }
}
