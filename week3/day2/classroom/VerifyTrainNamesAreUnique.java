package week3.day2.classroom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		WebElement checkbox1 = driver.findElementByXPath("//input[@id='chkSelectDateOnly']");

		checkbox1.click();

		Thread.sleep(1000);

		WebElement fromstation = driver.findElementByXPath("//input[@id='txtStationFrom']");

		fromstation.clear();
		fromstation.sendKeys("Mas" + Keys.ENTER);

		WebElement Tostation = driver.findElementByXPath("//input[@id='txtStationTo']");
		Tostation.clear();
		Tostation.sendKeys("sbc" + Keys.ENTER);

		driver.findElementByXPath("//input[@id='buttonFromTo']").click();

		Thread.sleep(2000);

		WebElement checkbox2 = driver.findElementByXPath("//input[@id='chkSelectDateOnly']");

		checkbox2.click();

		Thread.sleep(1000);

		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");

		List<String> list= new ArrayList<String>();



		for (int i = 1; i <= rows.size(); i++) {


			List<WebElement> trains= driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["
					+i+"]/td[2]");

			String trainnames= driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();


			System.out.println(trainnames);;


			for (WebElement string : trains) {


				list.add(string.getText());
			}


		}

		int size= list.size();

		System.out.println("Total number of trains available :"+size);


		System.out.println("*************************************************************************");



		Set<String> set = new HashSet<String>(list);

		for (String temp : set) {

			System.out.println(temp);


		}

		int size1=set.size();

		System.out.println("Total number of trains available by excluding duplicate train name :"+size1);

		if(size==size1) {

			System.out.println("No duplicate in train name");
		}

		else {

			System.out.println("Duplicate in train name exist");
		}

	}

}
