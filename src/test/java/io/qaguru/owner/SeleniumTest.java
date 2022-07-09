package io.qaguru.owner;

import io.qaguru.owner.сonfig.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {

    private WebDriver driver = new WebDriverProvider().get();

    //(1)Благодаря 14 строчке мне не нужны строки с 23 по 29 тесты.
    //(2)Настройки тестов вынесены в конфигурацию.
    //(3) Для смены браузера достаточно зайти в WebDriverConfig и заменить. Код тестов переписывать не надо.


    @Test
    public void testGithubTitle() {
//        // Настройка chromedriver если без неё не пашет.
//
//        WebDriverManager.chromedriver().setup();
//
//        // конфигурация запуска baseurl = github
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://github.com");

        // Код выполнения теста.
        String title = driver.getTitle();
        assertEquals(title, "GitHub: Where the world builds software · GitHub");
        driver.quit();
    }

    @AfterEach
    public void stopDriver(){
        driver.quit();
    }

}
