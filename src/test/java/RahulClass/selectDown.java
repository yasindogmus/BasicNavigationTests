package RahulClass;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.support.ui.Select;

public class selectDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hotels.com/?locale=en_US&pos=HCOM_US&rffrid=sem.hcom.US.google.003.00.03.s.kwrd=c.353600954378.69930116374.1945274585.1t2.kwd-58193046.1014895..book%20it.EAIaIQobChMI8ar5lpmd5gIVR9yGCh2LJQ-9EAAYAiAAEgIvuvD_BwE.aw.ds&PSRC=G21&gclid=EAIaIQobChMI8ar5lpmd5gIVR9yGCh2LJQ-9EAAYAiAAEgIvuvD_BwE&gclsrc=aw.ds");

        //    driver.findElement(By.id("qf-0q-room-0-adults")).click();



        Select s = new Select(driver.findElement(By.id("qf-0q-room-0-adults")));
        s.selectByValue("3");
        s.selectByIndex(10);
        s.deselectByVisibleText("15");

    }
}
