package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
   public WebDriver driver;
   final String URL = "https://boka.techbuddy.io/";
   
   @BeforeClass
   public static void setupClass() {
       WebDriverManager.chromedriver().setup();
   }

   @BeforeClass
   @Parameters(value={"username","password"})
   public void setupTest(String user, String pass) {
	   System.setProperty(user, pass);
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.get(URL);
       driver.findElement(By.xpath("//div/input[@class='el-input__inner']")).sendKeys(user);
       driver.findElement(By.xpath("//div/button[@class='el-button submit-button el-button--primary']")).click(); 
   
       (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='form-group']/h3[text()='Kod']")));
       driver.findElement(By.xpath("//div[@class='el-input']/input[@class='el-input__inner']")).sendKeys(pass);
       driver.findElement(By.xpath("//button[@class='el-button submit-button el-button--primary']")).click();
   }
   
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
   }
