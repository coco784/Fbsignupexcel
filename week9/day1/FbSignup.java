package week9.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbSignup extends ProjectSpecificMethod  {
	
	@Test(dataProvider="signup")
	public void signUp(String fname,String lname,String email,String pwd,String day,String month, String year) {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys(email);
		driver.findElement(By.id("password_step_input")).sendKeys(pwd);
		driver.findElement(By.id("day")).sendKeys(day);
		driver.findElement(By.name("birthday_month")).sendKeys(month);
		driver.findElement(By.id("year")).sendKeys(year);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	    }
	
	
		
		
		
	

	
}
