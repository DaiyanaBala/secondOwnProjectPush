package interviewQuestionPractise;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	/*driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.tagName("select"));
	Select select =new Select(ele);
	select.selectByValue("ATG");
	Thread.sleep(4000);
	select.selectByContainsVisibleText("Algeria");
	Thread.sleep(4000);
	select.selectByVisibleText("Costa Rica");
	Thread.sleep(4000);
	select.selectByIndex(19);*/
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	WebElement sel=driver.findElement(By.cssSelector("iframe#iframeResult"));
	driver.switchTo().frame(sel);
	WebElement ele=driver.findElement(By.id("cars"));
	Select select=new Select(ele);
	select.selectByContainsVisibleText("Saab");
	Thread.sleep(4000);
	select.selectByIndex(2);
	Thread.sleep(4000);
	select.selectByValue("audi");
	Thread.sleep(4000);
	select.selectByVisibleText("Volvo");
	List<WebElement> list=select.getOptions();
	for(WebElement list1:list) {
		System.out.println(list1.getText());
	}
	List<WebElement> listSelect=select.getAllSelectedOptions();
	for(WebElement lsit2:listSelect) {
		System.out.println(lsit2.getText());
	}
	
	select.deSelectByContainsVisibleText("Saab");
	Thread.sleep(4000);
	select.deselectByIndex(2);
	Thread.sleep(4000);
	select.deselectByValue("audi");
	Thread.sleep(4000);
	select.deselectByVisibleText("Volvo");
	
	}

}
