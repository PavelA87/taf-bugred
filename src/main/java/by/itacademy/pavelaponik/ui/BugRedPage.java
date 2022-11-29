package by.itacademy.pavelaponik.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BugRedPage {

    public final String URL = "http://users.bugred.ru/user/login/index.html";
    public final String NAME_EXPECTED = "Имя";
    public final String NAME_AFTER_REGISTRATION_EXPECTED = "bobik1234";

    public final String EMAIL_EXPECTED = "Email";
    public final String PASSWORD_EXPECTED = "Пароль";
    public final String REGISTER_EXPECTED = "Зарегистрироваться";
    public final String REGISTRATION_EXPECTED = "Регистрация";
    public final String INVALID_EMAIL_EXPECTED = "Неправильное значение поля (email)";

    public final String xPathName = "//*[text() = 'Имя']";
    public final String xPathEmail = "//h2[text() = 'Регистрация']//..//*[text() = 'Email']";
    public final String xPathPassword = "//h2[text() = 'Регистрация']//..//*[text() = 'Пароль']";
    public final String xPathRegister = "//input[@value = 'Зарегистрироваться']";
    public final String xPathRegistration = "//div[2][@class = 'col-md-6']/h2[1]";

    public final String xPathInputName = "//input[@name = 'name']";
    public final String xPathInputEmail = "//input[@name = 'email']";
    public final String xPathInputPassword = "//h2[text() = 'Регистрация']//..//input[@name = 'password']";

    public final String xPathNameAfterRegistration = "//a[@class = 'dropdown-toggle']";

    public final String xPathEmailInvalid = "//form[@action = '/user/register/index.html']/p";






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

    public void inputName(){
        By byInputName = By.xpath(xPathInputName);
        WebElement webElementInputName = driver.findElement(byInputName);
        String name = "bobik1234";
        webElementInputName.sendKeys(name);
    }

    public void inputEmail(){
        By byInputEmail = By.xpath(xPathInputEmail);
        WebElement webElementInputName = driver.findElement(byInputEmail);
        String email = "bobik1234@gmail.com";
        webElementInputName.sendKeys(email);
    }

    public void inputPassword(){
        By byInputPassword = By.xpath(xPathInputPassword);
        WebElement webElementInputName = driver.findElement(byInputPassword);
        String password = "bobik1234";
        webElementInputName.sendKeys(password);
    }

    public void clickOnButtonRegistrate(){
        By byClickOnButtonRegistrate = By.xpath(xPathRegister);
        WebElement webElementClickOnButtonRegistrate = driver.findElement(byClickOnButtonRegistrate);
        webElementClickOnButtonRegistrate.click();
    }

    public String getTextNameAfterRegistration(){
        By byTextNameAfterRegistration = By.xpath(xPathNameAfterRegistration);
        WebElement webElementTextNameAfterRegistration = driver.findElement(byTextNameAfterRegistration);
        return webElementTextNameAfterRegistration.getText();
    }

    public void inputInvalidEmail(){
        By byInputInvalidEmail = By.xpath(xPathInputEmail);
        WebElement webElementInputInvalidEmail = driver.findElement(byInputInvalidEmail);
        String email = "bobik1234";
        webElementInputInvalidEmail.sendKeys(email);
    }

    public String getTextEmailAfterInvalidEmailRegistration(){
        By byTextEmailAfterInvalidEmailRegistration = By.xpath(xPathEmailInvalid);
        WebElement webElementTextEmailAfterInvalidEmailRegistration = driver.findElement(byTextEmailAfterInvalidEmailRegistration);
        return webElementTextEmailAfterInvalidEmailRegistration.getText();
    }


}
