package com.optum.pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class optumApi {
    @Test
    public void test1(){
        JsonPath jsonPath = given().when().get("https://www.optumrx.com/public/landing").prettyPeek().
                then().statusCode(200).extract().jsonPath();


    }

}
