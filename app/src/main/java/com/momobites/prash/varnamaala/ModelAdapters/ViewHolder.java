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

    /*Buttons*/
    ImageView btn_audio;
    ImageView btn_compounds;

    /*Views*/
    LinearLayout AdditionalDetail;
    ConstraintLayout Constraint;
    HorizontalScrollView Compounnds;

    /*Image*/
    ImageView PrimaryImage;
    ImageView SecondaryImage;
    /*Additional Details*/
    TextView Aspiration;
    TextView Name;
    TextView Pronunciation;
    TextView ApproximatePronunciation;
    /*Compound Words Devnagari*/
    TextView K1;
    TextView K2;
    TextView K3;
    TextView K4;
    TextView K5;
    TextView K6;
    TextView K7;
    TextView K8;
    TextView K9;
    TextView K10;
    TextView K11;
    TextView K12;
    /*Compound Words Nepali*/
    TextView NepC1;
    TextView NepC2;
    TextView NepC3;
    TextView NepC4;
    TextView NepC5;
    TextView NepC6;
    TextView NepC7;
    TextView NepC8;
    TextView NepC9;
    TextView NepC10;
    TextView NepC11;
    TextView NepC12;


    /*
    * The RecyclerView uses a ViewHolder to store the references to the relevant views for one
    * entry in the RecyclerView. This solution avoids all the findViewById() method calls
    * in the adapter to find the views to be filled with data.
    * */
    public ViewHolder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        NepaliWord = (TextView) itemView.findViewById(R.id.nep_textview);
        DevgnagariWord = (TextView) itemView.findViewById(R.id.dev_textview);
        EnglishWord = (TextView) itemView.findViewById(R.id.eng_textview);

        /*ImageView Buttons*/
        btn_audio = (ImageView) itemView.findViewById(R.id.audio_btn);
        btn_compounds = (ImageView) itemView.findViewById(R.id.compounds_btn);

        /*Image*/
        PrimaryImage = (ImageView) itemView.findViewById(R.id.imageView_primary);
        SecondaryImage = (ImageView) itemView.findViewById(R.id.imageView_secondary);

        /*Views*/
        AdditionalDetail = (LinearLayout) itemView.findViewById(R.id.additional_details);
        Compounnds = (HorizontalScrollView) itemView.findViewById(R.id.compounds);
        Constraint = (ConstraintLayout) itemView.findViewById(R.id.imageView_holder);

        /*Details*/
        Aspiration = (TextView) itemView.findViewById(R.id.aspiration);
        Name = (TextView) itemView.findViewById(R.id.name);
        Pronunciation = (TextView) itemView.findViewById(R.id.pronunciation);
        ApproximatePronunciation = (TextView) itemView.findViewById(R.id.apprx_pronunciation);

        /*Compound Devnagari Words*/
        K1 = (TextView) itemView.findViewById(R.id.compound_dev_01);
        K2 = (TextView) itemView.findViewById(R.id.compound_dev_02);
        K3 = (TextView) itemView.findViewById(R.id.compound_dev_03);
        K4 = (TextView) itemView.findViewById(R.id.compound_dev_04);
        K5 = (TextView) itemView.findViewById(R.id.compound_dev_05);
        K6 = (TextView) itemView.findViewById(R.id.compound_dev_06);
        K7 = (TextView) itemView.findViewById(R.id.compound_dev_07);
        K8 = (TextView) itemView.findViewById(R.id.compound_dev_08);
        K9 = (TextView) itemView.findViewById(R.id.compound_dev_09);
        K10 = (TextView) itemView.findViewById(R.id.compound_dev_10);
        K11 = (TextView) itemView.findViewById(R.id.compound_dev_11);
        K12 = (TextView) itemView.findViewById(R.id.compound_dev_12);
        
        /*Compound Nepali Words*/
        NepC1 = (TextView) itemView.findViewById(R.id.compound_nep_01);
        NepC2 = (TextView) itemView.findViewById(R.id.compound_nep_02);
        NepC3 = (TextView) itemView.findViewById(R.id.compound_nep_03);
        NepC4 = (TextView) itemView.findViewById(R.id.compound_nep_04);
        NepC5 = (TextView) itemView.findViewById(R.id.compound_nep_05);
        NepC6 = (TextView) itemView.findViewById(R.id.compound_nep_06);
        NepC7 = (TextView) itemView.findViewById(R.id.compound_nep_07);
        NepC8 = (TextView) itemView.findViewById(R.id.compound_nep_08);
        NepC9 = (TextView) itemView.findViewById(R.id.compound_nep_09);
        NepC10 = (TextView) itemView.findViewById(R.id.compound_nep_10);
        NepC11 = (TextView) itemView.findViewById(R.id.compound_nep_11);
        NepC12 = (TextView) itemView.findViewById(R.id.compound_nep_12);

    }
}
