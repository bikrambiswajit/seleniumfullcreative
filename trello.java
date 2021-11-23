package webdriverbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class trello {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bikpanda\\Desktop\\selenium downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://trello.com/");
		
		//Login
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("user")).sendKeys (new String[]{"bikramp001@gmail.com"});
		Thread.sleep(1000);
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys (new String[]{"Bikram@521"});
		driver.findElement(By.id("login-submit")).click();
		
		Thread.sleep(6000);
		
		//List
		
		driver.findElement(By.xpath("//a[@class='board-tile']")).click();
		Thread.sleep(1000);
		
		//DragAndDrop
		
		WebElement srcElement = driver.findElement(By.xpath("//a[@class='list-card js-member-droppable ui-droppable']"));
		WebElement destElement = driver.findElement(By.xpath("//div[@class='js-list list-wrapper']"));
		
		//Actions action= new Actions(driver);
		
		//action.
		//clickAndHold(srcElement).
		//moveToElement(destElement).
		//release().
		//build().
		//perform();
		
		//action.dragAndDrop(srcElement, destElement).perform();
		
		//logout
		
		driver.findElement(By.xpath("//button[@class='_2Twwgx1RZOAQRy js-open-header-member-menu a0_VCPbYTNd2WP _3TTqkG5muwOzqZ ZOUktZwsING7-0 _1Tu9wiuW4Te8Rx']")).click();
		//driver.findElement(By.xpath("//button[@class='_3Qtx4lodxp9J0E']")).click();
		
	}

}
