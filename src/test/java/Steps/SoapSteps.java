package Steps;

import constants.FrameworkConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class SoapSteps {
    private static final Logger logger = LogManager.getLogger(SoapSteps.class);
    Response soapResponse;
    @Given("Send restassured request")
    public void sendRestassuredRequest() throws IOException {
        System.out.println("Send restassured request");
        FileInputStream requestBody = new FileInputStream("src/test/resources/data/test.xml");
        RestAssured.baseURI="https://www.dataaccess.com";
        Response response =
                given()
                        .header("Content-Type","text/xml; charset=utf-8")
                        .and()
                        .body(IOUtils.toString(requestBody,"UTF-8"))
                        .when()
                        .post("/webservicesserver/NumberConversion.wso")
                        .then()
                        .statusCode(200)
                        .and()
                        .log().all().extract().response();

        XmlPath xmlPath = new XmlPath(response.asString());
//        List<String> a = xmlPath.getList("NumberToWordsResponse.NumberToWordsResult");
//        System.out.println(a);
//        System.out.println(a.size());
        String NumberToWordsResult= xmlPath.getString("NumberToWordsResponse");
        logger.info("NumberToWordsResult:"+NumberToWordsResult);
    }

    @Given("Send SerenityRest request")
    public void sendSerenityRestRequest() throws IOException {
        System.out.println("Send SerenityRest request");
        FileInputStream requestBody = new FileInputStream("src/test/resources/data/test.xml");
        soapResponse = SerenityRest
                .given()
                .contentType("application/json")
                .header("Content-Type","text/xml; charset=utf-8")
                .body(IOUtils.toString(requestBody,"UTF-8"))
                .when().post("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");

    }

    @Then("extra response")
    public void extraResponse() {
        then().statusCode(200);
        XmlPath xmlPath = new XmlPath(soapResponse.asString());
        String NumberToWordsResult= xmlPath.getString("NumberToWordsResponse");
        logger.info("NumberToWordsResult:"+NumberToWordsResult);
        Assert.assertEquals(NumberToWordsResult,"five hundred ");
    }

    @Given("real xml file and replace")
    public void realXmlFileAndReplace() throws IOException {
        FileInputStream requestBody = new FileInputStream("src/test/resources/data/test1.xml");
        String a = IOUtils.toString(requestBody,"UTF-8");
        a=a.replace("${ubiNum}","90000");
        logger.info(a);

        soapResponse = SerenityRest
                .given()
                    .contentType("application/json")
                    .header("Content-Type","text/xml; charset=utf-8")
                    .body(a)
                .when().post("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
        SerenityRest.restAssuredThat(response -> response.statusCode(200));
        soapResponse.prettyPrint();
        logger.log(FrameworkConstants.NOTICE,soapResponse.getBody().asString());
    }
}
