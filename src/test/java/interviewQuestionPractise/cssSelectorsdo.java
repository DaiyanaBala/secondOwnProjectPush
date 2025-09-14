package interviewQuestionPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cssSelectorsdo {
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 /*driver.get("https://www.flipkart.com/");
		 driver.findElement(By.cssSelector("div[class='H6-NpN _3N4_BX']")).click();
		 driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
	 driver.findElement(By.cssSelector("div[class='_2GaeWJ']>img[alt='Fashion']")).click();
	 WebElement ele=driver.findElement(By.cssSelector("a[class=_1BJVlg]:nth-child(1)"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).build().perform();*/
		driver.get("https://demo.automationtesting.in/Alerts.html");
		List<WebElement> list=driver.findElements(By.cssSelector("a[class='analystic']"));
		
		for(WebElement ele:list) {
			if(ele.getText().equalsIgnoreCase("Alert with OK")) {
				ele.click();
			}
		}
	}
}
