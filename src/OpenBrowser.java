import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoke browser//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darsh\\Downloads\\Selenium-Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\darsh\\Downloads\\Selenium-Java\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://firefox.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.close();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\darsh\\Downloads\\Selenium-Java\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://microsoftedge.com");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		driver2.close();
		

	}

}
