package com.udacity.jwdnd.todo.Todo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    @FindBy(id = "inputFirstName")
    private WebElement firstNameInput;

    @FindBy(id = "inputLastName")
    private WebElement lastNameInput;

    @FindBy(id = "inputUsername")
    private WebElement usernameInput;

    @FindBy(id = "inputPassword")
    private WebElement passwordInput;

    @FindBy(id = "submit-button")
    private WebElement submitButton;

    public void typeFirstname(String firstname){
        firstNameInput.sendKeys(firstname);
    }

    public void typeLastname(String lastname){
        lastNameInput.sendKeys(lastname);
    }

    public void typeUsername(String username){
        usernameInput.sendKeys(username);
    }

    public void typePassword(String password){
        passwordInput.sendKeys(password);
    }

    public void submit(){
        submitButton.click();
    }
}
