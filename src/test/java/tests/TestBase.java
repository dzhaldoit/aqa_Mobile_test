package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    static final String deviceHost = System.getProperty("deviceHost", "browserstack");

    @BeforeAll
    static void beforeAll() {
        switch (deviceHost) {
            case ("browserstack"):
                Configuration.browser = BrowserstackDriver.class.getName();
                break;
            case ("local"):
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
            default:
                System.out.println("Неверно указан девайс");
                break;
        }

        Configuration.browserSize = null;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    void beforeEach() {
        open();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        String sessionId = Selenide.sessionId().toString();
        Attach.pageSource();
        if ("browserstack".equals(System.getProperty("deviceHost"))) {
            Attach.addVideo(sessionId);

        closeWebDriver();
        }
    }
}