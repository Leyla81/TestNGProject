package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {

/*
bir sayfanın locatelerini page class ında tutarız
page classın da locate lere ulaasabilmek icin PageFactory'den initelements() methodu
ile driver 'imizii bu class a tanımlarız.
findelement() methodu yerine @findBy notasyonu ile bu notasyona parametre olllarak locateleri giriniz
 */

public OpenSourcePage(){ //constructor kullandık
    PageFactory.initElements(Driver.getDriver(),this);

}

@FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//h6")
    public WebElement verify;
}
