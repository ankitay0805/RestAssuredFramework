package com.spotify.utilities;

import com.spotify.helper.RestResource;
import io.restassured.response.Response;

import java.time.Instant;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TokenManager {
    private static String access_token;
    private static Instant expiry_time;

    public static synchronized String getToken(){
       try {
           if (access_token==null || Instant.now().isAfter(expiry_time)){
               System.out.println("Renewing token....");
               Response response = renewToken();
               String token_type =response.path("token_type") ;
               String token=response.path("access_token");
               access_token=token_type+" "+token;
               int expiry_in_seconds =response.path("expires_in");
               expiry_time= Instant.now().plusSeconds(expiry_in_seconds-300);

           }
           else System.out.println("Token is good to use ");

       }
       catch (Exception e){
            throw new RuntimeException("Abort !!! Failed to get token");
       }

  return access_token;
    }



    private static Response renewToken(){
        HashMap<String,String> formPath= new HashMap<>();
        formPath.put("grant_type","refresh_token");
        formPath.put("refresh_token","AQAjOEM1MSHD4H6-eW5JLwufRCE1Fzhg3_x_p-2vL-YwP4aIiZJETgz-LZdgam24zXdYbO5iGJzu2aJbMr2qb-Noc_gSYnnSDTURuvyx9Yvd4ehxEG97mCofbOhEl5OsCX4");
        formPath.put("client_id","ac215028bb264a9abd492f860560776f");
        formPath.put("client_secret","d0e6ef27e35b4e67a41a83a3d2a86a6b");

        Response response = RestResource.postAccount(formPath);

        if (response.statusCode() !=200){
            throw new RuntimeException("ABORT!!! Token Renewal Fail");
        }
        return response;

    }
}
