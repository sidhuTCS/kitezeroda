package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LOGINBTN;

public Pom1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	public void enterUN(String username) {
		UN.sendKeys(username);
	}
	public void enterPWD(String passward) {
		PWD.sendKeys(passward);
	}
	public void clickLOGINBTN() {
		LOGINBTN.click();
	}
}

