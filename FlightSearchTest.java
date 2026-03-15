import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class FlightSearchTest {

public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.makemytrip.com/");

Thread.sleep(3000);

// close popup
driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

// round trip
driver.findElement(By.xpath("//li[text()='Round Trip']")).click();

// from city
driver.findElement(By.id("fromCity")).click();
driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Kolkata");

// to city
driver.findElement(By.id("toCity")).click();
driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Delhi");

// open calendar
driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();

// capture price elements
List<WebElement> prices = driver.findElements(By.xpath("//span[contains(@class,'price')]"));

List<Integer> priceList = new ArrayList<>();

for(WebElement price : prices)
{
String value = price.getText().replaceAll("[^0-9]", "");
priceList.add(Integer.parseInt(value));
}

int lowestPrice = Collections.min(priceList);

System.out.println("Lowest Price = " + lowestPrice);

// click search
driver.findElement(By.xpath("//a[text()='Search']")).click();

Thread.sleep(5000);

driver.quit();

}
}
