package co.com.miprimerproyecto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //variables
    private By txtUser = By.name("userName");
    private By txtPass = By.name("password");
    private By btnLogin = By.name("submit");
    private By txtMensajeError = By.xpath("//span");
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver= driver;

    }
    public void iniciarSesion(String user, String pass)
    {
        driver.findElement(txtUser).sendKeys(user);
        driver.findElement(txtPass).sendKeys(pass);
        driver.findElement(btnLogin).click();
    }
}
