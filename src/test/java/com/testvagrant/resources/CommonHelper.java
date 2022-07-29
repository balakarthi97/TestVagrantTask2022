package com.testvagrant.resources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CommonHelper {
	
	public static String actualMovieNameInWikipedia;
	public static String actualRegionNameInWikipedia;
	public static String actualMovieNameInIMDB;
	public static String actualRegionNameInIMDB;
	
	public static WebDriver driver;
	
	public void launch(String urlToLaunch) {
		
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		    driver.get(urlToLaunch);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void quit () {
		driver.close();
	}
	
	public String propertiesFile(String nameInPropertyFile) throws IOException {
		Properties pobj = new Properties();
		FileReader frObj = new FileReader ("C:\\Users\\Bala karthi\\eclipse-workspace\\TestVagrant-Task\\src\\test\\resources\\credential.properties");
		pobj.load(frObj);
		String stringName = pobj.getProperty(nameInPropertyFile);
		return stringName;
	}
	
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public boolean equals(String value1, String value2) {
		boolean result = value1.equals(value2);
		System.out.println(result);
		return result;
	}
	
	public void assertValidate(String value1 , String value2) {
		Assert.assertEquals(value1, value2);
	}
	
	public void sendKeys(WebElement searchBox , String movieName) {
		searchBox.sendKeys(movieName , Keys.ENTER);
	}
	
	public void click(WebElement elmToClick) {
		elmToClick.click();
	}
	
	public void scrollDown (WebElement elmToClick) {
		Actions actObj = new Actions(driver);
		actObj.moveToElement(elmToClick).perform();;
	}
	
	public String getText (WebElement elmToClick) {
		String getText = elmToClick.getText();
		return getText;
	}
	
	public void waits (WebElement elmToWait) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(elmToWait));
	}
	
	public void jsSendKeys(WebElement elmToSend ,String movieName) {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', movieName)", elmToSend);
	}

}
