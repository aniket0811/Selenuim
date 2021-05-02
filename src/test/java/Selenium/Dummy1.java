package Selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Dummy1 {

	@Test
	public void sample1() throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "D:\\Selenuim Jar\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			Thread.sleep(3000L);
			String veggies[] = { "Cucumber", "Cauliflower", "Beetroot" };
			Dummy1 a = new Dummy1();
			a.addItem(driver, veggies);
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
			Thread.sleep(3000L);
			driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
			driver.findElement(By.cssSelector("button.promoBtn")).click();
			WebDriverWait w = new WebDriverWait(driver,5);
			w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("span.promoInfo"))));
			
			System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		}

		public void addItem(WebDriver driver, String veggies[]) {
			int j = 0;
			List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

			for (int i = 0; i < products.size(); i++) {

				String[] name = products.get(i).getText().split("-");
				String formatedname = name[0].trim();
				List veggiesList = Arrays.asList(veggies);

				if (veggiesList.contains(formatedname)) {

					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

					if (j == veggies.length)
						break;

				}

			}
			

		}

		
	
	
	@Test
	public void sample2() {
		
		System.out.println("sample2");	
	}
	
	
}
