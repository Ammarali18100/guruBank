import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver ;

        @BeforeTest
        public void prepare()
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.demo.guru99.com/V4/index.php");
        }
        @AfterTest
        public void terminate() {
        driver.quit();
        }

        @Test
        public void loginFailedByUserID() {

            driver.findElement(By.name("uid")).sendKeys("octo123456");
            driver.findElement(By.name("password")).sendKeys("EzezYju");
            driver.findElement(By.xpath("//input[@type='submit']")).click();

        }
        @Test
        public void loginSuccessfully() {


            driver.findElement(By.name("uid")).sendKeys("mngr473211");
            driver.findElement(By.name("password")).sendKeys("EzezYju");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
            driver.findElement(By.linkText("Log out")).click();
        }
        @Test
        public void loginFailedByPassword() {


            driver.findElement(By.name("uid")).sendKeys("mngr473211");
            driver.findElement(By.name("password")).sendKeys("octo123456");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
        }
        @Test
        public void loginFailedByUSerID_and_password() {


            driver.findElement(By.name("uid")).sendKeys("octo147258");
            driver.findElement(By.name("password")).sendKeys("octo123456");
            driver.findElement(By.xpath("//input[@type='submit']")).click();
        }
        @Test
        public void Reset() {


            driver.findElement(By.name("uid")).sendKeys("octo147258");
            driver.findElement(By.name("password")).sendKeys("octo123456");
            driver.findElement(By.xpath("//input[@type='reset']")).click();
        }




}
