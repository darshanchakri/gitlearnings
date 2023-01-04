import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;


public class Locators_Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darsh\\Downloads\\Selenium-Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.stg.fastenal.com/logon/sign-in");
		driver.findElement(By.name("emailAddress")).sendKeys("chakri.gongloor@yopmail.com");
		driver.findElement(By.cssSelector("input[value='Sign In or Register']")).click();
		driver.findElement(By.xpath("//a[@id='forgotPassword']")).click();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
}
	
}	
