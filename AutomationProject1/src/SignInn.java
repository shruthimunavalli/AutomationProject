import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SignInn {


	static{
  
     
    
    System.setProperty("webdriver.chrome.driver","C:\\Users\\shruthi.munavalli\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
   
     }
     WebDriver driver = new ChromeDriver();
     
     	@Test(priority = 1)
     	
    	public void launchBrowser() {
        driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
	    driver.manage().window().maximize();
        
       }
     	
     	@Test(priority = 2)
        public void signIn() throws InterruptedException {
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            Thread.sleep(1000);
        }
     	
     	@Test(priority = 3)
        public void userName() throws InterruptedException {
            driver.findElement(By.id("username")).sendKeys("Sanjana");
            Thread.sleep(1000);
        }
     	
     	
     	@Test(priority = 4)
        public void enterPassword() throws InterruptedException {
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("PaSSword");
            Thread.sleep(1000);
        }
     	
     	@Test(priority = 5)
        public void login() throws InterruptedException {
          driver.findElement(By.cssSelector("a[type='submit']")).click();
            Thread.sleep(1000);
        }
     	
     	
     	
     	
     	
           }
	
	
	


