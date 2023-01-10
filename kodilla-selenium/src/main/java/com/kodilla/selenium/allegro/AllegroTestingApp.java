package com.kodilla.selenium.allegro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement category = driver.findElement(By.xpath("//*[@data-role=\"filters-dropdown-toggle\"]"));
        Select selectCategory = new Select(category);
        selectCategory.selectByIndex(3);
        WebElement searchBox = driver.findElement(By.xpath("//*[@data-role=\"search-input\"]/input"));
        searchBox.sendKeys("Mavic mini");
        WebElement searchButton = driver.findElement(By.xpath("//*[@data-role=\"search-button\"]"));
        searchButton.click();
    }
}
