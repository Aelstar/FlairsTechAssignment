package testPages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBasis.SetUpMain;

public class DashboardPage extends SetUpMain {

	public DashboardPage() throws IOException {

		PageFactory.initElements(driver, this);
	}






	@FindBy(xpath="//a[@href='/web/index.php/admin/viewAdminModule']")
	WebElement Admin_tab;








	public AdminPage goTo_AdminPage() throws IOException  {
		Admin_tab.click();
		return new  AdminPage();
	}

	


	





}
