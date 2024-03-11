package testPages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBasis.SetUpMain;

public class AdminPage extends SetUpMain{

	public AdminPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}




	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement Add_buttton;

	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	WebElement  SelectUserRole;

	@FindBy(xpath="(//div[@role='listbox']//child::div)[2]")
	WebElement  SetuserAdmin;



	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	WebElement  SelectStatus;

	@FindBy(xpath="(//div[@role='listbox']//child::div)[2]")
	WebElement  SetuserEnabled;

	@FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input[@placeholder='Type for hints...']")
	WebElement  EmployeeName_field;

	@FindBy(xpath="(//div[@role='listbox']//child::div)[1]")
	WebElement  SetEmployeeName;

	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement  UserName_field;


	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement  Password_filed;

	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement  ConfirmPassword_filed;

	@FindBy(xpath="//button[@type='submit']")
	WebElement  Save_button;


	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']")
	WebElement Search_field;



	@FindBy(xpath="//div[@class='oxd-form-actions']//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement Search_button;
	

	@FindBy(xpath="//div[@class='oxd-form-actions']//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	WebElement Reset_button;
	

	@FindBy(xpath="//div[@class='oxd-table-cell-actions']//button[@class='oxd-icon-button oxd-table-cell-action-space'][1]")
	WebElement Delete_button;

	@FindBy(xpath="//div[@class='orangehrm-modal-footer']//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement ConfirmDelete_button;


	public int NOofRecords() throws InterruptedException {

		List<WebElement> rowsNumber = driver.findElements(By.xpath("//div[@class='oxd-table-card']"));
		int rowCount = rowsNumber.size();
		System.err.println("No of rows in this table : " + rowCount);
		return rowCount;


	}

	public  void addEmployee(String EmployeeName, String UserName,String Password,String  ConfirmPassword) throws InterruptedException {

		Add_buttton.click();
		SelectUserRole.click();
		SetuserAdmin.click();

		SelectStatus.click();
		SetuserEnabled.click();

		EmployeeName_field.sendKeys(EmployeeName);
		Thread.sleep(3000);
		SetEmployeeName.click();
		UserName_field.sendKeys(UserName);
		Password_filed.sendKeys(Password);
		ConfirmPassword_filed.sendKeys(ConfirmPassword);
		Save_button.click();
		Thread.sleep(3000);

	}
	



	public void searchUser(String UserName) {

		Search_field.sendKeys(UserName);
		Search_button.click();

	}

	public void deleteUser() throws InterruptedException {

		Delete_button.click();
		ConfirmDelete_button.click();
		Thread.sleep(3000);
		Reset_button.click();
		


	}





}


