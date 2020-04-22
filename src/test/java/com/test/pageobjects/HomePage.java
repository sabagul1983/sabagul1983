package com.test.pageobjects;

import com.test.drivers.DriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.SQLOutput;
import java.util.List;

import static org.junit.Assert.fail;


public class HomePage extends DriverFactory {
    @FindBy(css="ul[class=\"browse\"] li")
    List<WebElement> companyPages;
    public void selectCompany(String alphabet) {
        for (WebElement companies : companyPages) {
            String availableCompanies = companies.getText();
            if (availableCompanies.contains(alphabet)) {
                companies.click();
                break;
            }
        }
    }

    @FindBy(css = "a[class=\"key\"]")
    List<WebElement> firstPage;
    public void select(){
        int count = firstPage.size();
        System.out.println(count);
        WebElement company_1;

        if ( count > 0){
            company_1 = firstPage.get(0);  // first compnay
            DisplayCompany(company_1);

            if(count >= 3) {
                company_1 = firstPage.get(2);   // 3rd compnay
                DisplayCompany(company_1);
            }

            company_1  = firstPage.get(count-1);  // last company
            DisplayCompany(company_1);

       }
        else
            fail("No company found");

     }
     private void DisplayCompany(WebElement company)
     {
    System.out.println("--------------------------");
    System.out.println(company.getText());
    company.click();

    WebElement title = driver.findElement(By.cssSelector("div[class=\"container-fluid contracted content\"]"));
    System.out.println("company Title is:" + title.getText());
    WebElement address = driver.findElement(By.cssSelector("div[class=\"col-md-5\"]"));
    String addressPrint = address.getText();
    System.out.println(" company's address is :" + addressPrint);
    driver.navigate().back();

    }
    @FindBy(css = "div[class=\"col-md-5\"]")
    WebElement address;
    public void printAddress() {
        String addressPrint = address.getText();
        System.out.println(" company's address is :" + addressPrint);
    }

    @FindBy(css = "div[class=\"container-fluid contracted content\"]")
    WebElement title;
    public void getTitle() {
        String printTitle = title.getText();
        System.out.println("company Title is:" + printTitle);
    }
}
