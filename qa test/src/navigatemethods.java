import org.openqa.selenium.chrome.ChromeDriver;

public class navigatemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver c1=new ChromeDriver();
	c1.get("https://www.youtube.com/");
	c1.navigate().forward();
	c1.get("https://echallan.tspolice.gov.in/publicview/");
c1.navigate().refresh();
}
}