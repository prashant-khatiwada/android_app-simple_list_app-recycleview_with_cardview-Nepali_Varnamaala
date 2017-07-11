package com.momobites.prash.varnamaala.Drawing;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.momobites.prash.varnamaala.ModelAdapters.DrawAdapter;
import com.momobites.prash.varnamaala.ModelAdapters.LetterModel;
import com.momobites.prash.varnamaala.ModelAdapters.WordModel;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;

public class DrawBoardTopFragment extends Fragment {

    public DrawBoardTopFragment() {
        // Required Empty public Constructor
    }


    RecyclerView recyclerView;
    Context context;
    DrawAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // get data
        Bundle bundle = getArguments();
        String[] Dev_compounds = bundle.getStringArray("DEV_KEY");
        String[] Nep_compounds = bundle.getStringArray("NEP_KEY");

        // Inflate layout for this Fragment
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        // Fix the RecycleView to the inflated Fragment
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycleView);

        ArrayList<WordModel> data = new ArrayList<>();
        for (int xyz = 0; xyz < Dev_compounds.length; xyz++) {
            assert Nep_compounds != null;
            data.add(new WordModel(
                    Dev_compounds[xyz],
                    Nep_compounds[xyz],
                    Nep_compounds[xyz],
                    xyz
            ));
        }


        // Setting Up Data - fill data
        adapter = new DrawAdapter(getContext(), data);
        // Set Adapter
        recyclerView.setAdapter(adapter);
        // Set Layout Manager

        // Vertical Orientation By Default
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        // (Context context)
        //GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),1);
        //StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        // Return
        return rootView;

    }


}