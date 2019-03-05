package com.sparrowmon.readerapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sparrowmon.readerapp.R;
import com.sparrowmon.readerapp.views.holders.PopularViewHolder;

public class PopularAdapter extends RecyclerView.Adapter<PopularViewHolder> {


    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.view_item_popular,viewGroup,false);
        return new PopularViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder popularViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
