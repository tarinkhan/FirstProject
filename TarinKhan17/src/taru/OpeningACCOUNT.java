package taru;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class OpeningACCOUNT {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\Tarin Kabir\\Desktop\\gecko.exe");
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en");
	}

	@Test
	public void Namebox() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Taran");
		driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("Kabir");
		driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys("tahakabir02@gmail.com");
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).sendKeys("12345678");

		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
		driver.findElement(By.xpath(".//*[@id=':0']")).click();
		driver.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys("09");
		driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys("1989");
		driver.findElement(By.xpath(".//*[@id='Gender']/div]")).click();
		driver.findElement(By.xpath(".//*[@id='Gender']/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).sendKeys("3456782175");
		driver.findElement(By.xpath(".//*[@id='RecoveryEmailAddress']")).sendKeys("tahakabir02@gmail.com");
		driver.findElement(By.xpath(".//*[@id=':i']")).click();

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
