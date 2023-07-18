package techproed.tests.day25PageObjectmodel;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;

public class C02_PropertiesKullanimi {

    @Test
    public void test01() {
        String amazonUrl = ConfigReader.getProperty("amazonUrl"); //class ismi(ConfigReader) ile getProperty ()methodunu kullandık
        System.out.println("amazonUrl = " + amazonUrl);
        String userName = ConfigReader.getProperty("username");
        System.out.println("userName = " + userName);
        String password = ConfigReader.getProperty("password");
        System.out.println("password = " + password);
    }
}
