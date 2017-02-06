package com.pagejaune.stage02.pjrace.network;

/**
 * Created by stage02 on 03/02/17.
 */


public enum Url {

    USER ("/v1/user "),
    CHALLENGETYPE ("/v1/challengetype"),
    ETAB("/v1/etab"),
    CHALLENGE("/v1/challenge"),
    CHALLENGEDETAILS("/v1/challenge/{:idChallenge}"),
    ACHIEVEMENT("/v1/achievement"),
    RANKING("/v1/ranking");

    private String url = "";


    Url(String url){
        this.url = url;
    }

    public String getString(){
        return url;
    }

}