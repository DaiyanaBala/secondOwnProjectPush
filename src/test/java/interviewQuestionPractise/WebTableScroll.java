package interviewQuestionPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableScroll {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://colorlib.com/etc/tb/Table_Fixed_Header/index.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("(//tbody/tr/td[@class='cell100 column5'])[40]"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).click().build().perform();
		System.out.println(ele.getText());
	}

}
