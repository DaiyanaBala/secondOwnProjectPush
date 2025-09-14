package interviewQuestionPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bootStrap {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jquery-az.com/jquery/demo.php?ex=152.0_1");
		driver.manage().window().maximize();
		driver.findElement(By.id("btndropdown")).click();
		driver.findElement(By.cssSelector("button.clear")).click();
		driver.findElement(By.id("btndropdown")).click();
		List<WebElement> option=driver.findElements(By.xpath("//ul/li/label[@class='radio-btn']"));
		for(WebElement opt:option) {
			if(opt.getText().equals("Bootstrap")) {
			opt.click();	
			}else if(opt.getText().equals("JavaScript")) {
				opt.click();
			}else if(opt.getText().equals("jQuery")){
				opt.click();
			}
		}
		driver.findElement(By.cssSelector("button.btn-success")).click();
		
		
	}

}

