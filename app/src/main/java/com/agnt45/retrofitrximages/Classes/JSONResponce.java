package com.agnt45.retrofitrximages.Classes;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by an160 on 04-03-2018.
 */

public class JSONResponce {
//    public JSONResponce(JSONResponce body) {
//        this.worldpopulations = body.worldpopulations;
//    }
//
//    public void setWorldpopulations(worldpopulation[] worldpopulations)
//    {
//        this.worldpopulations = worldpopulations;
//    }
//
//    private worldpopulation[] worldpopulations=null;
//    public worldpopulation[] getWorldpopulations(){
//
//        return worldpopulations;
//    }
    @SerializedName("worldpopulation")
    private List<worldpopulation> worldpopulations;

    public void setWorldpopulations(List<worldpopulation> worldpopulations) {
        this.worldpopulations = worldpopulations;
    }

    public List<worldpopulation> getWorldpopulations() {
        return worldpopulations;
    }
}
