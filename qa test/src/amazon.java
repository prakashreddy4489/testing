import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String args[]) {
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
	ChromeDriver rv1=new ChromeDriver();
	rv1.get("https://mail.google.com/mail/u/0/#inbox");
	
rv1.findElement(By.id("id=identifierId")).sendKeys("9000766608").click();//
	rv1.findElement(By.className("a-aui_157141-c a-aui_72554-c a-aui_dropdown_187959-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate"+Keys.ENTER));

	}
}
