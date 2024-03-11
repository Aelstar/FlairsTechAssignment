package testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBasis.SetUpMain;
import testPages.AdminPage;
import testPages.DashboardPage;
import testPages.LoginPage;

public class AdminPageTest extends SetUpMain{

	public AdminPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}




	LoginPage loginpage;
	DashboardPage dashboardpage;
	
	AdminPage adminpage;


	@BeforeMethod
	public void identifypages() throws IOException {


		loginpage	=new LoginPage();
		dashboardpage	=new DashboardPage();
		
		adminpage=new AdminPage();


	}


	@Test(priority=1)
//	@When("I open browser login by {string}  and {string}valid credintials")
	public void get_NoOfRecords() throws IOException, InterruptedException {

		dashboardpage=loginpage.perform_Login();
		adminpage=dashboardpage.goTo_AdminPage();
		adminpage.NOofRecords();
	

	}
	

	@Test(priority=2)
	//@When("I Added Data For New Users {string} and {string} and {string} and {string}")
	public void addUserToSystem() throws IOException, InterruptedException {
		dashboardpage=loginpage.perform_Login();
		adminpage=dashboardpage.goTo_AdminPage();
		int RowsBefore= adminpage.NOofRecords();
		adminpage.addEmployee("A","ahmed abdelstar","P@ssw0rd123","P@ssw0rd123");
		int RowsAfter= adminpage.NOofRecords();
		Assert.assertEquals(RowsBefore+1, RowsAfter);
		
		
	}
	
	
//	@DataProvider	
//	public Object[][] testData() throws IOException {
//		
//		Object Data[][]=testUtils.ExtractExcel.readExcel("Sheet1");
//		return Data;
//	}
//	
//	@DataProvider	
//	public Object[][] testDataSearch() throws IOException {
//		
//		Object Data[][]=testUtils.ExtractExcel.readExcel("Sheet2");
//		return Data;
//	}
	
	
	@Test(priority=3 )
	//@When("	I Added Data For search about New Users {string}")
	public void searchAbboutAddedUser() throws IOException, InterruptedException, AWTException {
		
		dashboardpage=loginpage.perform_Login();
		adminpage=dashboardpage.goTo_AdminPage();
		adminpage.searchUser("ahmed abdelstar");
		
	}
	
	@Test(priority=4 )
//	@When("	I Added Data For search about New Users {string}")
//	@When(" I Want To Delete New Added Users {string}")
	public void deleteAddedUser() throws IOException, InterruptedException, AWTException {
		dashboardpage=loginpage.perform_Login();
		adminpage=dashboardpage.goTo_AdminPage();
		
		int RowsBefore= adminpage.NOofRecords();
		
		adminpage.searchUser("ahmed abdelstar");
		adminpage.deleteUser();
		
		int RowsAfter= adminpage.NOofRecords();
		Assert.assertEquals(RowsBefore-1, RowsAfter);
		
	}
	
	
	
	
	


}
