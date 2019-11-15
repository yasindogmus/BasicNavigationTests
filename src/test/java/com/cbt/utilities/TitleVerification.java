package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        String A = driver.getTitle();
        String url1 = driver.getCurrentUrl();
        Thread.sleep(3000);



        driver.get("http://practice.cybertekschool.com/dropdown");
        String B = driver.getTitle();
        String url2 = driver.getCurrentUrl();
        Thread.sleep(3000);

        driver.get("http://practice.cybertekschool.com/login");
        String C = driver.getTitle();
        String url3 = driver.getCurrentUrl();
        Thread.sleep(3000);

        if(A.equals(B)&&B.equals(C)&&A.equals(C)){
            System.out.println("PASS");
        }else
            System.out.println("FAIL");

        if(url1.startsWith("http://practice.cybertekschool.com")&&url2.startsWith("http://practice.cybertekschool.com")&&url3.startsWith("http://practice.cybertekschool.com")){
            System.out.println("PASS");
        }else
            System.out.println("FAIL");


        driver.close();


    }

}
