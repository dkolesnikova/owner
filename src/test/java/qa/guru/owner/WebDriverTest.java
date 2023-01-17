package qa.guru.owner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import qa.guru.owner.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver;
    @BeforeEach
    //подготовка драйвера
    public void startDriver() {
        driver= new WebDriverProvider().get();
    }
    @Test
    public void testGithub() {
        //тело выполнения теста
        String title = driver.getTitle();
        assertEquals("GitHub: Let’s build from here · GitHub", title);
    }

@AfterEach
public void stopDriver() {
    driver.quit();

}
}
