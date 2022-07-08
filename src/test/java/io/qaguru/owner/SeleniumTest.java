package io.qaguru.owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {


    @Test
    public void testGithubTitle(){
        // Настройка chromedriver если без неё не пашет.

        WebDriverManager.chromedriver().setup();

        // конфигурация запуска baseurl = github
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        String title = driver.getTitle();
        assertEquals(title,"GitHub: Where the world builds software · GitHub");
        driver.quit();

    }
}
