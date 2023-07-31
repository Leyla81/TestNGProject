package techproed.tests.day28_dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C06_DataProviderTest {
    @DataProvider
    public static Object[][] veriler() { //aynı provider i farklı testlere bagladık
        return new Object[][]{
                {"Esen"},
                {"Leyla"},
                {"Yunus"},
                {"Burcu"},
                {"Ali"},
                {"Mert"},
                {"Mehmet"}
        };
    }

    @Test(dataProvider = "veriler")
    public void test01(String data) {
        System.out.println("data = " + data);
    }
    @Test(dataProvider = "veriler")
    public void test02(String isim) {
        System.out.println("isim = " + isim);
    }
    @Test(dataProvider = "veriler")
    public void test03(String name) {
        System.out.println("name = " + name);  
    }

    @Test(dataProvider = "veriler")
    public void test04(String ad) {
        System.out.println("ad = " + ad);
    }   
}
