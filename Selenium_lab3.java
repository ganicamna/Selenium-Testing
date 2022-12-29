package ibu.svvt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Selenium_lab3 {
	
	private static WebDriver webDriver;
	private static String baseUrl;
	private static String baseUrl2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\amnag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://demoqa.com/checkbox";
		baseUrl2 = "https://www.ebay.com/signin/";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.quit();
	}

//	@Test
//	void testSelenium() throws InterruptedException {
//		webDriver.get(baseUrl);
//		webDriver.manage().window().maximize();
//		WebElement expand = webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/button"));
//		expand.click();
//		Thread.sleep(2000);
//		WebElement documents = webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/ol/li[2]/span/label/span[3]"));
//		documents.click();
//		Thread.sleep(2000);
//		WebElement expand2 = webDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/ol/li[2]/span/button"));
//		expand2.click();
//		Thread.sleep(2000);
//		assertTrue(webDriver.findElement(By.id("tree-node-workspace")).isSelected());
//		assertTrue(webDriver.findElement(By.id("tree-node-office")).isSelected());
//		
//	}
	@Test
	void testSelenium2() throws InterruptedException {
		webDriver.get(baseUrl2);
		webDriver.manage().window().maximize();
		Thread.sleep(20000);
		
		WebElement link = webDriver.findElement(By.linkText("create an account"));
		link.click();
		Thread.sleep(2000);
		
		WebElement plan = webDriver.findElement(By.id("businessaccount-radio"));
		plan.click();
		
		WebElement name = webDriver.findElement(By.id("businessName"));
		name.sendKeys("Amna");
		Thread.sleep(2000);
		
		WebElement mail = webDriver.findElement(By.id("businessEmail"));
		mail.sendKeys("amna.ganic@stu.ibu.edu.ba");
		Thread.sleep(2000);
		
		WebElement password = webDriver.findElement(By.id("bizPassword"));
		password.sendKeys("sifra12345");
		Thread.sleep(2000);
		
		Select country = new Select (webDriver.findElement(By.id("businessCountry")));
		country.selectByValue("BA");
		Thread.sleep(2000);
		
	}

}
