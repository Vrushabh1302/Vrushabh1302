package com.abc.Pages1234;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.UtilityClass1234.BaseClass1234;

public class LoginPage1234 extends BaseClass1234 {
	public LoginPage1234() {
		PageFactory.initElements(driver1234, this);
	}

	@FindBy(id = "txtUsername")
    WebElement username1234;

	public WebElement getusernametxt() {
		return username1234;
	}

	@FindBy(id = "txtPassword")
	WebElement password1234;

	public WebElement getpasswordtxt() {
		return password1234;
	}

	@FindBy(id = "btnLogin")
	WebElement loginbtn1234;

	public WebElement getloginbuttontxt() {
		return loginbtn1234;
	}

	public void login1234(String Username, String Password) {
		getusernametxt().sendKeys(Username);
		getpasswordtxt().sendKeys(Password);
		getloginbuttontxt().click();
	}

}
