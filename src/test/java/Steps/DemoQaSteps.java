package Steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DemoQaSteps {


//    @Managed(driver = "edge",options = "--headless")
//    WebDriver driver;
   @Managed
    WebDriver driver;
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

    @Given("I go to demo qa radio button url")
    public void iGoToDemoQaRadioButtonUrl() {
        driver.get("https://demoqa.com/radio-button");
    }

    @When("Click {string} button")
    public void clickRadioButton(String button) {
        driver.findElement(By.xpath("//label[@for="+"'"+button.toLowerCase()+"Radio']")).click();
    }

    @Then("See result contain {string}")
    public void seeResultContainRadio(String button) {
        System.out.println("result:"+driver.findElement(By.xpath("//p[@class='mt-3']")).getText());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='mt-3']")).getText().contains(button));
    }
}
