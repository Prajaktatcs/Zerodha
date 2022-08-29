
package Pom_classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	@FindBy(xpath="//input[@id='userid']")private  WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement pwd;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement clkbtn;
	//initialisation
	//initialisation
	
	public Pom1(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//Utilisation
	public void enterun(String Username) {
		UN.sendKeys(Username);
		}
	public void enterpwd(String passward) {
		pwd.sendKeys(passward);
	}
	public void clickbutton() {
		clkbtn.click();
	}
}
