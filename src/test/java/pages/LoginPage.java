package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static final String EMAIL_INPUT_CSS = "#inputEmail";
    public static final String PASSWORD_INPUT_CSS = "#inputPassword";
    public LoginPage open() {
        Selenide.open("login");
        $("#inputPassword").shouldBe(Condition.visible);
        return this;
    }

    public ProjectsPage login(String user, String pass) {
        $(EMAIL_INPUT_CSS).sendKeys(user);
        $(PASSWORD_INPUT_CSS).sendKeys(pass);
        $(PASSWORD_INPUT_CSS).submit();
        return new ProjectsPage().shouldBeOpened();
    }
}
