package App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inter {

	public static void main(String[] args) 
	
	{
		 System.setProperty("webdriver.chrome.driver","E:\\web Driver\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.navigate().to("https://onship.app/onship"); 
	     driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Ankita Pawar ");
	     driver.findElement(By.xpath("//input[@id='inputEmail'])")).sendKeys("ankitapawar6242@gmail.com ");
	     driver.findElement(By.xpath("//input[@id='inputPassword'])")).sendKeys(" ");
	     driver.findElement(By.xpath("//div[@class='text-white text-center']")).click();
	     driver.findElement(By.xpath("//button[@class='dropdownToggle btn btn-secondary']").click();
	     driver.findElement(By.xpath("//div[@class='user-profile-links-container']/span").click();
	     driver.findElement(By.xpath ("//div[@class='MuiBox-root css-lrmcrr']").sendkeys("C:\\Users\\hp\\Desktop\\ankita photo");
         driver.findElement(By.xpath("//[@id="panel1-header"]/div[2]/div/svg")).click();
         driver.findElement(By.xpath ("//[@id="panel1-header"]/div[1]/div[2]/svg")).click();

	     

}
