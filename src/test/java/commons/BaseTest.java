package commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class BaseTest {
    private static WebDriver driver;

    public synchronized static WebDriver openAndQuitBrowser() {
        String browser = System.getProperty("BROWSER");
//        String browser ="hchrome";
        System.out.println("Browser name run by command line = " + browser);

        if (driver == null) {

            try {
                if (browser == null) {
                    browser = System.getenv("BROWSER");
                    if (browser == null) {
                        browser = "hchrome";
                    }
                }

                switch (browser) {
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
//                        firefoxOptions.addArguments("start-maximized");
//                        firefoxOptions.addArguments("window-size=1920x1080");
                        driver = new FirefoxDriver(firefoxOptions);
                        break;

                    case "hfirefox":
                        WebDriverManager.firefoxdriver().setup();
                        FirefoxOptions hfirefoxOptions = new FirefoxOptions();
                        hfirefoxOptions.addArguments("--headless");
                        driver = new FirefoxDriver(hfirefoxOptions);
                        break;

                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments("start-maximized");
                        driver = new ChromeDriver(options);
                        break;

                    case "hchrome":
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions chromeOptionsoptions = new ChromeOptions();
                        chromeOptionsoptions.addArguments("--headless");
                        chromeOptionsoptions.addArguments("--disable-dev-shm-usage");
                        chromeOptionsoptions.addArguments("--no-sandbox");
                        driver = new ChromeDriver(chromeOptionsoptions);
                        break;

                    case "hedge":
                        WebDriverManager.edgedriver().setup();
                        EdgeOptions hegdeoptions = new EdgeOptions();
                        hegdeoptions.addArguments("--headless");
                        driver = new EdgeDriver(hegdeoptions);
                        break;

                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        EdgeOptions edgeOptions = new EdgeOptions();
                        edgeOptions.addArguments("start-maximized");
                        driver = new EdgeDriver(edgeOptions);
                        break;

                    default:
//                        driver = new FirefoxDriver();
                        driver = new EdgeDriver();
                        break;

                }
            }
            finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }
//            driver.get("https://tiki.vn/");
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void close() {
        try {
            if (driver != null) {
                openAndQuitBrowser().quit();
            }
        } catch (UnreachableBrowserException e) {
            System.out.println("Can not close the browser");
        }
    }

    private static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            close();
        }
    }

}
