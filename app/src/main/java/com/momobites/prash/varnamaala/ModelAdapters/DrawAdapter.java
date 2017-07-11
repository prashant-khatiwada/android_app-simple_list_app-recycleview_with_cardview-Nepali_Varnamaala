package com.momobites.prash.varnamaala.ModelAdapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.momobites.prash.varnamaala.Drawing.DrawBoard;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.view.View.GONE;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;


public class DrawAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<WordModel> list = Collections.emptyList();
    Context context;
    private LayoutInflater inflater;

    public static String getDevnagari_word() {
        return devnagari_word;
    }
    public static void setDevnagari_word(String devnagari_word) {
        DrawAdapter.devnagari_word = devnagari_word;
    }
    public static String devnagari_word;


    public DrawAdapter(Context context, ArrayList<WordModel> data) {
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
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent, false);
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


        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(300, WRAP_CONTENT);
        viewHolder.cv.setLayoutParams(layoutParams);

        // Things to Show
        viewHolder.DevgnagariWord.setTextSize(40);
        viewHolder.NepaliWord.setTextSize(16);


        // Things to Hide
        viewHolder.EnglishWord.setVisibility(GONE);
        viewHolder.AdditionalDetails.setVisibility(GONE);
        viewHolder.PrimaryImage.setVisibility(GONE);
        viewHolder.SecondaryImage.setVisibility(GONE);
        viewHolder.btn_additional_details.setVisibility(GONE);


        /*On Item Click*/
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                devnagari_word = (String) viewHolder.DevgnagariWord.getText();

                Toast.makeText(context, devnagari_word,
                        Toast.LENGTH_SHORT).show();


            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}