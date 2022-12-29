package ibu.svvt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Selenium_lab4 {
	
	private static WebDriver webDriver;
	private static String baseUrl;
	private static String baseUrl2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\amnag\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://www.ibu.edu.ba/";
		baseUrl2 = "https://www.klika.us/";
		//webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.quit();
	}

//	@Test
//	void test() {
//		webDriver.get(baseUrl);
//		webDriver.manage().window().maximize();
//		WebElement menuButton = webDriver.findElement(By.cssSelector("#header__section__white > div.menu__wrap > div.menu__wrap > div.menu__elem > figure"));
//	    menuButton.click();
//	    //WebElement contact = webDriver.findElement(By.linkText("Contact us"));
//	    //contact.click();
//	    
//	    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
//	    WebElement contactLink = wait.until(
//	    		ExpectedConditions.visibilityOfElementLocated(
//	    				By.linkText("Contact us")));
//	    contactLink.click();
//	}
//	@Test
//	void test() throws InterruptedException {
//		webDriver.get(baseUrl2);
//		//webDriver.manage().window().maximize();
//		
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
//	    WebElement cookies = wait.until(
//	    		ExpectedConditions.visibilityOfElementLocated(
//	    				By.xpath("/html/body/div[1]/div/div[1]/button")));
//	    cookies.click();
//		Thread.sleep(2000);
//		
//		webDriver.manage().window().maximize();
//		
//		WebElement header = wait.until(
//				ExpectedConditions.invisibilityOfElementLocated(
//						By.tagName("h1"))).getText();
//		//String text = header.getText();
//		assertTrue(header.contains("Built on trust and a passion."));
//		}

}
