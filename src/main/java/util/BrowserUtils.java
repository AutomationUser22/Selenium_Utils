package util;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BrowserUtils {
    public void maximizeWindow(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public void setImplicitWait(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }
}
