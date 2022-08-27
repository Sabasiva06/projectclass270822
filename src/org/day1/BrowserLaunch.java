package org.day1;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabas\\eclipse-workspace\\SeleniumDay_1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		js.executeScript("window.location='https://www.facebook.com/'");

		WebElement txtUser = driver.findElement(By.id("email"));
		String cssValue = txtUser.getCssValue("color");
		System.out.println(cssValue);
		txtUser.sendKeys("welcome");
		js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:red')", txtUser);

		String string = js.executeScript("return document.title").toString();
		System.out.println(string);
	}

}
