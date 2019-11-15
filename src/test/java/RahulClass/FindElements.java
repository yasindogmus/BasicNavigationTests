package RahulClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.events.Event;

public class FindElements {

//    ID
//    ClassName
//    Name
//    linkText
//    Xpath
//    Css

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("Hello Zuleyha");
        driver.findElement(By.id("pass")).sendKeys("123456");
//        driver.findElement(By.linkText("Forgot account?")).click();
//compound class does not allow the space its mean ID,className,Name,LinkText supposed to be no any space otherwise its gonna be eror
// if all the classnames or id are same name, first one scan first  up to down
       driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click(); // not the this " only  singlr code ' but still acceopt both ?
        driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")).getText();

       System.out.println(driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")).getText());

//    //*[@id="fakebox-input"]


    }



}
