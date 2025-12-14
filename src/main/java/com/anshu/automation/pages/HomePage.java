package com.anshu.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for product cards
    private By productCards = By.cssSelector(".product-image-wrapper");

    // Extract clean price of first product
    public int getFirstProductPrice() {

        List<WebElement> products = driver.findElements(productCards);

        if (products.isEmpty()) {
            throw new RuntimeException("No products found on Home Page");
        }

        WebElement firstProduct = products.get(0);

        // Example text: "Rs. 500\nAdd to cart"
        String rawText = firstProduct.getText();

        // Keep only digits
        String priceOnly = rawText.replaceAll("[^0-9]", "");

        return Integer.parseInt(priceOnly);
    }
}
