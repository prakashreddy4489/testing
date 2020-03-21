import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://https://web.whatsapp.com/");//
		c1.findElement(By.id("search")).sendKeys("");
	}}
