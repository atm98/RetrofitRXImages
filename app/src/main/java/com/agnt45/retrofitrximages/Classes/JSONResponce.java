package com.agnt45.retrofitrximages.Classes;

/**
 * Created by an160 on 04-03-2018.
 */

public class JSONResponce {
    public JSONResponce(JSONResponce body) {
        this.worldpopulations = body.worldpopulations;
    }

    public void setWorldpopulations(worldpopulation[] worldpopulations) {
        this.worldpopulations = worldpopulations;
    }

    private worldpopulation[] worldpopulations=null;
    public worldpopulation[] getWorldpopulations(){

        return worldpopulations;
    }
}
