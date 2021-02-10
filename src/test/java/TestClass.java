import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestClass {

    @Test
    public void helloWorld(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monic\\AppData\\Local\\Google\\Chrome\\Aplicacion/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.choucairtesting.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Empleos")).click();

        WebElement txtsearch_keywords = driver.findElement(By.name("search_keywords"));
        txtsearch_keywords.sendKeys("Analista de Pruebas Lima");

        WebElement txtsearch_location = driver.findElement(By.name("search_location"));
        txtsearch_location.sendKeys("Lima");
        txtsearch_location.submit();

        //driver.close();





    }
}