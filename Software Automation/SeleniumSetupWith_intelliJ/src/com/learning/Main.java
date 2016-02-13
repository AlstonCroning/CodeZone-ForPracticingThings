package com.learning;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Main {

    public static void main(String[] args) {

        //Chrome
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dishan Croning\\Desktop\\Studies\\Working Env\\CodeZone  Practice & Warmup\\Software Automation\\selenium-2.52.0-jars\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ca/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.clearProperty("webdriver.chrome.driver");
        driver.quit();

        //Internet Explore
        System.setProperty("webdriver.ie.driver","C:\\Users\\Dishan Croning\\Desktop\\Studies\\Working Env\\CodeZone  Practice & Warmup\\Software Automation\\selenium-2.52.0-jars\\IEDriverServer.exe");
        WebDriver driverIE = new InternetExplorerDriver();
        driverIE.get("https://www.google.ca/");
        System.out.println(driverIE.getCurrentUrl());
        System.out.println(driverIE.getTitle());
        System.clearProperty("webdriver.chrome.driver");
        driverIE.quit();

        //Firefox
        WebDriver driverForefox = new FirefoxDriver();
        driverForefox.get("https://www.google.ca/");
        System.out.println(driverForefox.getCurrentUrl());
        System.out.println(driverForefox.getTitle());
        System.clearProperty("webdriver.chrome.driver");
        driverForefox.quit();

    }
}
