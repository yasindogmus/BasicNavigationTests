package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.http.impl.cookie.IgnoreSpec;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com,",
                "https:// westelm.com/");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://luluandgeorgia.com");
        String url1 = driver.getCurrentUrl();
        String A = driver.getTitle();
        A=A.toLowerCase();
        A=A.replace(" ","");
        url1.toLowerCase();
        url1=url1.replace(" ","");
        Thread.sleep(3000);

        driver.get("https://wayfair.com/");
        String url2 = driver.getCurrentUrl();
        String B= driver.getTitle();
        B=B.toLowerCase();
        B=B.replace(" ","");
        url2.toLowerCase();
        url2=url1.replace(" ","");
        Thread.sleep(3000);

        driver.get("https://walmart.com/");
        String url3 = driver.getCurrentUrl();
        String C= driver.getTitle();
        C=C.toLowerCase();
        C=C.replace(" ","");
        url3.toLowerCase();
        url3=url1.replace(" ","");
        Thread.sleep(3000);

        driver.get("https://westelm.com/");
        String url4 = driver.getCurrentUrl();
        String D = driver.getTitle();
        D=D.toLowerCase();
        D=D.replace(" ","");
        url4.toLowerCase();
        url4=url1.replace(" ","");
        Thread.sleep(3000);

        if(url1.contains(A)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        if(url2.contains(B)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        if(url3.contains(C)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        if(url4.contains(D)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();


    }


}
