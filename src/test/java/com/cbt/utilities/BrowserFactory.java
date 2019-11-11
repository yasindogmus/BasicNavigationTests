package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

      public static WebDriver getDriver (String BrowserType) {
          WebDriver driver = null;
          if ("chrome".equals(BrowserType.toLowerCase())) {
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
          } else if ("firefox".equals(BrowserType.toLowerCase())) {
              WebDriverManager.firefoxdriver().setup();
              driver = new FirefoxDriver();
          } else if ("edge".equals(BrowserType.toLowerCase())) {
              WebDriverManager.edgedriver().setup();
              driver = null;
          } else if ("safari".equals(BrowserType.toLowerCase())) {
              driver = new SafariDriver();
          }

          return driver;

      }


}
