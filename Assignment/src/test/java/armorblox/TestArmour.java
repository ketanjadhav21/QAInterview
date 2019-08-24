package armorblox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestArmour {

	WebDriver driver;
	ArmorBloxPOM armorBloxPOM;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver",":\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://yfs5y.codesandbox.io");
	}
	
	
	@Test
	public void armorTest(){
		armorBloxPOM = new ArmorBloxPOM(driver);
		
		armorBloxPOM.ArmorBlox("wuBen", "Armorblox");
		
	}
}
