package com.momobites.prash.varnamaala;


import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.momobites.prash.varnamaala.Data.DataLetters;
import com.momobites.prash.varnamaala.ModelAdapters.ConsonantAdapter;

public class CatOneFragmentOne extends Fragment {

    public CatOneFragmentOne(){
        // Required Empty public Constructor
    }

    RecyclerView recyclerView;
    Context context;
    ConsonantAdapter adapter;
    View view;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the Layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_main, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        // Setting up the adapter
        adapter = new ConsonantAdapter(context, DataLetters.getConsonants());
        recyclerView.setAdapter(adapter);

        // Vertical Orientation By Default
        // Set the Linear Layout manager
        LinearLayoutManager  layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);


        // Return
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();

    }

}


