package com.agnt45.retrofitrximages.Network;

import com.agnt45.retrofitrximages.Classes.JSONResponce;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by an160 on 04-03-2018.
 */

public interface RequestInterface {
    @GET("jsonparsetutorial.txt/")
    Call<JSONResponce> getJSON();
}
