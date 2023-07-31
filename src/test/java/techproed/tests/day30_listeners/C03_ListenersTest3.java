package techproed.tests.day30_listeners;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.Driver;






@Listeners(techproed.utilities.Listeners.class)

public class C03_ListenersTest3 {

    /*
       Eğer fail olan testlerimizi otomatik olarak belirttiğimiz sayı kadar çalıştırmak istersek
   listeners class'ınındaki retry ve transform methodları sayesinde çalıştırabiliriz. Bunun için
   çalıştırmak istediğimiz test methodunun notasyonundan sonra parametre olarak;
   retryAnalyzer parametresini kullanarak listeners classının yolunu belirtiriz.
    */

    @Test(retryAnalyzer = techproed.utilities.Listeners.class)
    public void googleTest() {
        Driver.getDriver().get("https://google.com");
        Driver.getDriver().findElement(By.id("mhjgyyff")).click();
    }
    @Test(retryAnalyzer = techproed.utilities.Listeners.class)
    public void tecproTest() {
        Driver.getDriver().get("https://techproeducation.com");
        Driver.getDriver().findElement(By.id("mhjgyyff")).click();
    }
}
