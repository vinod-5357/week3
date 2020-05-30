package week3.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.redbus.in/");


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		WebElement from =driver.findElementByXPath("//input[@id='src']");
		from.sendKeys("Chennai",Keys.ENTER,Keys.TAB);

		Thread.sleep(1000);

		WebElement to= driver.findElementByXPath("//input[@id='dest']");
		to.sendKeys("Bangalore",Keys.ENTER,Keys.TAB);

		Thread.sleep(1000);


		driver.findElementByXPath("//label[@for='onward_cal']").click();

		driver.findElementByXPath("//table[contains(@class,'rb-monthTable first')]/following::table/tbody[1]/tr[1]/td[3]/button[1]").click();

		Thread.sleep(1000);

		driver.findElementByXPath("//table[contains(@class,'rb-monthTable first')]/following::table//tr[5]/td[6]").click();

		driver.findElementByXPath("//label[@for='return_cal']").click();

		driver.findElementByXPath("//table[contains(@class,'rb-monthTable first')]/following::table//tr[6]/td[6]").click();

		Thread.sleep(1000);

		driver.findElementByXPath("//button[@id='search_btn']").click();

		Thread.sleep(3000);

		String Response = driver.findElementByXPath("//div[contains(@class, 'error-view')]//h3").getText();

		System.out.println(Response);

		//When search button is clicked no function is done, no error printed in console.
	}

}
