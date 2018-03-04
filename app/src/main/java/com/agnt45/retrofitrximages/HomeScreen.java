package com.agnt45.retrofitrximages;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.agnt45.retrofitrximages.Adapters.DataAdapter;
import com.agnt45.retrofitrximages.Classes.JSONResponce;
import com.agnt45.retrofitrximages.Classes.worldpopulation;
import com.agnt45.retrofitrximages.Network.RequestInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;
import java.util.concurrent.Callable;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeScreen extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<worldpopulation> data;
    private DataAdapter adapter;
    Boolean initdata =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        io.reactivex.Observable.fromCallable(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return initData();
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(result -> Toast.makeText(this,"Done",Toast.LENGTH_LONG).show());


    }

    private Integer initData() {
        recyclerView = findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        JsonLoad();
        return 1;
    }

    private void JsonLoad() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.androidbegin.com/tutorial/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestInterface requestInterface = retrofit.create(RequestInterface.class);
        Call<JSONResponce> call = requestInterface.getJSON();
        call.enqueue(new Callback<JSONResponce>() {
            @Override
            public void onResponse(@NonNull Call<JSONResponce> call, @NonNull Response<JSONResponce> response) {
                JSONResponce jsonResponce = response.body();

                assert jsonResponce != null;
                data = (ArrayList<worldpopulation>) jsonResponce.getWorldpopulations();
//                Log.e("Debug",data.toString());
                adapter = new DataAdapter(data);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(@NonNull Call<JSONResponce> call, @NonNull Throwable t) {
                Log.d("Error",t.getMessage());

            }
        });
    }


}
