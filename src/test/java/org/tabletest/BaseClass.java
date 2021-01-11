package org.tabletest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	 public static WebDriver driver;
	    public static Alert a;
	    public static Select s;
	    
		public static WebDriver sysLoad() {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreejith\\Eclipse java dev\\BlazeDemo\\Driver\\chromedriver.exe");
	        driver=new ChromeDriver();
	        return driver;
	     }
		
		public static void url(String url) {
			driver.get("https://blazedemo.com/");
	     }
		
		public static void hardcoded(WebElement e,String text) {
			e.sendKeys(text);
	     }
		
		public static void click(WebElement e1) {
			e1.click();
	     }
		
		public static void alert() {
			 a=driver.switchTo().alert();
			 a.accept();
	     }
		
		public static void quit() {
			driver.close();
	     }
		
		public static void maximise() {
			driver.manage().window().maximize();

		}
		
		public void dropDownVisibleText(WebElement e2,String text1) {
			s=new Select(e2);
            s.selectByVisibleText(text1);
		}
		
		public void dropDownValue(WebElement e3,String text2) {
			s=new Select(e3);
            s.selectByValue(text2);
		}
		
		public void clear(WebElement e4) {
		e4.clear();	
        }
}
