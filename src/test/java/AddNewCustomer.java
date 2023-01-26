import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class AddNewCustomer {
    WebDriver driver ;

    @BeforeTest
    public void prepare()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4/index.php");

        driver.findElement(By.name("uid")).sendKeys("mngr473211");
        driver.findElement(By.name("password")).sendKeys("EzezYju");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.linkText("New Customer")).click();

    }
    @AfterTest
    public void terminate() {
        driver.quit();
    }

    @Test
    public void allValidInputs() {

        driver.findElement(By.name("name")).sendKeys("manar Ali");
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[2]")).click();
        driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("01/01/1999");
        driver.findElement(By.tagName("textarea")).sendKeys("21 yehia el shrief");
        driver.findElement(By.name("city")).sendKeys("cairo");
        driver.findElement(By.name("state")).sendKeys("egypt");
        driver.findElement(By.name("pinno")).sendKeys("0000000");
        driver.findElement(By.name("telephoneno")).sendKeys("01118286985");
        driver.findElement(By.name("emailid")).sendKeys("manar110@gmail.com");
        driver.findElement(By.name("password")).sendKeys("0451568792");
        driver.findElement(By.name("sub")).click();

    }
    @Test
    public void BlankInputOfAddress(){
        driver.findElement(By.name("name")).sendKeys("Ammar Ali");
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("01/01/1999");
        driver.findElement(By.tagName("textarea")).sendKeys("");
        driver.findElement(By.name("city")).sendKeys("cairo");
        driver.findElement(By.name("state")).sendKeys("egypt");
        driver.findElement(By.name("pinno")).sendKeys("0000000");
        driver.findElement(By.name("telephoneno")).sendKeys("01118286985");
        driver.findElement(By.name("emailid")).sendKeys("ammarbebo110@gmail.com");
        driver.findElement(By.name("password")).sendKeys("0451568792");
        driver.findElement(By.name("sub")).click();
        System.out.println("address field is empty");
    }
    @Test
    public void passWordOfOneWord() {
        driver.findElement(By.name("name")).sendKeys("Ammar Ali");
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("01/01/1999");
        driver.findElement(By.tagName("textarea")).sendKeys("21 yehia el shrief");
        driver.findElement(By.name("city")).sendKeys("cairo");
        driver.findElement(By.name("state")).sendKeys("egypt");
        driver.findElement(By.name("pinno")).sendKeys("0000000");
        driver.findElement(By.name("telephoneno")).sendKeys("01118286985");
        driver.findElement(By.name("emailid")).sendKeys("ammarbebo110@gmail.com");
        driver.findElement(By.name("password")).sendKeys("0");
        driver.findElement(By.name("sub")).click();
    }
    @Test
    public void InvalidEmail() {
        driver.findElement(By.name("name")).sendKeys("Ammar Ali");
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("01/01/1999");
        driver.findElement(By.tagName("textarea")).sendKeys("21 yehia el shrief");
        driver.findElement(By.name("city")).sendKeys("cairo");
        driver.findElement(By.name("state")).sendKeys("egypt");
        driver.findElement(By.name("pinno")).sendKeys("0000000");
        driver.findElement(By.name("telephoneno")).sendKeys("01118286985");
        driver.findElement(By.name("emailid")).sendKeys("ammarbebo110gmail.com");
        driver.findElement(By.name("password")).sendKeys("0451568792");
        driver.findElement(By.name("sub")).click();
        System.out.println("please enter a valid Email");
    }
    @Test
    public void reset() {
        driver.findElement(By.name("name")).sendKeys("Ammar Ali");
        driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("01/01/1999");
        driver.findElement(By.tagName("textarea")).sendKeys("21 yehia el shrief");
        driver.findElement(By.name("city")).sendKeys("cairo");
        driver.findElement(By.name("state")).sendKeys("egypt");
        driver.findElement(By.name("pinno")).sendKeys("0000000");
        driver.findElement(By.name("telephoneno")).sendKeys("01118286985");
        driver.findElement(By.name("emailid")).sendKeys("ammarbebo110@gmail.com");
        driver.findElement(By.name("password")).sendKeys("0451568792");
        driver.findElement(By.name("res")).click();
    }

}
