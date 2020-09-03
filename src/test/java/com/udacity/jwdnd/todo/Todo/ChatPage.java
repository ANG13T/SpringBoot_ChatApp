package com.udacity.jwdnd.todo.Todo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "messageText")
    private WebElement messageTextInput;

    @FindBy(id = "messageType")
    private WebElement messageTypeInput;

    @FindBy(id = "submit-button")
    private WebElement submitButton;

    public void typeUsername(String username){
        usernameInput.sendKeys(username);
    }

    public void typeMessageText(String messageText){
        messageTextInput.sendKeys(messageText);
    }

    public void typemessageType(String messageType){
        messageTypeInput.sendKeys(messageType);
    }

    public void submit(){
        submitButton.click();
    }


}
