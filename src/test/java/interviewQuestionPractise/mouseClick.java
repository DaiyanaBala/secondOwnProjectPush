package interviewQuestionPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://formstone.it/components/upload/demo/");
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 592)", "");
		Thread.sleep(4000);*/
		//WebElement click=driver.findElement(By.xpath("(//input[@class='fs-upload-input'])[1]"));
		WebElement ele=driver.findElement(By.xpath("//input[@value='Click']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(ele).build().perform();
		Thread.sleep(4000);
		act.click(ele).build().perform();
	}

}
