package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom {

    @FindBy(css = "input[name ='search']")
    WebElement searchField;
    WebDriver driver;

    public KodillaStorePom(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public int searchPhrase(String search) {
        searchField.clear();
        searchField.sendKeys(search);
        List<WebElement> results = driver.findElements(By.cssSelector("#elements-wrapper > div"));
        int size = results.size();
        return size;
    }
}