package com.example.myapplication;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PokeAdapter extends RecyclerView.Adapter {
       ArrayList<pokemon> adapterArray ;

    public PokeAdapter(ArrayList<pokemon> adapterArray) {
        this.adapterArray = adapterArray;
    }

    @NonNull
       @Override
       public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           return null;
       }

       @Override
       public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

       }

       @Override
       public int getItemCount() {
           return adapterArray.size() ;
       }
       public static class ViewHolder extends RecyclerView.ViewHolder {
           public ViewHolder(@NonNull View itemView) {
               super(itemView);
           }
       }
}
