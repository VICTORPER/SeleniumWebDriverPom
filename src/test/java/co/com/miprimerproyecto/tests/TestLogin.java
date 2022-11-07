package co.com.miprimerproyecto.tests;

import co.com.miprimerproyecto.pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestLogin{
    WebDriver driver;
    LoginPage login;

    @Before
    public void setUp() throws Exception {
        login= new LoginPage(driver);
        driver=login.chromeDriverConnection();
        login.visit("http://demo.guru99.com/test/newtours/");

    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }



    @Test
    public void signIn() throws InterruptedException {
       login.SignIn();
       Thread.sleep(2000);


    }


}
