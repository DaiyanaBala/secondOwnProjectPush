package interviewQuestionPractise;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//input[@value=\"I'm Feeling Lucky\"]/following::input[@value=\"I'm Feeling Lucky\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'",element );
		takeScreenshot(driver);
	}
	public static void takeScreenshot(WebDriver driver) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timestamp = now.format(formatter);

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshots/screenshot_" + timestamp + ".png");
        System.out.println(dest+" "+src);
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
