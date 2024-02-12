package com.spotify.helper;

import com.spotify.constants.AccountEndPoints;
import com.spotify.helper.builder.SpecBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class RestResource {

    public static Response post(Object payload, String path, HashMap<String,String> headers){

        return RestAssured
                .with()
                        .spec(SpecBuilder.getRequestSpec())
                        .body(payload)
                .headers(headers)
                        .post(path)
                .then()
                        .spec(SpecBuilder.getResponseSpec())
                        .extract()
                        .response();
    }

    public static Response postAccount(HashMap<String,String> form_path){
        Response response=given()
                .spec(SpecBuilder.getAccountRequestSpec())
                .basePath(AccountEndPoints.ACCOUNT_TOKEN)
                .formParams(form_path)
        .when()
                .post()
        .then()
                .spec(SpecBuilder.getResponseSpec())
                .extract()
                .response();
        return response;
    }

    public static Response get(String path,HashMap<String, String> headers) {
        return  RestAssured
                .with()
                    .spec(SpecBuilder.getRequestSpec())
                    .headers(headers)
                    .get(path)
                .then()
                    .spec(SpecBuilder.getResponseSpec())
                    .extract()
                    .response();
    }

    public static Response update(Object payload,String path, HashMap<String, String> headers){
       return RestAssured
               .with()
                    .spec(SpecBuilder.getRequestSpec())
                    .headers(headers)
                    .body(payload)
                    .put(path)
                .then()
                    .extract()
                    .response();
    }

}
