package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {




        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://luluandgeorgia.com");
        String url1 = driver.getCurrentUrl();
        String A = driver.getTitle();
        A=A.toLowerCase();
        A=A.replace(" ","");
        url1.toLowerCase();
        url1=url1.replace(" ","");
        driver.close();




        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();

        driver2.get("https://wayfair.com/");
        String url2 = driver2.getCurrentUrl();
        String B= driver2.getTitle();
        B=B.toLowerCase();
        B=B.replace(" ","");
        url2.toLowerCase();
        url2=url1.replace(" ","");
        driver2.close();




        WebDriverManager.chromedriver().setup();
        WebDriver driver3 = new ChromeDriver();

        driver3.get("https://walmart.com/");
        String url3 = driver.getCurrentUrl();
        String C= driver3.getTitle();
        C=C.toLowerCase();
        C=C.replace(" ","");
        url3.toLowerCase();
        url3=url1.replace(" ","");
        driver3.close();



        WebDriverManager.chromedriver().setup();
        WebDriver driver4 = new ChromeDriver();

        driver4.get("https://westelm.com/");
        String url4 = driver4.getCurrentUrl();
        String D = driver4.getTitle();
        D=D.toLowerCase();
        D=D.replace(" ","");
        url4.toLowerCase();
        url4=url4.replace(" ","");
        driver4.close();



    }
}
