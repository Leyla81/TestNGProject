package techproed.tests.day28_dataProvider;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderReader;

public class C05_DataProviderReaderKullanimi {
    @Test(dataProvider = "sehirVerileri",dataProviderClass = DataProviderReader.class)
    public void test01(String city,String region,String licencePlate) {
        System.out.println( city+"||" +region+"||"+ licencePlate);









    }










}
