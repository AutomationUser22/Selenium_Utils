package util;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookiesUtils {
    public static void addCookie(WebDriver driver, String name, String value) {
        Cookie cookie = new Cookie(name, value);
        driver.manage().addCookie(cookie);
    }

    public static void deleteCookie(WebDriver driver, String name) {
        driver.manage().deleteCookieNamed(name);
    }

    public static Cookie getCookie(WebDriver driver, String name) {
        return driver.manage().getCookieNamed(name);
    }
}

