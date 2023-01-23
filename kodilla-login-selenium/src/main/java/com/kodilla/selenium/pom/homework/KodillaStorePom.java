package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaStorePom {

    @FindBy(css = "input[name ='search']")
    WebElement searchField;

    @FindAll({@FindBy(css = "#elements-wrapper")})
    WebElement result;

    WebDriver driver;

    public KodillaStorePom(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public Dimension searchPhrase(String search) {
        searchField.clear();
        searchField.sendKeys(search);
        Dimension size = result.getSize();
        return size;
    }
}