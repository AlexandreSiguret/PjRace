package com.pagejaune.stage02.pjrace.core;

/**
 * Created by stage02 on 03/02/17.
 */

public class Etab {
    private int code_Etab;
    private String denom;
    private String adress;

    public Etab(){}

    public Etab(String denom, int code_Etab, String adress) {
        this.denom = denom;
        this.code_Etab = code_Etab;
        this.adress = adress;
    }

    public int getCode_Etab() {
        return code_Etab;
    }

    public void setCode_Etab(int code_Etab) {
        this.code_Etab = code_Etab;
    }

    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
