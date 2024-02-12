package com.spotify.test.playlist;

import com.spotify.pojo.CreatePlayList;
import com.spotify.pojo.UpdatePlayList;
import com.spotify.utilities.FakerUtils;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderCreateNGetPlayList {
    /*@BeforeMethod
    public void threadCHeck(Method m){
        System.out.println(" starting of the thread" + m.getName());
        System.out.println("thread id " + Thread.currentThread().threadId());
    }*/
    UpdatePlayList updatePlayList = new UpdatePlayList();

    @Step
    @DataProvider (name = "createValidPlaylistDP")
    public Object[][] createValidPlaylist(){
        CreatePlayList createPlayList=CreatePlayList.builder()
                .description(FakerUtils.generateDescription())
                .name(FakerUtils.generateName())
                ._public(false)
                .build();

        return new Object[][]{{createPlayList}};
    }

    @Step
    @DataProvider (name = "updateNameNDescriptionOfPlayListDP")
    public Object[][] updateNameAndDescripOfPlaylist(){
         updatePlayList.setName("Updated PL_NAME");
         updatePlayList.setDescription("UPDATE the description");
        return new Object[][] {{updatePlayList}};
    }

    @Step
    @DataProvider(name = "createPlaylistWithoutNameDP")
    public Object[] [] createPlaylistNoName(){
        //= new CreatePlayList();
        CreatePlayList createPlayList2=CreatePlayList.builder()
                ._public(false)
                .description(FakerUtils.generateDescription()).build();
        return new Object[][] {{createPlayList2}};
    }
}
