import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CalcIOSTest {

    @Test
    public void addTwoNumbers() throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("platformVersion","10.0");
        capabilities.setCapability("deviceName","iPhone Simulator");
        capabilities.setCapability("browserName","");
        capabilities.setCapability("bundleId","Sachin.Kesiraju.Calculator");

        IOSDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //2+2
        driver.findElement(By.name("2")).click();
        driver.findElement(By.name("+")).click();
        driver.findElement(By.name("2")).click();

        //Assertion
//        Assert.assertEquals("4",driver.findElement().getText());

        //Close App
        driver.quit();
    }
}
