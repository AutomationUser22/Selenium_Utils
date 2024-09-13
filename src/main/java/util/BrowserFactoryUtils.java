package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactoryUtils {
    public WebDriver getDriver(String browser) {
        LoggerUtils logger = new LoggerUtils();
        try {
            return switch (browser.toLowerCase()) {
                case "chrome" -> new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications", "--incognito"));
                case "firefox" -> new FirefoxDriver(new FirefoxOptions().addArguments("--disable-notifications", "--private"));
                case "edge" -> new EdgeDriver();
                default -> throw new IllegalArgumentException("Unsupported browser: " + browser);
            };
        } catch (Exception e) {
            logger.warn("Browser Factory Util is not able to create driver", e);
        }
        return null;
    }
}

