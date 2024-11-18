package driverFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import applicationLayer.AddEmployee;
import config.Baseclass;
import utilies.ExcelFileUtil;

public class AppTest extends Baseclass
{
	String inputpath="./FileInput/EmpData.xlsx";
	String outputpath="./FileOutput/DataDrivenResults.xlsx";
	ExtentReports report;
	ExtentTest logger;
	String TCSheet="AddEmp";
	@Test
	public void startTest() throws Throwable
	{
		//define path to generate html reports
		report = new ExtentReports("./target/Reports/AddEmp.html");
		
		ExcelFileUtil xl =new ExcelFileUtil(inputpath);
		int rc = xl.rowCount(TCSheet);
		Reporter.log("No of rows are::"+rc,true);
		for(int i=1;i<=rc;i++)
		{
			logger = report.startTest("Add Employee");
			logger.assignAuthor("Ranga");
			String FirstName = xl.getCellData(TCSheet, i, 0);
			String MiddleName = xl.getCellData(TCSheet, i, 1);
			String LastName = xl.getCellData(TCSheet, i, 2);
			logger.log(LogStatus.INFO, FirstName+"-------"+MiddleName+"--------"+LastName);
			AddEmployee emp = PageFactory.initElements(driver, AddEmployee.class);
			boolean res = emp.verifyEmp(FirstName, MiddleName, LastName);
			if(res)
			{
				xl.setCellData(TCSheet, i, 3, "Pass", outputpath);
				logger.log(LogStatus.PASS, "Add Employee Success");
				
			}
			else
			{
				xl.setCellData(TCSheet, i, 3, "Fail", outputpath);
				logger.log(LogStatus.FAIL, "Add Employee Fail");
				
				
			}
			report.endTest(logger);
			report.flush(); 
			
		}
	}
}
