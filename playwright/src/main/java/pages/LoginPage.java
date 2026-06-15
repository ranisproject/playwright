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
        page.locator(password).fill(pass); //driver.findElement(By.id("password")).sendKeys(pass);
        page.locator(loginBtn).click(); //driver.findElement(By.id("login")).click();
        page.onDialog(dialog -> dialog.accept()); //driver.switchTo().alert().accept(); ---alert
        page.locator("#msg").textContent(); //driver.findElement(By.id("msg")).getText();
    }

    public String getTitle() {
        return page.title();
    }
}
