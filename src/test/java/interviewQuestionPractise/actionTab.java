package interviewQuestionPractise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionTab {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		/*Actions  act=new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);
		act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(4000);*/
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		
	}

}
