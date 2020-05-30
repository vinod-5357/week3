package week3.day2.assignment;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;




public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");



		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.cleartrip.com/");


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		driver.findElementByXPath("//input[@id='RoundTrip']").click();



		WebElement fromcity= driver.findElementByXPath("//input[@id='FromTag']");
		fromcity.sendKeys("MAA",Keys.TAB);
		Thread.sleep(1000);



		WebElement tocity= driver.findElementByXPath("//input[@id='ToTag']");
		tocity.sendKeys("DXB",Keys.TAB);
		Thread.sleep(1000);



		driver.findElementByXPath("//input[contains(@class,'depart_date keyValue')]").click();
		Thread.sleep(1000); 

		driver.findElementByXPath(
				"//table[@class='calendar']/following::table/tbody[1]/tr[3]/td[6]/a[1]").click();



		Thread.sleep(1000); driver.findElementByXPath(
				"//table[@class='calendar']/tbody[1]/tr[4]/td[4]/a[1]").click();

		Thread.sleep(1000); WebElement adults=
				driver.findElementByXPath("(//select[@class='span span15'])[1]");

		Select select = new Select(adults);

		select.selectByValue("2");


		WebElement Infants = driver.findElementByXPath("//select[@class='span span16']");

		Select select1 = new Select(Infants);

		select1.selectByValue("1");


		driver.findElementByXPath("(//a[@class='weak'])[2]").click();

		WebElement travelClass= driver.findElementByXPath("//select[@class='span span20']");

		Select select2 = new Select(travelClass);

		select2.selectByVisibleText("Economy");

		Thread.sleep(1000);

		driver.findElementByXPath("(//input[contains(@class,'span span24')])[5]").sendKeys(
				"emirates",Keys.TAB);

		Thread.sleep(1000);

		driver.findElementByXPath("(//input[@type='submit'])[2]").click();






	}

}
