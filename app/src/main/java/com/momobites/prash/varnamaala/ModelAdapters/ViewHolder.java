package com.momobites.prash.varnamaala.ModelAdapters;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.momobites.prash.varnamaala.R;


public class ViewHolder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView NepaliWord;
    TextView DevgnagariWord;
    TextView EnglishWord;

    TextView aspiration, name, pronunciation, approximatePronunciation;

    /*Buttons ImageView*/
    ImageView btn_additional_details, btn_draw;
    /*Image*/
    ImageView PrimaryImage;
    ImageView SecondaryImage;

    /*Views*/
    LinearLayout AdditionalDetails;
    LinearLayout row_listContainer;

    /*
    * The RecyclerView uses a ViewHolder to store the references to the relevant views for one
    * entry in the RecyclerView. This solution avoids all the findViewById() method calls
    * in the adapter to find the views to be filled with data.
    * */
    public ViewHolder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);

        /* Main Container View*/
        row_listContainer = (LinearLayout) itemView.findViewById(R.id.container);

        /*First Three Words/Letters*/
        NepaliWord = (TextView) itemView.findViewById(R.id.nep_textview);
        DevgnagariWord = (TextView) itemView.findViewById(R.id.dev_textview);
        EnglishWord = (TextView) itemView.findViewById(R.id.eng_textview);

        /*ImageView Buttons*/
        btn_additional_details = (ImageView) itemView.findViewById(R.id.additional_details_btn);
        btn_draw = (ImageView) itemView.findViewById(R.id.draw_btn);
        /*Image*/
        PrimaryImage = (ImageView) itemView.findViewById(R.id.imageView_primary);
        SecondaryImage = (ImageView) itemView.findViewById(R.id.imageView_secondary);

        /*Views*/
        AdditionalDetails = (LinearLayout) itemView.findViewById(R.id.additional_details);

        /*CardView Details*/
        aspiration = (TextView) itemView.findViewById(R.id.aspiration);
        name = (TextView) itemView.findViewById(R.id.name);
        pronunciation = (TextView) itemView.findViewById(R.id.pronunciation);
        approximatePronunciation = (TextView) itemView.findViewById(R.id.apprx_pronunciation);


    }
}
