import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightSearchTest {

public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.makemytrip.com/");

Thread.sleep(3000);

driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

driver.findElement(By.xpath("//li[text()='Round Trip']")).click();

driver.findElement(By.id("fromCity")).click();
driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Kolkata");

driver.findElement(By.id("toCity")).click();
driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Delhi");

driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();

driver.findElement(By.xpath("//div[@aria-label='Mon Jan 05 2026']")).click();

driver.findElement(By.xpath("//a[text()='Search']")).click();

Thread.sleep(5000);

driver.quit();
}
}