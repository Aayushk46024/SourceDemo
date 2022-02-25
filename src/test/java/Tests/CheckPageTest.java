package Tests;

import Testbase.TestBase;
import org.testng.annotations.Test;
import java.io.IOException;

public class CheckPageTest extends TestBase {

    @Test
    public void loginPage()throws IOException
    {
        pageFactory.getLoginPage().login();
    }

    @Test( dependsOnMethods = "loginPage")
    public void productOneTest()  {
        pageFactory.getCheckOutPage().productOneCheckout();
        System.out.println("Product is successfully checkout.");
    }

    @Test( dependsOnMethods = "loginPage")
    public void productTwoTest()  {
        pageFactory.getCheckOutPage().productTwoCheckout();
        System.out.println("Product is successfully checkout.");
    }

    @Test( dependsOnMethods = "loginPage")
    public void productThreeTest()  {
        pageFactory.getCheckOutPage().productThreeCheckout();
        System.out.println("Product is successfully checkout.");
    }

    @Test( dependsOnMethods = "loginPage")
    public void productFourTest()  {
        pageFactory.getCheckOutPage().productFourCheckout();
        System.out.println("Product is successfully checkout.");
    }

    @Test( dependsOnMethods = "loginPage")
    public void productFiveTest()  {
        pageFactory.getCheckOutPage().productFiveCheckout();
        System.out.println("Product is successfully checkout.");
    }

    @Test( dependsOnMethods = "loginPage")
    public void productSixTest()  {
        pageFactory.getCheckOutPage().productSixCheckout();
        System.out.println("Product is successfully checkout.");
    }
}
