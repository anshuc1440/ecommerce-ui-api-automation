package com.anshu.automation.api;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ProductApi {

    private static final String API_URL = "https://fakestoreapi.com/products/1";

    public static int getProductPriceFromApi() {

        Response response =
                given()
                    .when()
                    .get(API_URL)
                    .then()
                    .statusCode(200)
                    .extract()
                    .response();

        JsonPath json = response.jsonPath();

        // API price example: 109.95
        double apiPrice = json.getDouble("price");

        // Convert to integer for comparison
        return (int) apiPrice;
    }
}
