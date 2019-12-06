package RahulClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println();

//        driver.getPageSource(); // if is rigth click not working on the url page we use that methods

//        System.out.println(driver.getPageSource());  // print pagesource

        driver.get("http://yahoo.com");

        driver.navigate().back();

        driver.close(); // its close curret browser
        driver.quit();  // its close all the browsers open by selenium script

  // okuyom ben yaaaaaaaaa




    }
}
