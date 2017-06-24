package com.momobites.prash.varnamaala.ModelAdapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.media.CamcorderProfile.get;
import static android.support.design.R.id.center;
import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * Created by prash on 6/24/2017.
 */

public class MenuAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<MenuModel> list = Collections.emptyList();
    private Context context;
    private LayoutInflater inflater;



    public MenuAdapter(Context context, ArrayList<MenuModel> data) {
        this.context = context;
        this.list = data;
        inflater = LayoutInflater.from(context);

    }

    /*
    * inflates the row layout is and initializes the View Holder. Once the View Holder is
    * initialized it manages the findViewById() methods, finding the views once and recycling
    * them to avoid repeated calls.
    * */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(
                parent.getContext()).inflate(R.layout.row_layout,
                parent,
                false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    /*
    * uses the View Holder constructed in the onCreateViewHolder() method to populate the
    * current row of the RecyclerView with data.
    * */
    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        viewHolder.NepaliWord.setText(list.get(position).getNepaliTranslationId());
        viewHolder.DevgnagariWord.setText(list.get(position).getDevnagariId());
        viewHolder.EnglishWord.setText(list.get(position).getmEnglishId());

        viewHolder.AdditionalDetail.setVisibility(GONE);
        viewHolder.Compounnds.setVisibility(GONE);
        viewHolder.SecondaryImage.setVisibility(VISIBLE);
        viewHolder.PrimaryImage.setVisibility(GONE);
        viewHolder.btn_audio.setVisibility(GONE);
        viewHolder.btn_compounds.setVisibility(GONE);
        viewHolder.DevgnagariWord.setTextSize(40);
        viewHolder.DevgnagariWord.setGravity(center);



        /*On Item Click View*/
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(context,
                        list.get(position).getmMenuClassId()
                        );
                context.startActivity(myIntent);

            }
        });

    }


    @Override
    public int getItemCount() {
        return list.size();
    }


}
