package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {

        testChrome();
        testSafari();
        testFirefox();

    }

    public static void testChrome(){
        System.out.println("chrome test");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String link1_ExpecterdTilte = driver.getTitle();

        driver.get("https://etsy.com");
        String link2_ExpectedTitle = driver.getTitle();

        driver.navigate().back();

        String link1_ActualTitle = driver.getTitle();
        if(link1_ExpecterdTilte.equals(link1_ActualTitle)){
            System.out.println("back  SUCCESS");

        }
       driver.navigate().forward();
        String link2_ActualTitle = driver.getTitle();
                if(link2_ExpectedTitle.equals((link2_ActualTitle))){
                    System.out.println("forward is SUCCESS");

                }

                driver.quit();
    }

    public static void testSafari(){
        System.out.println("safari test");
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String link1_ExpecterdTilte = driver.getTitle();

        driver.get("https://etsy.com");
        String link2_ExpectedTitle = driver.getTitle();

        driver.navigate().back();

        String link1_ActualTitle = driver.getTitle();
        if(link1_ExpecterdTilte.equals(link1_ActualTitle)){
            System.out.println("back  SUCCESS");

        }
        driver.navigate().forward();
        String link2_ActualTitle = driver.getTitle();
        if(link2_ExpectedTitle.equals((link2_ActualTitle))){
            System.out.println("forward is SUCCESS");

        }
        driver.quit();
    }

    public static void testFirefox(){
        System.out.println("safari test");
        WebDriver driver = BrowserFactory.getDriver("Firefox");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String link1_ExpecterdTilte = driver.getTitle();

        driver.get("https://etsy.com");
        String link2_ExpectedTitle = driver.getTitle();

        driver.navigate().back();

        String link1_ActualTitle = driver.getTitle();
        if(link1_ExpecterdTilte.equals(link1_ActualTitle)){
            System.out.println("back  SUCCESS");

        }
        driver.navigate().forward();
        String link2_ActualTitle = driver.getTitle();
        if(link2_ExpectedTitle.equals((link2_ActualTitle))){
            System.out.println("forward is SUCCESS");

        }
        driver.quit();
    }


}
