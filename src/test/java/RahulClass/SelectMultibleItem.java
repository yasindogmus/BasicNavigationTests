package RahulClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SelectMultibleItem {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String [] items= new String[]{"Cucumber", "Brocolli", "Tomato" };


        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
  Thread.sleep(2000);
        for (int i = 0; i < products.size(); i++)
        {

            String[] name = products.get(i).getText().split("-");
        String formattedName = name[0].trim();
// convert array to array list for easy search
        List itemlist = Arrays.asList(items);
         int j =0;
            if (itemlist.contains(formattedName))
            {
                j++;
// click add to cart
            driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
          if(j==3)
              break;

        }}
    }
}
