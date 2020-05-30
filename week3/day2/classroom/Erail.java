package week3.day2.classroom;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		WebElement checkbox1 = driver.findElementByXPath("//input[@id='chkSelectDateOnly']");

		checkbox1.click();

		Thread.sleep(1000);

		WebElement fromstation = driver.findElementByXPath("//input[@id='txtStationFrom']");

		fromstation.clear();
		fromstation.sendKeys("Mysore"+Keys.ENTER);

		WebElement Tostation = driver.findElementByXPath("//input[@id='txtStationTo']");
		Tostation.clear();
		Tostation.sendKeys("Hubballi"+Keys.ENTER);


		driver.findElementByXPath("//input[@id='buttonFromTo']").click();

		Thread.sleep(2000);

		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");

		for (int i = 1; i < rows.size(); i++) {

			List<WebElement> cells= driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td");

			for (int j = 1; j < cells.size(); j++) {

				String text=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td["+j+"]").getText();

				System.out.print(text+" ");



			}


			System.out.println();
		}






		System.out.println(" ");





	}

}
