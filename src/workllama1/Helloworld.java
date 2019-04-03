package workllama1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld {

	static{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		
	WebDriver driver;
	
	 driver=new ChromeDriver();
	 
	 driver.get("https://www.google.com");
	 String Username=ReadFromExcel.ReadExcelValue("C://FEAT//workllama1//testdata//TestDataFile.xlsx", "Sheet1", 1, 1);
	 String EditedUsername=ReadFromExcel.ReadExcelValue("C://FEAT//workllama1//testdata//TestDataFile.xlsx", "Sheet1", 1, 2);
	 
	 
	 
	 
	 WebElement googleSearchTextBox =driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @title='Search']"));
	 googleSearchTextBox.sendKeys(Username);
	 Thread.sleep(1000);
	 googleSearchTextBox.click();
	 Thread.sleep(1000);
	 googleSearchTextBox.clear();
	 Thread.sleep(1000);
	 googleSearchTextBox.sendKeys(EditedUsername);
	 Thread.sleep(1000);
	 driver.close();
	 driver.quit();

	}

}
