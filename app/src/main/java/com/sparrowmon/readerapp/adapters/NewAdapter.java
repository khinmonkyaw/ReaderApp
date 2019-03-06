package com.sparrowmon.readerapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sparrowmon.readerapp.R;
import com.sparrowmon.readerapp.views.holders.NewViewHolder;

public class NewAdapter extends RecyclerView.Adapter<NewViewHolder> {
    @NonNull
    @Override
    public NewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.view_item_new,viewGroup,false);

        return new NewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewViewHolder newViewHolder, int i) {

        /*TextView tv_stastic = newViewHolder.itemView.findViewById(R.id.tv_stastics);
        tv_stastic.setText(tv_stastic.getContext().getResources().getString(R.string.stastics,48,18));*/
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
