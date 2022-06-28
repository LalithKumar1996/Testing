package org.test;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
browserLaunch("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
	fill(email, "Lalith");
	WebElement password = driver.findElement(By.id("pass"));
	fill(password, "Lalith@1234");
}
}
