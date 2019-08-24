package armorblox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArmorBloxPOM {
	
	WebDriver driver;
	By input = By.className("css-1rtrksz select__value-container select__value-container--is-multi");
	By text1 = By.className("css-1rtrksz select__value-container select__value-container--is-multi");
	By text2 = By.className("css-1rtrksz select__value-container select__value-container--is-multi");
	By submit = By.cssSelector("button[type='submit']");
	
	public ArmorBloxPOM(WebDriver driver){
		this.driver = driver;
		
	}
	
	public void settext1(String textFirst){
		WebElement textA = driver.findElement(text1);
		textA.sendKeys(textFirst);
		textA.sendKeys(Keys.DOWN);
		textA.sendKeys(Keys.RETURN);
	}
	
	public void settext2(String textSecond){
		WebElement textB = driver.findElement(text1);
		textB.sendKeys(textSecond);
		textB.sendKeys(Keys.DOWN);
		textB.sendKeys(Keys.RETURN);
	}
	
	public void clickSubmit(){
		 driver.findElement(submit).click();
	}
	
	public void ArmorBlox(String setWuben, String setArmorblox){
		this.settext1(setWuben);
		this.settext2(setArmorblox);
		this.clickSubmit();
	}
	
	
}
