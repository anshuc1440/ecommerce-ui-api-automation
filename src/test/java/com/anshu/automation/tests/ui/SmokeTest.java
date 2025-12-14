package com.anshu.automation.tests.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.anshu.automation.api.ProductApi;
import com.anshu.automation.base.BaseTest;
import com.anshu.automation.pages.HomePage;

public class SmokeTest extends BaseTest {

    @Test
    public void validateUIPriceAgainstApi() {

        test.info("Starting UI vs API price validation test");

        HomePage homePage = new HomePage(driver);
        test.info("Home page loaded successfully");

        int uiPrice = homePage.getFirstProductPrice();
        test.info("UI price extracted: " + uiPrice);

        int apiPrice = ProductApi.getProductPriceFromApi();
        test.info("API price fetched: " + apiPrice);

        Assert.assertEquals(
                uiPrice,
                apiPrice,
                "UI price does not match API price!"
        );

        test.pass("UI price matches API price. Validation successful.");
    }
}
