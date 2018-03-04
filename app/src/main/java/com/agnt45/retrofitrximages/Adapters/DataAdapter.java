package com.agnt45.retrofitrximages.Adapters;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.agnt45.retrofitrximages.Classes.worldpopulation;
import com.agnt45.retrofitrximages.HomeScreen;
import com.agnt45.retrofitrximages.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by an160 on 04-03-2018.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>  {
    private ArrayList<worldpopulation> worldpopulations = null;
    private View view;
    public DataAdapter(ArrayList<worldpopulation> data) {
        this.worldpopulations = data;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row
                ,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        Picasso.with(holder.Flag.getContext()).load(worldpopulations.get(position).getFlag()).into(holder.Flag);
    }

    @Override
    public int getItemCount() {
        return worldpopulations.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView Flag;
        public ViewHolder(View itemView) {
            super(itemView);
            Flag = itemView.findViewById(R.id.flag);
        }
    }
}
