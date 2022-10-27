package co.com.miprimerproyecto.tests;

import co.com.miprimerproyecto.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yecht.Data;

public class TestLogin {
    WebDriver driver;
    String PATH_DRIVER= "./src/main/resources/driver/chromedriver";
    String TYPE_DRIVER="webdriver.chrome.driver";
    String url="http://demo.guru99.com/test/newtours/";
    LoginPage login;
  @Before
    public void setUp()
  {
      System.setProperty(TYPE_DRIVER,PATH_DRIVER);
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(url);
  }

  @Test
    public void testLogin()
  {
      login.iniciarSesion("victorperez105@gmail.com","12345");
  }

}
