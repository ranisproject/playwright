package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;

    private String username = "#user-name";
    private String password = "#password";
    private String loginBtn = "#login-button";

    public LoginPage(Page page) {
        this.page = page;
    }

    public void login(String user, String pass) {
        page.locator(username).fill(user);
        page.locator(password).fill(pass);
        page.locator(loginBtn).click();
    }

    public String getTitle() {
        return page.title();
    }
}
