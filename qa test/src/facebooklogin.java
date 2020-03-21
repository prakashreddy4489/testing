import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver c1=new ChromeDriver();
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c1.get("https://www.facebook.com");
		c1.findElement(By.id("email")).sendKeys("9000766608");
		c1.findElement(By.id("pass")).sendKeys("akhil3888"+Keys.ENTER);
		c1.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/a")).click();
	
				 c1.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/div/div/ul/li[16]/a/div/div[2]/div/div[2]/div/div[1]/strong/span"));
				 
		
		
	}
}
