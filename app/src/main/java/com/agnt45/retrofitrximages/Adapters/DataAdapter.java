package com.agnt45.retrofitrximages.Adapters;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.agnt45.retrofitrximages.Classes.worldpopulation;
import com.agnt45.retrofitrximages.FullScreen;
import com.agnt45.retrofitrximages.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by an160 on 04-03-2018.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>  {
    private ArrayList<worldpopulation> worldpopulations = null;
    private View view;
    private Context context;
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
    public void onBindViewHolder(final DataAdapter.ViewHolder holder, int position) {
        Picasso.with(holder.Flag.getContext()).load(worldpopulations.get(position).getFlag()).into(holder.Flag);
        holder.Flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,FullScreen.class);
                intent.putExtra("FlagUrl",worldpopulations.get(holder.getAdapterPosition()).getFlag());
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return worldpopulations.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView Flag;

        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            Flag = itemView.findViewById(R.id.flag);
//            itemView.setOnClickListener(this);itemView.setOnClickListener(this);
        }
//        public void setItemClickListener(ItemClickListener itemClickListener){
//            this.itemClickListener = itemClickListener;
//        }
//        @Override
//        public void onClick(View view) {
//            itemClickListener.onClick(view,getAdapterPosition(),false);
//        }

//        @Override
//        public boolean onLongClick(View view) {
//            return false;
//        }
    }
}
