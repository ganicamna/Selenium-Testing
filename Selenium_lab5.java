package ibu.svvt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

class Selenium_lab5 {
	
	private static WebDriver webDriver;
	private static String baseUrl;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\amnag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized");
		//options.addArguments("--window-size=768,1024");
		//options.addArguments("--headless");
		//options.addArguments("--user-data-dir=C:\\Users\\amnag\\AppData\\Local\\Google\\Chrome\\User Data");
		
		//webDriver = new ChromeDriver(options);
		webDriver = new ChromeDriver();
		baseUrl = "https://www.atlantbh.com/";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.quit();
	}

	@Test
	void test() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		String handle1 = webDriver.getWindowHandle();
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/div/div/div[2]/nav/ul[1]/li[8]/a[2]/i")).click();
		
		webDriver.switchTo().window(handle1);
		Thread.sleep(2000);
	}

}
