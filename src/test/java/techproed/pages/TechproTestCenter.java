package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechproTestCenter {


    /*
bir sayfanın locatelerini page class ında tutarız
page classın da locate lere ulaasabilmek icin PageFactory'den initelements() methodu
ile driver 'imizii bu class a tanımlarız.
findelement() methodu yerine @findBy notasyonu ile bu notasyona parametre olllarak locateleri giriniz
 */

    public TechproTestCenter() { //constructor kullandık
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement loginVerify;
    @FindBy(xpath = "//i[@class='fa fa-sign-out-alt']")
    public WebElement logout;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logoutVerify;

}






