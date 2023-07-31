package techproed.tests.day23_Annotations;


import org.testng.annotations.*;

public class C01_Annotations {
    @BeforeSuite
    public void suite(){
        System.out.println("beforeSuite = "+"herseyden once bir kez BeforeSuite calisir");
    }
    @BeforeTest
    public void beforeTest(){

        System.out.println("before Test = "+"Her testen once bir kez calisir");
    }
    @BeforeClass
    public void beforeClass (){

        System.out.println("beforeClass = "+"Her classdan once bir kez calisir");
    }
    @BeforeMethod
    public void  setup (){
        System.out.println("beforeMethod = "+"Junitteki @Before notasyonu gibi her methottan once calisir");
    }

    @Test
    public void test01() {
        System.out.println("test1 calistı");

    }
    @Test
    public void test02() {
        System.out.println("test3 calistı");

    }

    @Test
    public void test03() {
        System.out.println("test3 calistı");

    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite = "+"Her seyden sonra AfterSuite bir kez calisir");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest = "+"Her testten sonra bir kez AfterTest calisir");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass = "+"Her Class'tan sonra AfterClass bir kez calisir");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("afterMethod= "+"Junit'teki @After notasyonu gibi her method'dan sonra çalışır");
    }









}
