import org.openqa.selenium.By;
 import org.openqa.selenium.chrome.ChromeDriver;

public class noparashana {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver c1=new ChromeDriver();
	c1.get("http://www.nopareshan.com/");
	c1.findElement(By.id("signup")).click();
 	c1.findElement(By.xpath("//span[contains(@class,'itermsc')]")).click();
	}
	
}
