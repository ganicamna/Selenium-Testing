package ibu.svvt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

class Selenium_lab2 {
	
	private static WebDriver webDriver;
	private static String baseUrl;
	private static String baseUrl2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\amnag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://www.ibu.edu.ba/";
		baseUrl2 = "http://www.uitestingplayground.com/sampleapp";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.quit();
	}

	/*@Test
	void testDean() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		WebElement menuButton = webDriver.findElement(By.cssSelector("#header__section__white > div.menu__wrap > div.menu__wrap > div.menu__elem > figure"));
		menuButton.click();
		Thread.sleep(2000);
		WebElement facultiesButton = webDriver.findElement(By.cssSelector("#header__section__white > div.menu__wrap > div.menu__wrap > div.desktop__bg > div.desktop__menu__wrap > div > button:nth-child(1)"));
		facultiesButton.click();
		Thread.sleep(2000);
		WebElement facultButton = webDriver.findElement(By.cssSelector("#header__section__white > div.menu__wrap > div.menu__wrap > div.desktop__bg > div.desktop__menu__wrap > div.menu__content__wrap.active__item > div > nav > button:nth-child(1)"));
		facultButton.click();
		Thread.sleep(2000);
		WebElement linkButton = webDriver.findElement(By.linkText("Faculty of Engineering and Natural Sciences"));
		linkButton.click();
		Thread.sleep(2000);
		String deanText = webDriver.findElement(By.className("dean__footer")).getText();
		assertTrue(deanText.contains("Jasmin Kevrić"));
		
	}*/
	/*@Test
	void testSampleApp() throws InterruptedException {
		webDriver.get(baseUrl2);
		
		webDriver.manage().window().maximize();
		
		String header = webDriver.findElement(By.tagName("h3")).getText();
		assertTrue(header.contains("Sample App"));
		Thread.sleep(2000);
		
		String paragraph = webDriver.findElement(By.xpath("/html/body/section/div/p")).getText();
		assertEquals(paragraph.length(), 101);
		
		String loggedOut = webDriver.findElement(By.id("loginstatus")).getText();
		assertTrue(loggedOut.contains("User logged out."));
		
		WebElement username = webDriver.findElement(By.name("UserName"));
		username.sendKeys("wrong");
		Thread.sleep(2000);
		
		WebElement password = webDriver.findElement(By.name("Password"));
		password.sendKeys("credentials");
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		String invalid = webDriver.findElement(By.id("loginstatus")).getText();
		assertTrue(invalid.contains("Invalid username/password"));
		Thread.sleep(2000);
		
	}*/
	@Test
	void testSeach() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		WebElement menuButton = webDriver.findElement(By.cssSelector("#header__section__white > div.menu__wrap > div.menu__wrap > div.menu__elem > figure"));
		webDriver.findElement(RelativeLocator.with(By.tagName("figure")).toLeftOf(menuButton)).click();
		Thread.sleep(2000);
		WebElement searchButton = webDriver.findElement(By.xpath("/html/body/div/div/div/div/section[1]/div/div/div/form/div/div/input"));
		searchButton.sendKeys("engineering");
		Thread.sleep(2000);
		webDriver.findElement(RelativeLocator.with(By.tagName("a")).below(searchButton)).click();
		Thread.sleep(2000);
	}

}
