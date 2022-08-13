package sample;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("Login")).click();
		driver.findElement(By.className("decorativesubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("CreateLeadForm_firstname")).sendKeys("sathya");
		driver.findElement(By.id("CreateLeadForm_lastname")).sendKeys("kumaran");
		driver.findElement(By.id("CreateLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("CreateLeadForm_DepartmentField")).sendKeys("Testing");
		driver.findElement(By.id("CreateLeadForm_Description")).sendKeys("Selenium WedDriver");
		driver.findElement(By.id("CreateLeadForm_primaryEmail")).sendKeys("sathyakumaran19@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.findElement(By.className("SubMenuButton")).clear();
		driver.findElement(By.id("CreateLeadForm_companyName")).click();
		driver.findElement(By.id("CreateLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("CreateLeadForm_firstname")).clear();
		driver.findElement(By.id("CreateLeadForm_firstname")).sendKeys("sathya");
		driver.findElement(By.name("submitButton")).click();
		String title_duplicate=driver.getTitle();
		System.out.println(title_duplicate);

		
		

		
	}

}
