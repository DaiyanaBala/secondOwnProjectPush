package interviewQuestionPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class waitProject {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#userName")).sendKeys("Gomathy");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("gomathy@gmail.com");
		driver.findElement(By.cssSelector("#currentAddress.form-control")).sendKeys("Saibaba colony");
		driver.findElement(By.cssSelector("#permanentAddress.form-control")).sendKeys("Coimbatore");
		Actions act=new Actions(driver);
		
		driver.findElement(By.cssSelector("#submit")).click();
	}

}
