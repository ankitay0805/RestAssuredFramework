package com.spotify.helper.api;

import com.spotify.helper.RestResource;
import com.spotify.helper.builder.SpecBuilder;
import com.spotify.utilities.ConfigManager;
import com.spotify.utilities.TokenManager;
import com.spotify.constants.PlaylistEndPoints;
import com.spotify.pojo.CreatePlayList;
import com.spotify.pojo.UpdatePlayList;
import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class PlaylistApi {



    public static String baseUrl= ConfigManager.getInstance( "d1").getString("com_spotity_url");
            //"https://api.spotify.com";
    public static String authorization_token= TokenManager.getToken();

    @Step
    public static Response post(CreatePlayList payload,String user_id) {
        String basePath = PlaylistEndPoints.CREATE_USER_PLAYLIST.replace("{user_id}", user_id);
        String path = baseUrl + basePath;
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", authorization_token);

        return RestResource.post(payload, path, headers);
    }
    public static Response postWithOutSchema(CreatePlayList payload,String user_id){
        return
                RestAssured.with().spec(SpecBuilder.getRequestSpec())
                        .body(payload)
                        .basePath(PlaylistEndPoints.CREATE_USER_PLAYLIST)
                        .pathParams("user_id",user_id)
                        .baseUri("https://api.spotify.com")
                        .header("Authorization", authorization_token)
                        .filter(new AllureRestAssured())
                        .post().then()
                        .spec(SpecBuilder.getResponseSpec())
                        // JsonSchema validation import static io.restassured.module.jsv.JsonSchemaValidator.*;
                        //.body(matchesJsonSchemaInClasspath("com.spotify.schema/createplaylistschema.json"))
                        .extract()
                        .response();
    }

    public static Response get(String play_list_id) {
        String basePath = PlaylistEndPoints.GET_PLAYLIST_BY_ID.replace("{playlist_id}", play_list_id);
        String path = baseUrl + basePath;
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", authorization_token);
        return RestResource.get(path,headers);
    }

    public static Response update(UpdatePlayList payload,String playlist_id){
        String basePath = PlaylistEndPoints.UPDATE_PLAYLIST_BY_ID.replace("{playlist_id}", playlist_id);
        String path = baseUrl + basePath;
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", authorization_token);
        return RestResource.update(payload,path,headers);

    }

    public static Response getByUser(String user_id){
        String basePath = PlaylistEndPoints.GET_USER_PLAYLISTS.replace("{user_id}", user_id);
        String path = baseUrl + basePath;
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", authorization_token);
        return RestResource.get(path,headers);
         // .body(matchesJsonSchemaInClasspath("com.spotify.schema/getallplaylistofuser.json")
    }
}
