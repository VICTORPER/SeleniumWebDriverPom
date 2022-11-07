package co.com.miprimerproyecto.pages;

import co.com.miprimerproyecto.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginPage extends Base {

    //variables
    private By txtUser = By.name("userName");
    private By txtPass = By.name("password");
    private By btnLogin = By.name("submit");
    private By txtMensajeError = By.xpath("//span");

    public LoginPage (WebDriver driver)
    {
        super(driver);
    }
     public void SignIn()
     {
       if(isDisplayed(txtUser)){
           type("qualityadmin",txtUser);
           type("pass1",txtPass);
           click(btnLogin);
       }
       else{
          System.out.println("Usuario no encontrado");
       }
     }

     public boolean isHomePageDisplayed()
     {
         return isDisplayed(txtMensajeError);
     }

    }
