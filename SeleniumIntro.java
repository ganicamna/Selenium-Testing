package ibu.svvt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumIntro {
	

	private static WebDriver webDriver;
	private static String baseUrl;
	private static String baseUrl2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\amnag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://ibu.edu.ba";
		baseUrl2 = "https://www.ibu.edu.ba/department-of-information-technologies";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.quit();
	}

	/*@Test
	void testTitle() throws InterruptedException {
		webDriver.get(baseUrl);
		String title = webDriver.getTitle();
		System.out.println("Title: " + title) ;
		assertEquals ("International Burch University | IBU", title);
		Thread.sleep (5000); // remain on the site fora few seconds, before closing it
	}*/
	
	/*@Test
	void testRedirect() throws InterruptedException{
	webDriver.get("https://it.ibu.edu.ba");
	Thread.sleep(2000);
	String currentUrl = webDriver.getCurrentUrl();
	System.out.println( "Current URL: " + currentUrl);
	assertEquals ("https://www.ibu.edu.ba/" , currentUrl) ;
	}*/
	
	/*@Test
	void testTitleAndSource() throws InterruptedException {
		webDriver.get(baseUrl2);
		String title = webDriver.getTitle();
		System.out.println("Title: " + title) ;
		assertEquals ("Department of Information Technology | IBU", title);
		Thread.sleep (5000);
		String source = webDriver.getPageSource();
		assertTrue(source.contains("_next"));
		Thread.sleep (5000);
	}*/
	/*@Test
	void testCovidPage() throws InterruptedException {
		webDriver.get(baseUrl2);
		webDriver.navigate().to(baseUrl + "/covid");
		//String title = webDriver.getTitle();
		//assertEquals("Covid 19 mesures and information | IBU", title);
		webDriver.navigate().back();
		assertEquals(baseUrl, webDriver.getCurrentUrl());
		Thread.sleep (5000);
	}*/
	@Test
	void Test() throws InterruptedException {
		webDriver.get(baseUrl2);
		//webDriver.manage().window().maximize();
		WebElement menuButton = webDriver.findElement(By.cssSelector("#header__section__white > div.menu__wrap > div.menu__wrap > div.menu__elem > figure"));
	    menuButton.click();
	    Thread.sleep (5000);
	    
	    WebElement contactLink = webDriver.findElement(By.cssSelector("#header__section__white > div.menu__wrap > div.menu__wrap > div.desktop__bg > div.sub__menu > a:nth-child(4)"));
	    contactLink.click();
	    Thread.sleep(5000);
	    
	    WebElement name = webDriver.findElement(By.name("fullName"));
	    name.sendKeys("Amna Ganić");
	    Thread.sleep(2000);
	    
	    WebElement email = webDriver.findElement(By.name("email"));
	    email.sendKeys("amna.ganic@stu.ibu.edu.ba");
	    Thread.sleep(2000);
	    
	      
	    
	}

}
