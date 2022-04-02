package toolsqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextField {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(("window.scrollBy(0,250)"), " ");
		WebElement form = driver.findElement(By.xpath("//h5[text()='Forms']"));
		form.click();
		js.executeScript(("window.scrollBy(0,250)"), " ");
		WebElement practiceform = driver.findElement(By.xpath("//span[text()='Practice Form']"));
		practiceform.click();
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("sagar");
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("thakare");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("sagar.tttt@GMAIL.COM	");
		driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();
		WebElement mobilenu = driver.findElement(By.xpath("//input[@id=\"userNumber\"]"));
		mobilenu.sendKeys("9856321455");
		WebElement sub = driver.findElement(By.xpath("//div[@id=\"subjectsWrapper\"]//input"));
		sub.sendKeys("i am practicing the form.");

		js.executeScript(("window.scrollBy(0,250)"), " ");
		

		WebElement sportHob = driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-1\"]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(sportHob)).click();;
		sportHob.click();
		WebElement readHob = driver.findElement(By.xpath("//div//input[@id=\"hobbies-checkbox-2\"]"));
		readHob.click();

	}

}
