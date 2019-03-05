package com.sparrowmon.readerapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.sparrowmon.readerapp.R;
import com.sparrowmon.readerapp.adapters.BannerAdapter;

public class BannerFragment extends Fragment {



    private static final String ARG_DATA_TO_FRAGMENT = "ARG_DATA_TO_FRAGMENT";

    public static BannerFragment newInstance(String dataToFragment) {
        BannerFragment fragment = new BannerFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_DATA_TO_FRAGMENT, dataToFragment);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_banner,container,false);

        RecyclerView recyclerView = view.findViewById(R.id.rv_banner);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        BannerAdapter bannerAdapter = new BannerAdapter();
        recyclerView.setAdapter(bannerAdapter);
        return view;
    }
}
