package by.itacademy.pavelaponik.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BugRedPage {

    public final String URL = "http://users.bugred.ru/user/login/index.html";
    public final String NAME_EXPECTED = "Имя";
    public final String EMAIL_EXPECTED = "Email";
    public final String PASSWORD_EXPECTED = "Пароль";
    public final String REGISTER_EXPECTED = "Зарегистрироваться";
    public final String REGISTRATION_EXPECTED = "Регистрация";

    public final String xPathName = "//*[text() = 'Имя']";
    public final String xPathEmail = "//h2[text() = 'Регистрация']//..//*[text() = 'Email']";
    public final String xPathPassword = "//h2[text() = 'Регистрация']//..//*[text() = 'Пароль']";
    public final String xPathRegister = "//input[@value = 'Зарегистрироваться']";
    public final String xPathRegistration = "//div[2][@class = 'col-md-6']/h2[1]";

    private WebDriver driver;
    public BugRedPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openBugRedPage(){
        driver.get(URL);
    }

    public String getTextName(){
        By byName = By.xpath(xPathName);
        WebElement webElementName = driver.findElement(byName);
        return webElementName.getText();
    }
    public String getTextEmail(){
        By byEmail = By.xpath(xPathEmail);
        WebElement webElementEmail = driver.findElement(byEmail);
        return webElementEmail.getText();
    }
    public String getTextPassword(){
        By byPassword = By.xpath(xPathPassword);
        WebElement webElementPassword = driver.findElement(byPassword);
        return webElementPassword.getText();
    }
    public String getTextRegister(){
        By byRegister = By.xpath(xPathRegister);
        WebElement webElementRegister = driver.findElement(byRegister);
        return webElementRegister.getAccessibleName();
    }
    public String getTextRegistration(){
        By byRegistration = By.xpath(xPathRegistration);
        WebElement webElementRegistration = driver.findElement(byRegistration);
        return webElementRegistration.getText();
    }




}
