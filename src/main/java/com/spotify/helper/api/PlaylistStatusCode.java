package com.spotify.helper.api;

import com.spotify.constants.PlaylistEndPoints;

public enum PlaylistStatusCode {
    CODE_200(200,""),
    CODE_201(201,""),
    CODE_400(400,"Missing required field: name"),
    CODE_401(401,"Invalid access token");

    public int code;
    public String msg;
    PlaylistStatusCode(int code, String msg){
        this.code=code;
        this.msg=msg;
    }

}
