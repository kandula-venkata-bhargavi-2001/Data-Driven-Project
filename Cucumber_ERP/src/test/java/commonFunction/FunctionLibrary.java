package commonFunction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class FunctionLibrary 
{
	public static WebDriver driver;
	public static Properties conpro;
	
	//Method for Launch Browser
	
	public static WebDriver startBrowser(String name) throws Throwable
	{
	    //Create object for properties class
		
		conpro = new Properties();
		
		//Load Property File
		
		conpro.load (new FileInputStream("./PropertyFiles/Environment.properties"));
		if(conpro.getProperty("Browser").equalsIgnoreCase(name))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else if(conpro.getProperty("Browser").equalsIgnoreCase(name))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			Reporter.log("Browser value is Not Matching",true);
		}
		return driver;
	}

	//Method for Launch Url
	
	public static void openUrl()
	{
		driver.get(conpro.getProperty("Url"));
	}
	
	//Method for Wait for Element
	
	public static void WaitForElement(String LocatorType,String LocatorValue,String MyWait)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(MyWait)));
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorValue)));
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LocatorValue)));
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(LocatorValue)));
		}
	}
	
	//Method for textboxes
	
	public static void typeAction(String LocatorType,String LocatorValue,String TestData)
	{
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(LocatorValue)).clear();
			driver.findElement(By.xpath(LocatorValue)).sendKeys(TestData);
		}
		
		if(LocatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(LocatorValue)).clear();
			driver.findElement(By.name(LocatorValue)).sendKeys(TestData);
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(LocatorValue)).clear();
			driver.findElement(By.id(LocatorValue)).sendKeys(TestData);
		}
	}
	
	//Method for buttons,radio buttons,checkboxes,links and images
	
	public static void clickAction(String LocatorType,String LocatorValue) throws Throwable
	{
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath(LocatorValue)).click();
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			Thread.sleep(2000);
			driver.findElement(By.name(LocatorValue)).click();
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			Thread.sleep(2000);
			driver.findElement(By.id(LocatorValue)).sendKeys(Keys.ENTER);
		}
	}
	//Method for capturing supplier number into notepad
	
	public static void capturesupp(String locatorType,String LocatorValue) throws Throwable
	{
		String supplierNum = "";
		if(locatorType.equalsIgnoreCase("xpath"))
		{
			supplierNum=driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
		}
		if(locatorType.equalsIgnoreCase("name"))
		{
			supplierNum=driver.findElement(By.name(LocatorValue)).getAttribute("value");
		}
		if(locatorType.equalsIgnoreCase("id"))
		{
			supplierNum=driver.findElement(By.id(LocatorValue)).getAttribute("value");
		}
		
		//Create notepad and write suppliernum
		
		FileWriter fW = new FileWriter("./CaptureData/supplier.txt"); 
        BufferedWriter bW = new BufferedWriter(fW);
        bW.write(supplierNum);
        bW.flush();
        bW.close();
        
        //Method for validate supplier number in table
	} 
        public static void supplierTable() throws Throwable
        {
        	//read supplier number from notepad
        	
        	FileReader fr = new FileReader("./CaptureData/supplier.txt");
        	BufferedReader br = new BufferedReader(fr);
        	String Exp_Data = br.readLine();
        	
        	//click search panel if search textbox not displayed
        	
        	if(!driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).isDisplayed())
        		//click search panel button
        	
        	driver.findElement(By.xpath(conpro.getProperty("Search-panel"))).click();
        	driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).clear();
        	Thread.sleep(2000);
        	driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).sendKeys(Exp_Data);
        	Thread.sleep(2000);
        	driver.findElement(By.xpath(conpro.getProperty("Search-button"))).click();
        	Thread.sleep(3000);
        	String Act_Data=driver.findElement(By.xpath("//table[@class='table ewTable']/tbody//tr[1]/td[6]/div/span/span")).getText();
        	Reporter.log(Exp_Data+"   "+Act_Data,true);

        	if(Exp_Data.equals(Act_Data))
        	{
        		Reporter.log("Supplier Number Added Success",true);
        	}
        	else
        	{
        		Reporter.log("Supplier Number Added Fail",true);
        	}
        
}
        
        public static void captureCusto(String locatorType,String LocatorValue) throws Throwable
    	{
    		String customerNum = "";
    		if(locatorType.equalsIgnoreCase("xpath"))
    		{
    			customerNum=driver.findElement(By.xpath(LocatorValue)).getAttribute("value");
    		}
    		if(locatorType.equalsIgnoreCase("name"))
    		{
    			customerNum=driver.findElement(By.name(LocatorValue)).getAttribute("value");
    		}
    		if(locatorType.equalsIgnoreCase("id"))
    		{
    			customerNum=driver.findElement(By.id(LocatorValue)).getAttribute("value");
    		}
    		
    		//Create notepad and write suppliernum
    		
    		FileWriter fW = new FileWriter("./CaptureData/Customer.txt"); 
            BufferedWriter bW = new BufferedWriter(fW);
            bW.write(customerNum);
            bW.flush();
            bW.close();
            
            //Method for validate supplier number in table
    	} 
            public static void CustomerTable() throws Throwable
            {
            	//read supplier number from notepad
            	
            	FileReader fr = new FileReader("./CaptureData/Customer.txt");
            	BufferedReader br = new BufferedReader(fr);
            	String Exp_Data = br.readLine();
            	
            	//click search panel if search textbox not displayed
            	
            	if(!driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).isDisplayed())
            		
            		//click search panel button
            		
            	driver.findElement(By.xpath(conpro.getProperty("Search-panel"))).click();
            	driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).clear();
            	Thread.sleep(2000);
            	driver.findElement(By.xpath(conpro.getProperty("Search-textbox"))).sendKeys(Exp_Data);
            	Thread.sleep(2000);
            	driver.findElement(By.xpath(conpro.getProperty("Search-button"))).click();
            	Thread.sleep(3000);
            	String Act_Data=driver.findElement(By.xpath("//table[@class='table ewTable']/tbody//tr[1]/td[5]/div/span/span")).getText();
            	Reporter.log(Exp_Data+"   "+Act_Data,true);
            	if(Exp_Data.equals(Act_Data))
            	{
            		Reporter.log("Customer Number Added Success",true);
            	}
            	else
            	{
            		Reporter.log("Customer Number Added Fail",true);
            	}
            
    }
//method for close browser
public static void closebrowser() {
	driver.quit();
}
}


        	
        	
        	
        	
        	
 
