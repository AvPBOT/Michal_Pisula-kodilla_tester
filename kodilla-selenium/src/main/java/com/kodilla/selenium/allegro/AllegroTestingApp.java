package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-role=\"accept-consent\"]")));

        WebElement cookiesButton = driver.findElement(By.xpath("//*[@data-role=\"accept-consent\"]"));
        cookiesButton.click();

        WebElement category = driver.findElement(By.cssSelector("select[data-role='filters-dropdown-toggle']"));
        Select selectCategory = new Select(category);
        selectCategory.selectByIndex(3);
        WebElement searchBox = driver.findElement(By.cssSelector("input[data-role='search-input']"));
        searchBox.sendKeys("Mavic mini");
        WebElement searchButton = driver.findElement(By.cssSelector("button[data-role='search-button']"));
        searchButton.click();

        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>article")));

        List<WebElement> listOfArticles = driver.findElements(By.cssSelector("section>article"));
        for (WebElement article : listOfArticles) {
            System.out.println(article.getText());
        }
    }
}
