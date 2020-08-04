package qaclickacademy;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		String downloadpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        HashMap<String, Object> chromePrefs=new HashMap<String, Object>();
        chromePrefs.put("profile.default.content_settings.popups",0 );
        chromePrefs.put("download.default_directory", downloadpath);
        ChromeOptions options=new ChromeOptions();
        
        
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://smallpdf.com/pdf-to-jpg");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[contains(text(),'Choose File')]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\esmas\\Downloads\\file.exe");
		WebDriverWait wait=new WebDriverWait(driver,10);
		//before choosing option
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'kuIGAX')]")));
		driver.findElement(By.xpath("//div[contains(@class,'kuIGAX')]")).click();
		//after choosing option
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'cspHdD')]")));
		driver.findElement(By.xpath("//div[contains(@class,'cspHdD')]")).click();
		//download button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Download')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
		
		File f=new File("C:\\Users\\\\esmas\\Downloads\\convert.zip");
		if(f.exists())
		{
			System.out.println("file found");
		}
		
	}

}
