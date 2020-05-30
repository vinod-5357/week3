package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);




		//To find number of rows and column

		WebElement table = driver.findElementByXPath("//table[@id='table_id']");

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		int rowsize = rows.size();

		System.out.println("Number of rows in a table :" + rowsize);

		WebElement tabledata = driver.findElementByXPath("//table[@id='table_id']//tr[2]");

		List<WebElement> columns = tabledata.findElements(By.tagName("td"));

		int coloumnsize = columns.size();

		System.out.println("Number of columns in a table :" + coloumnsize);






		//Progress of learn to interact with elements

		String progress = driver.findElementByXPath("//td[text()='Learn to interact with Elements']/following::td").getText();

		System.out.println("Progress of learn to interact with elements is :"+progress);


		//Check the vital task for the least completed progress.


		List<WebElement> progresslist = driver.findElementsByXPath("//td[2]");

		List<Integer> numlist = new ArrayList<Integer>();

		for (WebElement eachprogress : progresslist) {

			String text = eachprogress.getText().replace("%", "");

			Integer.parseInt(text);

			numlist.add(Integer.parseInt(text));


		}

		System.out.println("List of Progress :"+numlist);

		Integer minvalue = Collections.min(numlist);

		System.out.println("Minimum progress value :"+minvalue);


		driver.findElementByXPath("//td[text()='30%']/following::td/input").click();


	}

}
