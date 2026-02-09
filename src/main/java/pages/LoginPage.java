package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;

    // هنا بنعرف أماكن الزراير والحقول (Locators)
    private final String userInput = "#user-name";
    private final String passInput = "#password";
    private final String loginBtn = "#login-button";

    public LoginPage(Page page) {
        this.page = page;
    }

    // دي الميثود اللي هتنادي عليها في التست عشان تعمل لوجن في خطوة واحدة
    public void doLogin(String user, String pass) {
        page.fill(userInput, user); // امسح واكتب اليوزر
        page.fill(passInput, pass); // اكتب الباسورد
        page.click(loginBtn);       // دوس يا بطل
    }
}