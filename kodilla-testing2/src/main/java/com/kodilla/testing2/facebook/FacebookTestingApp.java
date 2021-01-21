package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {
    public static String ACCEPT_COOKIE_SELECT = "u_0_h";
    public static String CREATE_ACCOUNT_SELECT = "u_0_2";
    public static String BIRTHDAY_DAY_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static String BIRTHDAY_MONTH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static String BIRTHDAY_YEAR_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookie = driver.findElement(By.id(ACCEPT_COOKIE_SELECT));
        acceptCookie.click();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement createAccount = driver.findElement(By.id(CREATE_ACCOUNT_SELECT));
        createAccount.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.switchTo().activeElement();

        WebElement selectDay = driver.findElement(By.xpath(BIRTHDAY_DAY_SELECT));
        Select fillDay = new Select(selectDay);
        fillDay.selectByIndex(3);
        WebElement selectMonth = driver.findElement(By.xpath(BIRTHDAY_MONTH_SELECT));
        Select fillMonth = new Select(selectMonth);
        fillMonth.selectByIndex(9);
        WebElement selectYear = driver.findElement(By.xpath(BIRTHDAY_YEAR_SELECT));
        selectYear.sendKeys("1990");
    }
}
