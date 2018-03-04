package com.agnt45.retrofitrximages.Classes;

import android.content.Intent;

import com.google.gson.annotations.SerializedName;

/**
 * Created by an160 on 04-03-2018.
 */

public class worldpopulation {
    @SerializedName("rank")
    private Integer rank;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
    @SerializedName("country")
    private String country;
    @SerializedName("population")
    private String population;
    @SerializedName("flag")
    private String flag;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public worldpopulation(Integer rank, String country, String population, String flag) {
        this.rank = rank;
        this.country = country;
        this.population = population;
        this.flag = flag;
    }


}
