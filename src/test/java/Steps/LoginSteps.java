package Steps;

import commons.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginSteps{
    private static final Logger logger = LogManager.getLogger(LoginSteps.class);
//    @Managed(driver = "edge",options = "--headless")
//    WebDriver driver;

    @Managed
    WebDriver driver;
//    public LoginSteps(){
//    this.driver = BaseTest.openAndQuitBrowser();
//    }

    @Given("I go to google")
    public void iGoToGoogle() {
//        logger.info("===Open browser===");
        driver.get("https://www.google.com/");
    }

    @When("search {string}")
    public void search(String arg0) {
//        logger.info("===Search keyword===");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(arg0);
    }

    @When("click search button")
    public void clickSearchButton() {
//        logger.info("===Click search button===");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.RETURN);
    }

    @Then("See result")
    public void seeResult() {
//        logger.info("===See result page===");
        String url =driver.getCurrentUrl();
        System.out.println(url);
    }

    @And("URL contains {string}")
    public void urlContains(String arg0) {
//        logger.info("===Verify result===");
        String url =driver.getCurrentUrl();
        Assert.assertTrue(url.contains(arg0));
    }
}
