package com.example.kiddos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LevelAdapter extends RecyclerView.Adapter<LevelAdapter.ViewHolder> {


    List<LevelModelClass> levelModelClasses;
    Context context;

    public LevelAdapter(List<LevelModelClass> levelModelClasses, Context context) {
        this.levelModelClasses = levelModelClasses;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.level_items,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        LevelModelClass levelModelClass= levelModelClasses.get(position);
        holder.textViewA.setText(levelModelClass.getTextA());


    }

    @Override
    public int getItemCount() {
        return levelModelClasses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewA;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewA=itemView.findViewById(R.id.textA);

        }
    }
}
