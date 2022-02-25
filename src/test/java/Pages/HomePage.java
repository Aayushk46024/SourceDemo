package Pages;

import Testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends TestBase {

    @FindBy(partialLinkText = "Sauce Labs Backpack")
    WebElement Product1;
    @FindBy(partialLinkText = "Sauce Labs Bike Light")
    WebElement Product2;
    @FindBy(partialLinkText = "Sauce Labs Bolt T-Shirt")
    WebElement Product3;
    @FindBy(partialLinkText = "Sauce Labs Fleece Jacket")
    WebElement Product4;
    @FindBy(partialLinkText = "Sauce Labs Onesie")
    WebElement Product5;
    @FindBy(partialLinkText = "Test.allTheThings() T-Shirt (Red)")
    WebElement Product6;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement AddToCart1;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement AddToCart2;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement AddToCart3;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement AddToCart4;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement AddToCart5;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement AddToCart6;

    @FindBy(className = "shopping_cart_link")
    WebElement ShoppingCart;
    @FindBy(id = "continue-shopping")
    WebElement backToShopping;

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void productOne()
    {
        Product1.click();
        AddToCart1.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product1"), "Sauce Labs Backpack");
        implicitWait();
        backToShopping.click();
    }

    public void productTwo()
    {
        Product2.click();
        AddToCart2.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product2"), "Sauce Labs Bike Light");
        implicitWait();
        backToShopping.click();
    }

    public void productThree()
    {
        Product3.click();
        AddToCart3.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product3"), "Sauce Labs Bolt T-Shirt");
        implicitWait();
        backToShopping.click();
    }

    public void productFour()
    {
        Product4.click();
        AddToCart4.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product4"), "Sauce Labs Fleece Jacket");
        implicitWait();
        backToShopping.click();
    }

    public void productFive()
    {
        Product5.click();
        AddToCart5.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product5"), "Sauce Labs Onesie");
        implicitWait();
        backToShopping.click();
    }

    public void productSix()
    {
        Product6.click();
        AddToCart6.click();
        ShoppingCart.click();
        Assert.assertEquals(prop.getProperty("product6"), "Test.allTheThings() T-Shirt (Red)");
        implicitWait();
        backToShopping.click();
    }

}
