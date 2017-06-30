package com.momobites.prash.varnamaala.CategoryTwo;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.momobites.prash.varnamaala.Data.DataTime;
import com.momobites.prash.varnamaala.ModelAdapters.WordAdapter;
import com.momobites.prash.varnamaala.R;

/**
 * Created by prash on 6/28/2017.
 */

public class Month extends Fragment {

    public Month(){
        // Required Empty public Constructor
    }


    RecyclerView recyclerView;
    Context context;
    WordAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate layout for this Fragment
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        // Fix the RecycleView to the inflated Fragment
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycleView);
        // Setting Up Data - fill data
        adapter = new WordAdapter(getContext(), DataTime.getMonths());
        // Set Adapter
        recyclerView.setAdapter(adapter);
        // Set Layout Manager

        // Vertical Orientation By Default
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Return
        return rootView;

    }

    @Override
    public void onStop() {
        super.onStop();
    }

}