import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qedgetest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );

WebDriver driver =new ChromeDriver();

driver.get("http://orangehrm.qedgetech.com");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[5]/input")).click();
	}
}