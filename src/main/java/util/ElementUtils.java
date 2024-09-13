package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
    public void clickElement(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void sendKeysToElement(WebDriver driver, By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    public String getElementText(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }
}

