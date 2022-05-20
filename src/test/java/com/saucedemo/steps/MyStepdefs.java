package com.saucedemo.steps;

import com.saucedemo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {

    }

    @When("^I login with credential username \"([^\"]*)\"$")
    public void iLoginWithCredentialUsername(String username) throws InterruptedException {
        Thread.sleep(2000);
new HomePage().enterUsername(username);
    }

    @And("^enter password \"([^\"]*)\"$")
    public void enterPassword(String password) throws InterruptedException {
        Thread.sleep(2000);
new HomePage().enterPassword(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().clickOnLogInButton();

    }

    @And("^I filter the products by sortby \"([^\"]*)\"$")
    public void iFilterTheProductsBySortby(String sortby) {
        new HomePage().selectSortBy(sortby);

    }


    @And("^I click on add to basket$")
    public void iClickOnAddToBasket() throws InterruptedException {
        new HomePage().higestAddtoCart();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
new HomePage().clickOncart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new HomePage().clickOnCheckout();
    }


    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String fname) {
       new HomePage().enterFirstName(fname);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lname) {
       new HomePage().enterLasttName(lname);
    }

    @And("^I enter zip \"([^\"]*)\"$")
    public void iEnterZip(String Zip) {
       new HomePage().enterZip(Zip);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new HomePage().clickOnContinueButton();
    }

    @Then("^I should able to see message \"([^\"]*)\"$")
    public void iShouldAbleToSeeMessage(String msg) {
new HomePage().verifyMessage(msg);

    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new HomePage().clickOnFinish();
    }

    @And("^I click on cheapest price$")
    public void iClickOnCheapestPrice() {
        new HomePage().clickOnCheapestAddToCart();
    }
}
