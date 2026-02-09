package pages;

import com.microsoft.playwright.Page;

public class ProductsPage {
    private Page page;

    // لستة العناصر اللي هنحتاجها
    private String addToCartBackpack = "#add-to-cart-sauce-labs-backpack";
    private String cartBadge = ".shopping_cart_badge";
    private String cartButton = ".shopping_cart_link";

    public ProductsPage(Page page) {
        this.page = page;
    }

    public void addBackpackToCart() {
        // دوس على زرار الإضافة
        page.click(addToCartBackpack);
    }

    public String getCartItemsCount() {
        // هات الرقم اللي مكتوب على أيقونة السلة
        return page.innerText(cartBadge);
    }
    public void goToCart() {
        page.click(cartButton); // هيدوس على أيقونة السلة عشان يفتح صفحة العربة
    }
}