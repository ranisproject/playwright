package base;

import com.microsoft.playwright.*;
import config.Config;

public class BaseTest {

    protected static Playwright playwright;
    protected static Browser browser;
    protected static BrowserContext context;
    protected static Page page;

    public void setup() {

        playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(Config.HEADLESS)
        );

        context = browser.newContext();
        page = context.newPage();

        page.navigate(Config.BASE_URL);
    }

    public void tearDown() {
        browser.close();
        playwright.close();
    }
}
