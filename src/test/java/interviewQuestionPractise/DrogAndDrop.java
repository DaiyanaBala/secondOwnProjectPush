package interviewQuestionPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	WebElement current=driver.findElement(By.cssSelector("iframe.demo-frame"));
	driver.switchTo().frame(current);
	WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop).perform();
}
}
