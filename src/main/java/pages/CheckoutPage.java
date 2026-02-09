package pages;

import com.microsoft.playwright.Page;

public class CheckoutPage {
    private Page page;

    public CheckoutPage(Page page) {
        this.page = page;
    }

    // الميثود دي بتخلص كل بيانات الشحن
    public void fillInformation(String fName, String lName, String zip) {
        page.fill("#first-name", fName);
        page.fill("#last-name", lName);
        page.fill("#postal-code", zip);
        page.click("#continue");
    }

    public void finishOrder() {
        page.click("#finish");
    }

    public String getSuccessMessage() {
        return page.innerText(".complete-header");
    }
}