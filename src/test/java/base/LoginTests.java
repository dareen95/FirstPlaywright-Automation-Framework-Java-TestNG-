package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginTests extends BaseTest {

    @Test
    public void checkValidLogin() {
        // 1- روح للموقع
        page.navigate("https://www.saucedemo.com/");

        // 2- استخدم كلاس الـ Page Object اللي عملناه فوق
        LoginPage login = new LoginPage(page);

        // 3- جرب تدخل بيوزر صح
        login.doLogin("standard_user", "secret_sauce");

        // 4- أهم خطوة: اتأكد إننا دخلنا فعلاً (Assertion)
        // لو الرابط فيه كلمة inventory يبقى إحنا تمام وزي الفل
        String currentUrl = page.url();
        Assert.assertTrue(currentUrl.contains("inventory"), "يا خبر! اللوجن مفروض ينجح بس شكلنا لسه بره!");
    }

    @Test
    public void checkInvalidLogin() {
        // بنرجع نفتح الصفحة تاني عشان تست جديد
        page.navigate("https://www.saucedemo.com/");

        LoginPage login = new LoginPage(page);

        // جرب يوزر "هبايص" وباسورد غلط
        login.doLogin("wrong_user", "wrong_pass");

        // هنا بنتأكد إن رسالة الخطأ ظهرت (Negative Testing)
        boolean isErrorVisible = page.isVisible("h3[data-test='error']");
        Assert.assertTrue(isErrorVisible, "المفروض يطلع غلط بس الموقع دخل عادي! دي Bug دي!");
    }
    @Test
    public void addProductAndCheckCart() {
        page.navigate("https://www.saucedemo.com/");
        LoginPage login = new LoginPage(page);

        // 1- ادخل الموقع
        login.doLogin("standard_user", "secret_sauce");

        // 2- روح لصفحة المنتجات
        ProductsPage products = new ProductsPage(page);

        // 3- ضيف الشنطة للسلة
        products.addBackpackToCart();

        // 4- اتأكد إن السلة بقى فيها "1"
        String count = products.getCartItemsCount();
        Assert.assertEquals(count, "1", "الشنطة متضافتش صح في السلة!");
    }
}