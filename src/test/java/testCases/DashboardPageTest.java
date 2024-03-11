package testCases;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import testBasis.SetUpMain;
import testPages.AdminPage;
import testPages.DashboardPage;
import testPages.LoginPage;


public class DashboardPageTest extends SetUpMain {

	public DashboardPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	LoginPage loginpage;
	DashboardPage dashboardpage;
	AdminPage adminpage;
	


	@BeforeMethod
	public void identifypages() throws IOException, InterruptedException {
		loginpage=new LoginPage();
		dashboardpage=new DashboardPage();
		adminpage=new AdminPage();

	}	


	@Test( enabled=false)
	//@When("I open browser login by {string}  and {string}valid credintials")
	public void get_UrlandTitledashboardPage() throws IOException, InterruptedException {
		
		dashboardpage=	loginpage.perform_Login();
		Thread.sleep(3000);
		


	}


	



}

