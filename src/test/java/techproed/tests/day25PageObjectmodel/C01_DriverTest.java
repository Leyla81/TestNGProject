package techproed.tests.day25PageObjectmodel;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C01_DriverTest {


    @Test
    public void test01() {

        Driver.getDriver().get(("https://amazon.com"));
        //Driver class ını kullanarak bu classdaki getDriver methodu ile amazona gittik

         Driver.closeDriver();

    }

    @Test
    public void test02() {
        Driver.getDriver().get(("https://amazon.com"));
        Driver.getDriver().get(("https://youtube.com"));
        Driver.closeDriver();
        Driver.getDriver().get(("https://facebook.com"));

      /*  Driver'a koydugumuz if blogu ile burdaki sayfalara tek browser ile
        sirasiyla gittik
        Driver daki if blogunu kullanmadigimiz zaman her get()
        methodu kullandigimizda yeni bir browser acti
         */
    }

    @Test
    public void test04() {
        // Driver driver = new Driver();
        //Singleton pattern kullandigimiz icin obje olusturmanin onune gectik--->ENCAPSULATION
    }
}
