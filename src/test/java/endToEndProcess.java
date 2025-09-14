import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class endToEndProcess {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement searchBar=driver.findElement(By.name("q"));
		searchBar.sendKeys("mobiles");
		searchBar.sendKeys(Keys.ENTER);
		WebElement element = driver.findElement(By.xpath("//div[text()='Nokia 105 Single SIM, Keypad Mobile Phone with Wireless FM Radio']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
		
	}

}
