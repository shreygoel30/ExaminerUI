package ExaminerLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogin {
    @FindBy(className = "emailVal")
    private WebElement emailAddressTextBox;

    @FindBy(className = "password")
    private WebElement passwordTextBox;





}
