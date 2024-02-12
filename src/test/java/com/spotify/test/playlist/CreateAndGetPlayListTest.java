package com.spotify.test.playlist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.helper.api.PlaylistApi;
import com.spotify.helper.api.PlaylistStatusCode;
import com.spotify.pojo.*;

import static org.hamcrest.MatcherAssert.*;

import com.spotify.test.playlist.validator.PlaylistValidator;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

// Create playlist without name
// create playlist with invalid auth or expired auth / no content type
// duplicate playlist name
// create playlist with public param - true , no description
//create playlist no user user_id or invalid user id

// updating playlist from public to not public or vise-versa with valid palylist id
// updating name/ description with valid palylist id
// update request with no change
// update request with duplicate name playlist / invalid auth / no content type
//update request with invalid playlist id / with deleted playlist id
//multiple hit of update request with same valid / invalid data

// get playlist with invalid / invalid playlist id / no id
// get playlist with no auth / invalid auth
// get after update call
// get after create call

// get all playlist of a user with valid user id / invalid user id
// get all playlist of a user with no auth/ invalid auth
// get all playlist of a user after update call of playlist total count , public type change n all
// get all playlist of a user after create call like total count , public type change n all


@Epic("JIRA Epic description")
@Feature("Playlist page FEATURE test cases")
public class CreateAndGetPlayListTest extends DataProviderCreateNGetPlayList {
     static String userid ="31nlhiawfc75bhow26i52p2vbxoa";
     String play_list_id="";
    CreatePlayList create=CreatePlayList.builder().build();
    ObjectMapper objectMapper = new ObjectMapper();

    @Links({@Link(name="JIRA", url="https://dev.example.com/"),@Link (name="WORD DOC", url="https://docs.google.com/spreadsheets")})
    @Story("Story Creation of Playlist ")
    @Link(name="JIRA", url="https://dev.example.com/")
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
    @Description("This is allure complete description ")
    @Test( priority = 1, dataProvider = "createValidPlaylistDP",
            description = "Play list should be created with all the valid data- name,description and public ")
    public void createPlayListTest(CreatePlayList createPlayList ) throws JsonProcessingException {
        //serialization
        String body =objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(createPlayList);
        //Create playlist API call
        Response response=PlaylistApi.post(createPlayList,userid);
        create=createPlayList;
        CreatePlayList createResponse=response.as(CreatePlayList.class);
        play_list_id= createResponse.getId();
        System.out.println(" playlist id is " + createResponse.getId());
        //Assertion for create response  import static org.hamcrest.MatcherAssert.*;
        PlaylistValidator.validatePlaylistCreation(response,createPlayList);
    }

    @Test( priority = 2, description = "Get Play list should give - name,description and public ")
    public void getPlayListTest(){
        Response response = PlaylistApi.get(play_list_id);
       // GetAPlayList getAPlayList=response.as(GetAPlayList.class);
        create= CreatePlayList.builder()
                .id(play_list_id)
                .name(create.getName())
                .description(create.getDescription())
                        ._public(create.get_public()).build();
        PlaylistValidator.validateGetPlaylist(response,create);
    }

    @Test (priority = 3, dataProvider ="updateNameNDescriptionOfPlayListDP", description = "Updating the name and description of a playlist")
    public void updateAPlayListTest(UpdatePlayList updatePlayList) throws JsonProcessingException {
       Response response =PlaylistApi.update(updatePlayList,"1AkKNKT3Pw4TTdjAXmRSaH");
        assertThat(response.statusCode(),Matchers.equalTo(200));
         }

    @Test(priority = 4)
    public void getAUserPlayListTest(){
        //RestAssured.responseSpecification.statusCode(200);
        Response response=PlaylistApi.getByUser(userid);
        assertThat(response.statusCode(),Matchers.equalTo(PlaylistStatusCode.CODE_200.code));
        GetAllPlayListOfUser allPlayListOfUser =response.as(GetAllPlayListOfUser.class);
       /* GetAllPlayListOfUser allPlayListOfUser = RestAssured.with()
                .spec(SpecBuilder.getRequestSpec())
                .basePath("/v1/users/{user_id}/playlists")
                .pathParam("user_id", userid)
                .get()
                .then()
                .spec(SpecBuilder.getResponseSpec())
                .body(matchesJsonSchemaInClasspath("com.spotify.schema/getallplaylistofuser.json"))
                .statusCode(200)
                .extract()
                .response()
                .as(GetAllPlayListOfUser.class);*/
        MatcherAssert.assertThat(allPlayListOfUser.getTotal(),Matchers.greaterThan(58));
        MatcherAssert.assertThat(allPlayListOfUser.getItems().stream().toArray(),Matchers.notNullValue());
    }

  @Test(priority = 5,dataProvider = "createPlaylistWithoutNameDP", description = "Create a playlist without name should get error")
    public void createPlaylistWithoutName(CreatePlayList createPlayList2) throws JsonProcessingException {
       Response response= PlaylistApi.postWithOutSchema(createPlayList2,userid);
       ErrorResponse errorResponse= response.as(ErrorResponse.class);
       assertThat(errorResponse.getError().getStatus(),Matchers.equalTo(PlaylistStatusCode.CODE_400.code));
       assertThat(errorResponse.getError().getMessage(),Matchers.equalTo(PlaylistStatusCode.CODE_400.msg));
    }

}
