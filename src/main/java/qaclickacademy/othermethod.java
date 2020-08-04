package qaclickacademy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class othermethod {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-jpg");
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//span[contains(text(),'Choose File')]")).click();
		Thread.sleep(3000);
		String file="C:\\Users\\esmas\\Downloads\\file.exe";
		driver.findElement(By.xpath("//span[contains(text(),'Choose File')]")).sendKeys(file);

	}

}
