package ExaminerLogin;

import BasePagePackage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogin extends BasePage {

    public AdminLogin(WebDriver driver){
        super(driver);
    }

    @FindBy(className = "emailVal")
    private WebElement emailAddressTextBox;

    @FindBy(className = "password")
    private WebElement passwordTextBox;

    @FindBy(className = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//a[@class=\"dropdown-toggle nav-link\"]")
    WebElement moreApps;

    @FindBy(xpath = "//a[@href=\"/corporate/v2/examiner/dashboard\"]")
    WebElement examinerAppButton;

    @FindBy(css = "a[href=\"/corporate/v2/examiner/admin/settings\"]")
    WebElement adminDashboard;

    @FindBy(css = "a[href=\"/corporate/v2/examiner/evaluator-dashboard\"]")
    WebElement evaluatorDashboard;



    public void clickLoginBtn() {
        loginButton.click();
    }

    public void clickMoreApps() {
        moreApps.click();
    }

    public void clickExaminerBtn() {
        examinerAppButton.click();
    }

    public void clickAdminDashboard() {
        adminDashboard.click();
    }

    public void evaluatorDashboard(){
        evaluatorDashboard.click();
    }








}
