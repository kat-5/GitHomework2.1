package pages;


        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import utils.CommonMethods;

        import java.util.List;

public class EmployeeInformationPage extends CommonMethods {

    @FindBy(id="empsearch_id")
    public WebElement idEmployeeSearch;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement nameEmployeeSearch;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    @FindBy(id="personal_txtEmployeeId")
    public WebElement txtID;

    @FindBy(id="personal_txtOtherID")
    public WebElement otherID;

    @FindBy(id="personal_txtNICNo")
    public WebElement SSN;

    @FindBy(id="personal_txtLicenNo")
    public WebElement DriverLicenseNum;

    @FindBy(id="personal_txtLicExpDate")
    public WebElement DriverLicenseExp;

    @FindBy(id="personal_txtSINNo")
    public WebElement SINNumber;

    @FindBy(id="personal_optGender_2")
    public WebElement Female;

    @FindBy(id="personal_optGender_1")
    public WebElement Male;

    @FindBy(id="personal_cmbMarital")
    public WebElement MaritalStatus;

    @FindBy(id="personal_cmbNation")
    public WebElement Nationality;

    @FindBy(id="personal_DOB")
    public WebElement DOB;


    @FindBy(id="personal_txtEmpNickName")
    public WebElement NickName;

    @FindBy(id="personal_chkSmokeFlag")
    public WebElement Smoker;

    @FindBy(id="personal_txtMilitarySer")
    public WebElement MilitaryService;

    @FindBy(xpath="//table[@id='resultTable']/tbody/tr/td/a")
    public WebElement IdDisplayOnTable;

    @FindBy(id="btnSave")
    public WebElement btnEdit;





    public EmployeeInformationPage(){
        PageFactory.initElements(driver, this);
    }
}
