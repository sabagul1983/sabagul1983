package com.test.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
    public static WebDriver driver;
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    public void navigate(String url){
        driver.get(url);
        System.out.println(url);
    }
    public void manage(){
        driver.manage().window().maximize();
    }
    public void putWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void close(){

        driver.quit();
    }
}




