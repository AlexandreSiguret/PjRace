package com.pagejaune.stage02.pjrace.core;

/**
 * Created by stage02 on 03/02/17.
 */

public class Challenge {
    private int id;
    private String code_etab;
    private String type;
    private int points;
    private String denom;

    public Challenge(){}

    public Challenge(int id, String code_etab, String type, int points, String denom) {
        this.id = id;
        this.code_etab = code_etab;
        this.type = type;
        this.points = points;
        this.denom = denom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode_etab() {
        return code_etab;
    }

    public void setCode_etab(String code_etab) {
        this.code_etab = code_etab;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }
}
