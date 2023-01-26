package netology.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginField = $("[data-test-id=\"login\"] .input__control");
    private SelenideElement passwordField = $("[data-test-id=\"password\"] .input__control");
    private SelenideElement buttonResume = $("[data-test-id=\"action-login\"] .button__text");

    private SelenideElement error = $("[data-test-id=\"error-notification\"]");
    private SelenideElement buttonError = $("[class=\"icon-button__content\"]");

    public void input(String login, String password) {
        loginField.val(login);
        passwordField.val(password);
        buttonResume.click();
    }

    public void failedInputData() {
        error.should(visible);
        buttonError.should(visible);
        buttonError.click();
        loginField.click();
        loginField.sendKeys(Keys.chord(Keys.CONTROL + "a"), Keys.BACK_SPACE);
        passwordField.click();
        passwordField.sendKeys(Keys.chord(Keys.CONTROL + "a"), Keys.BACK_SPACE);
    }
}