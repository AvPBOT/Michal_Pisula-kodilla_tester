package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        int noteBook = storePom.searchPhrase("NoteBook");
        int noteBookCaseInsensitive = storePom.searchPhrase("NOTEBOOK");
        assertEquals(2, noteBook);
        assertEquals(2, noteBookCaseInsensitive);
    }

    @Test
    public void testStorePage_SchoolSearch() {
        int school = storePom.searchPhrase("School");
        int schoolCaseInsensitive = storePom.searchPhrase("SCHOOL");
        assertEquals(1, school);
        assertEquals(1, schoolCaseInsensitive);
    }

    @Test
    public void testStorePage_BrandSearch() {
        int brand = storePom.searchPhrase("Brand");
        int brandCaseInsensitive = storePom.searchPhrase("BRAND");
        assertEquals(1, brand);
        assertEquals(1, brandCaseInsensitive);
    }

    @Test
    public void testStorePage_BusinessSearch() {
        int business = storePom.searchPhrase("Business");
        int businessCaseInsensitive = storePom.searchPhrase("BUSINESS");
        assertEquals(0, business);
        assertEquals(0, businessCaseInsensitive);
    }

    @Test
    public void testStorePage_GamingSearch() {
        int gaming = storePom.searchPhrase("Gaming");
        int gamingCaseInsensitive = storePom.searchPhrase("GAMING");
        assertEquals(1, gaming);
        assertEquals(1, gamingCaseInsensitive);
    }

    @Test
    public void testStorePage_PowerfulSearch() {
        int powerful = storePom.searchPhrase("Powerful");
        int powerfulCaseInsensitive = storePom.searchPhrase("POWERFUL");
        assertEquals(0, powerful);
        assertEquals(0, powerfulCaseInsensitive);
    }
}