import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class openBrowserGC
{
        @Test
        public void OpenGC()
        {

            System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("http://google.com");
        }
}
