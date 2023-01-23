package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePomTest {

    KodillaStorePom storePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @Test
    public void testStorePage_NoteBookSearch() {
        Dimension noteBook = storePom.searchPhrase("NoteBook");
        assertEquals(2, noteBook);
    }

    @Test
    public void testStorePage_SchoolSearch() {
        Dimension school = storePom.searchPhrase("School");
        assertEquals(1, school);
    }

    @Test
    public void testStorePage_BrandSearch() {
        Dimension brand = storePom.searchPhrase("NoteBook");
        assertEquals(2, brand);
    }

    @Test
    public void testStorePage_BusinessSearch() {
        Dimension business = storePom.searchPhrase("Business");
        assertEquals(0, business);
    }

    @Test
    public void testStorePage_GamingSearch() {
        Dimension gaming = storePom.searchPhrase("Business");
        assertEquals(1, gaming);
    }

    @Test
    public void testStorePage_PowerfulSearch() {
        Dimension powerful = storePom.searchPhrase("Business");
        assertEquals(0, powerful);
    }
}