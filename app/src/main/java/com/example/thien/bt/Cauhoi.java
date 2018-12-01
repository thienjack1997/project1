package com.example.thien.bt;

public class Cauhoi {
    String cauhoi;
    Boolean cautraloi;

    public String getcauhoi(){

        return this.cauhoi;

    }

    public Boolean getcautraloi(){

        return this.cautraloi;

    }

    public void setcauhoi(String cauhoi){

        this.cauhoi=cauhoi;

    }

    public void setcautraloi(Boolean cautraloi){

        this.cautraloi=cautraloi;
    }

    public Cauhoi(){

    }

    public Cauhoi(String cauhoi, Boolean cautraloi){

        this.cauhoi=cauhoi;

        this.cautraloi=cautraloi;

    }
}
