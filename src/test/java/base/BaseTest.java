package base;

import com.microsoft.playwright.*;
import org.testng.annotations.*;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    @BeforeClass
    public void setUp() {
        // 1- ابدأ تشغيل Playwright
        playwright = Playwright.create();
        // 2- افتح المتصفح (خلينا نشوفه وهو شغال headless=false)
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(500)); // عشان نلحق نشوف اللي بيحصل
    }

    @BeforeMethod
    public void createContext() {
        // نفتح صفحة جديدة لكل تست عشان ميبقاش فيه "بواقي" من التست اللي قبله
        page = browser.newPage();
    }

    @AfterMethod
    public void closeContext() {
        page.close();
    }

    @AfterClass
    public void tearDown() {
        browser.close();
        playwright.close();
    }
}