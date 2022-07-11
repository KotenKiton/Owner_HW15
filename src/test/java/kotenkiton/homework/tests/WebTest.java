package kotenkiton.homework.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebTest extends TestBase {

    @Test
    public void webGithubTest() {

        assertEquals("GitHub: Where the world builds software · GitHub", title());
    }
}