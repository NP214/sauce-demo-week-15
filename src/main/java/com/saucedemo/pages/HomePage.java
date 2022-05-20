package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement Pwd;
    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement logIn;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]")
    WebElement sortBy;
    @CacheLookup
    @FindBy(css = "[class='inventory_item_price']")
    List<WebElement> priceElement;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement HighestAddToCart;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement cheapestPrice;
    @CacheLookup
    @FindBy(id = "shopping_cart_container")
    WebElement cart;
@CacheLookup
@FindBy(xpath = "//button[@id='checkout']")
WebElement checkOut;

    public void enterUsername(String username) {
        log.info("enter user name " + userName.toString());
        sendTextToElement(userName, username);
    }

    public void enterPassword(String password) {
        log.info("enter password " + Pwd.toString());
        sendTextToElement(Pwd, password);
    }

    public void clickOnLogInButton() {
        log.info("click on login button" + logIn.toString());
        clickOnElement(logIn);
    }

    public void selectSortBy(String sortby) {
        log.info("select sort by " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, sortby);
    }

public void higestAddtoCart(){
    log.info("select costliest product " + HighestAddToCart.toString());
        clickOnElement(HighestAddToCart);
}
public void clickOncart(){
    log.info("click on shopping cart" + cart.toString());
        clickOnElement(cart);
}
public void clickOnCheckout(){
    log.info("click on checkout " + checkOut.toString());
        clickOnElement(checkOut);
}
@CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
WebElement firstName;
@CacheLookup
@FindBy(xpath = "//input[@id='last-name']")
WebElement lastName;
@CacheLookup
@FindBy(xpath = "//input[@id='postal-code']")
WebElement zip;
@CacheLookup
@FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;
public void enterFirstName(String fname){
    log.info("enter first name " + firstName.toString());
    sendTextToElement(firstName,fname);
}
    public void enterLasttName(String lname){
        log.info("enter last name" + lastName.toString());
        sendTextToElement(lastName,lname);
    }
    public void enterZip(String Zip){
        log.info("enter zip " + Zip.toString());
        sendTextToElement(zip,Zip);
    }
    public void clickOnContinueButton(){
        log.info("click on continue button " + continueButton.toString());
    clickOnElement(continueButton);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finish;
public void clickOnFinish(){
    log.info("click on finish button" + finish.toString());
    clickOnElement(finish);
}
@CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement Message;
public void verifyMessage(String msg){
    log.info("verify message  " + Message.toString());
    String actualText = getTextFromElement(Message);
    Assert.assertEquals(actualText,msg);
}
public void clickOnCheapestAddToCart(){
    log.info("select cheapest product" + cheapestPrice.toString());
    clickOnElement(cheapestPrice);
}
}



