package interviewQuestionPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class menuMouseMove {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/menu/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		
		WebElement framew = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(framew);

		WebElement music = driver.findElement(By.id("ui-id-9"));
		WebElement rock = driver.findElement(By.xpath("//div[@id='ui-id-10']"));
		WebElement classi = driver.findElement(By.xpath("//div[@id='ui-id-12']"));

		Actions act = new Actions(driver);
		act.moveToElement(music).build().perform();
		Thread.sleep(3000);
		act.moveToElement(rock).build().perform();
		Thread.sleep(3000);
		act.moveToElement(classi).build().perform();

	}

}
