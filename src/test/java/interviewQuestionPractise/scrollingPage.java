package interviewQuestionPractise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		for(String presentWindow:allWindows) {
			if(!presentWindow.equals(parentWindow)) {
				driver.switchTo().window(presentWindow);
				WebElement ele=driver.findElement(By.xpath("(//a[@class='border-0'])[2]"));
				Actions act=new Actions(driver);
				act.scrollToElement(ele).build().perform();
				driver.close();
				break;
			}
		}
		driver.switchTo().window(parentWindow);
	}

}
