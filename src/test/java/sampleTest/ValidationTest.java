package sampleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.BrowserUtils;

public class ValidationTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        BrowserUtils browserUtils = new BrowserUtils();
        browserUtils.maximizeWindow(driver);

    }
}
