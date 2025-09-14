package interviewQuestionPractise;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class datePickerAlert {

	public static void main(String[] args) {
		System.getProperty("webdriver,chrome,driver", "C:\\Users\\dayana\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		/*driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
		WebElement date=driver.findElement(By.id("datepicker2"));
		String datePick="06-09-2030";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+datePick+"');",date);*/
		driver.get("https://demo.automationtesting.in/Alerts.html");
		/*driver.findElement(By.cssSelector("[onClick='alertbox()']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		if(alert.getText().equals("I am an alert box!")) {
			alert.accept();
		}*/
		/*driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		if(alert.getText().equals("Press a Button !")) {
			alert.dismiss();
		}*/
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.cssSelector("#Textbox")).click();
		Alert alert=driver.switchTo().alert();
	System.out.println( alert.getText());
	if(alert.getText().equals("Please enter your name")) {
		alert.sendKeys("adaiayan");
		alert.accept();
	}
		
		
	}

}
