package ExaminerLogin;

import BasePagePackage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogin extends BasePage {
    @FindBy(className = "emailVal")
    private WebElement emailAddressTextBox;

    @FindBy(className = "password")
    private WebElement passwordTextBox;





}
