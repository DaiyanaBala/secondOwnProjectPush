package interviewQuestionPractise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadFile {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/FileUpload.html");
	WebElement upload=driver.findElement(By.cssSelector("input#input-4"));
	Actions act=new Actions(driver);
	act.click(upload).build().perform();
	//Runtime.getRuntime().exec("C:\\Users\\dayana\\OneDrive\\Desktop\\SoftwareTesting\\Selenium\\CoreJava\\interviewQuestionPractise\\src\\test\\java\\interviewQuestionPractisefileupload\\upload.exe"+" "+"C:\\Users\\dayana\\Downloads\\photo.png");
	StringSelection sel=new StringSelection("C:\\Users\\dayana\\Downloads\\photo.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	Thread.sleep(3000);
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	

}

}