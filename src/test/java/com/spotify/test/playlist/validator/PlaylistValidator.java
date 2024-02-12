package com.spotify.test.playlist.validator;

import com.spotify.helper.api.PlaylistStatusCode;
import com.spotify.pojo.CreatePlayList;
import com.spotify.pojo.GetAPlayList;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class PlaylistValidator {

    @Step
    public static void validatePlaylistCreation(Response response,CreatePlayList createPlayList){
        assertThat(response.statusCode(),Matchers.equalTo(201));
        CreatePlayList createResponse=response.as(CreatePlayList.class);
        assertThat(createResponse.getName(), Matchers.equalTo(createPlayList.getName()));
        assertThat(createResponse.getDescription(), Matchers.equalTo(createPlayList.getDescription()));
        assertThat(createResponse.get_public(), Matchers.equalTo(createPlayList.get_public()));
    }

    @Step
    public static void validateGetPlaylist(Response response,CreatePlayList create){
        GetAPlayList getAPlayList = response.as(GetAPlayList.class);

        assertThat(response.statusCode(), Matchers.equalTo(PlaylistStatusCode.CODE_200.code));
        assertThat(getAPlayList.getId(),Matchers.equalTo(create.getId()));//play_list_id));
        assertThat(getAPlayList.getCollaborative(),Matchers.equalTo(false));
        assertThat(getAPlayList.getName(),Matchers.equalTo(create.getName()));
        assertThat(getAPlayList.getDescription(),Matchers.equalTo(create.getDescription()));
        assertThat(getAPlayList.get_public(),Matchers.equalTo(create.get_public()));

    }
}
