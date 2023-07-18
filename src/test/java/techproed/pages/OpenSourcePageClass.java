package techproed.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import techproed.utilities.Driver;

public class OpenSourcePageClass {


    /*
    constructor olusturmadan static methodlarla yaptık
     */

    //username locate
    public static WebElement username (){
        return Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
    }
    //password locate
    public static WebElement password (){
        return Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
    }
    //login locate
    public static WebElement loginButton (){
        return Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
    }
//verify locate
    public static WebElement verify (){
        return Driver.getDriver().findElement(By.xpath("//h6"));
    }















}
