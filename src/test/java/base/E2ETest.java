package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class E2ETest extends BaseTest {

    @Test
    public void purchaseFlowTest() {
        // 1- تسجيل الدخول
        page.navigate("https://www.saucedemo.com/");
        LoginPage login = new LoginPage(page);
        login.doLogin("standard_user", "secret_sauce");

        // 2- إضافة منتج والذهاب للعربة
        ProductsPage products = new ProductsPage(page);
        products.addBackpackToCart();
        products.goToCart(); // افترضنا إننا ضفنا الميثود دي في كلاس المنتجات

        // 3- الدفع وإدخال البيانات
        page.click("#checkout");
        CheckoutPage checkout = new CheckoutPage(page);
        checkout.fillInformation("Ahmed", "Ali", "12345");

        // 4- إنهاء الطلب والتأكد من النجاح
        checkout.finishOrder();
        String msg = checkout.getSuccessMessage();
        Assert.assertEquals(msg, "Thank you for your order!", "الطلب مكملش للأخر فيه مشكلة!");
    }
}