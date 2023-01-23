package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaPomStoreApplication {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom storePom = new KodillaStorePom(driver);
        storePom.searchPhrase("NoteBook");
        storePom.searchPhrase("School");
        storePom.searchPhrase("Brand");
        storePom.searchPhrase("Business");
        storePom.searchPhrase("Gaming");
        storePom.searchPhrase("Powerful");
        driver.close();
    }
}