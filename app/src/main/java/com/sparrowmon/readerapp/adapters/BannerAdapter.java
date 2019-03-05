package com.sparrowmon.readerapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.sparrowmon.readerapp.R;
import com.sparrowmon.readerapp.views.holders.BannerViewHolder;

public class BannerAdapter extends RecyclerView.Adapter<BannerViewHolder> {
    @NonNull
    @Override
    public BannerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.view_item_banner,viewGroup,false);
        return new BannerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BannerViewHolder baseViewHolder, int i) {




    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
