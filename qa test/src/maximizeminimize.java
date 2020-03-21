import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeminimize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver c1=new ChromeDriver();
c1.get("https://www.linkedin.com/feed/?trk=onboarding-landing");
c1.manage().window().maximize();
Dimension d1=new Dimension(500,600);
c1.manage().window().setSize(d1);
}
}