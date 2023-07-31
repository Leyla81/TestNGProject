package techproed.tests.day24_Priority_DependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_Priority {
    /*
        Junitte test methodlarini istedigimiz sekilde siralamak icin method isimlerini alfabetik ve numerik sirali
    olarak yazmamiz gerekiyordu. TestNG frameworkunde bu siralama icin @Test notasyonundan sonra parametre olarak
    (priority = 1) gibi oncelik sirasi belirterek test methodlarimizi siralayabiliriz.
    Priority kullanmadigimiz methodda priority degerini 0(sifir) olarak kabul eder

     */
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    //Istedigimiz test methodunu tarayip ctrl + mouse sol tus surukle birak ile kopyalama islemi yapar
    @Test(priority = 1)
    public void amazonTest() {//---2. amazon calıssın
      driver.get("https://amazon.com");

    }
    @Test
    public void youtubeTest() {//1.---youtube one calissın default 0 oldugu icin once bu test calisir
        driver.get("https://youtube.com");

    }
    @Test(priority = 2)
    public void facebookTest() {//----3. olarak facebook calissin
        driver.get("https://facebook.com");

    }

    @AfterMethod
    public void tearDown() {

        driver.close();
    }
}
