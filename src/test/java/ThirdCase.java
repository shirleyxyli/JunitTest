import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by shirley.li on 2016-8-24.
 */
public class ThirdCase {
    private WebDriver driver;
    private String baseUrl;

    @Given("^打开百度首页$")
    public void openUrl() throws Throwable{
        DesiredCapabilities firefoxCap = DesiredCapabilities.firefox();
        firefoxCap.setBrowserName("firefox");
        driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),firefoxCap);
        baseUrl = "https://www.baidu.com/";
        driver.get(baseUrl);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("打开百度首页");
    }

    @When("^输入google进行搜索$")
    public void search() throws Throwable{
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("google");
        driver.findElement(By.id("su")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("输入google,点击搜索");
    }

    @Then("^搜索页面包含google$")
    public void searchResult() throws Throwable{
        assertEquals("Google", driver.findElement(By.cssSelector("a > em")).getText());
        System.out.println("结果包含Google");
        driver.close();
    }
}
