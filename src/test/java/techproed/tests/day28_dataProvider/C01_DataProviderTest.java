package techproed.tests.day28_dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_DataProviderTest {
   

        /*
        Dataprovider, bircok veriyi test caselerde loop kullanmadan aktarmak icin kullanilir.
    TestNG'den gelen bir ozelliktir. 2 boyutlu Object Array return eder.
    Kullanimi icin @Test notasyonundan sonra parametre olarak (dataprovider="method ismi") yazilir.
    Kac tane veri ile calisacaksak test methoduna o kadar parametre eklenir.
    Data driven testing(DDT) de datalarimizi 3 farkli sekilde kullanabiliriz.
        1-.properties dosyasindan datalari alabiliriz. -->ConfigReader.getProperty() ile
        2-Excel dosyasindan datalari alabiliriz.    -->ExcelReader class'i ile
        3-DataProvider kullanarak datalari alabiliriz.  -->DataProvider methodu ile

     */


    @DataProvider(name ="test02") //dataProvideri test02 icin kullandıgım icin test01 de hata verir
    public static Object[][] İsimler() { //2 boyutlu Array method olusturduk
        return new Object[][]{
                {"Esen"},
                {"Leyla"},
                {"Yunus"},
                {"Burcu"},
                {"Ali"},
                {"Mert"},
                {"Mehmet"}};
    }

   

    /*
     Olusturdugumuz dataprovider methodunu baska bir test methodunda da kullanabiliriz.
     Bunun icin @DataProvider notasyonundan sonra yeni olusturdugumuz methodun ismini (name="test02") olarak 
     belirtmemiz gerekir
      */
    @Test(dataProvider = "İsimler")
    public void test01(String data) {
        System.out.println("data = " + data);
       
    }

    @Test(dataProvider = "test02")
    public void test02(String isim) {
        System.out.println(isim);


    }
    @DataProvider
    public static Object[][] arabalar() {
        return new Object[][]{
                {"ford"},
                {"mercedes"},
                {"volvo"},
                {"audi"}};
    }
    @Test(dataProvider = "arabalar")
    public void test03(String arabalar) {
        System.out.println("arabalar = " + arabalar);
    }
}
