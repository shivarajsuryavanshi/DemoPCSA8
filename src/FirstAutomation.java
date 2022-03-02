import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium Programs\\Chrome Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[2]/div[2]/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Pune Corporation");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();
		
		//driver.get("https://www.udemy.com/?deal_code=&utm_source=aff-campaign&utm_medium=udemyads&utm_term=Homepage&utm_content=Textlink&utm_campaign=Admitad-default&admitad_uid=63394a8e012aa7b2a2bf455c3af0fb51&publisher_id=1031055&website_id=1105402");
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[6]/a/span")).click();
//		driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F%3Fdeal_code%3D%26utm_source%3Daff-campaign%26utm_medium%3Dudemyads%26utm_term%3DHomepage%26utm_content%3DTextlink%26utm_campaign%3DAdmitad-default%26admitad_uid%3D63394a8e012aa7b2a2bf455c3af0fb51%26publisher_id%3D1031055%26website_id%3D1105402");
//		driver.findElement(By.id("email--1")).sendKeys("goraksha220@gmail.com");
//		driver.findElement(By.id("id_password")).sendKeys("Goraksha7419");
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/form/div[2]/div/input")).click();
	//	driver.close();
		
	}

}
