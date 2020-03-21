import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver c1=new ChromeDriver();
	c1.get("https://www.youtube.com/");
	String s1=c1.getPageSource();
	System.out.println(s1
			);

	
	}
}
