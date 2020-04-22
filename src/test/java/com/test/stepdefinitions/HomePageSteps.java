package com.test.stepdefinitions;

import com.test.pageobjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {
    HomePage homePage = new HomePage();
    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable {

    }

    @When("^I search for company \"([^\"]*)\"$")
    public void i_search_for_company(String arg1) throws Throwable {
homePage.selectCompany(arg1);
    }


    @When("^I entered company name\\.$")
    public void i_entered_company_name() throws Throwable {
homePage.select();
    }


    @When("^I printed the address$")
    public void i_printed_the_address() throws Throwable {
       homePage.printAddress();
    }

    @When("^I printed the title$")
    public void i_printed_the_title() throws Throwable {
        homePage.getTitle();
    }
}