package com.momobites.prash.varnamaala.Data;

import com.momobites.prash.varnamaala.ModelAdapters.WordModel;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;

/**
 * Created by prash on 7/1/2017.
 */

public class Data03Places {

    public static ArrayList<WordModel> getGeneralPlaces() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "घर"
        };
        String[] NepaliConsonants = {
                "ghar"
        };
        String[] EnglishConsonants = {
                "Home/House"

        };


        int Audio[] = {

                R.raw.number_one

        };

        int Image[] = {

                R.drawable.family_mother
        };

        for (int i = 0; i < DevConsonants.length; i++) {
            data.add(new WordModel(
                            DevConsonants[i] ,
                            NepaliConsonants[i],
                            EnglishConsonants[i],
                            /*Audio Resource*/
                            Audio[i],
                            /*Image Resource If any*/
                            Image[i]


                    )
            );
        }

        return data;
    }

    public static ArrayList<WordModel> getCities() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "काठमांडाै"
        };
        String[] NepaliConsonants = {
                "katha-mandu"
        };
        String[] EnglishConsonants = {
                "Kathmandu"

        };


        int Audio[] = {

                R.raw.number_one

        };


        int Image[] = {

                R.drawable.image_placeholder
        };

        for (int i = 0; i < DevConsonants.length; i++) {
            data.add(new WordModel(
                            DevConsonants[i] ,
                            NepaliConsonants[i],
                            EnglishConsonants[i],
                            /*Audio Resource*/
                            Audio[i],
                            /*Image Resource If any*/
                            Image[i]


                    )
            );
        }

        return data;
    }

    public static ArrayList<WordModel> getStates() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
               "राज्य"
        };
        String[] NepaliConsonants = {
                "rajya"
        };
        String[] EnglishConsonants = {
                "state"

        };


        int Audio[] = {

                R.raw.number_one

        };

        int Image[] = {

                R.drawable.family_mother
        };


        for (int i = 0; i < DevConsonants.length; i++) {
            data.add(new WordModel(
                            DevConsonants[i] ,
                            NepaliConsonants[i],
                            EnglishConsonants[i],
                            /*Audio Resource*/
                            Audio[i],
                            /*Image Resource If any*/
                            Image[i]


                    )
            );
        }

        return data;
    }

    public static ArrayList<WordModel> getCountries() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "नेपाल"
        };
        String[] NepaliConsonants = {
                "nepal"

        };
        String[] EnglishConsonants = {

                "Nepal"
        };


        int Audio[] = {

                R.raw.number_one

        };

        int Image[] = {

                R.drawable.image_placeholder
        };


        for (int i = 0; i < DevConsonants.length; i++) {
            data.add(new WordModel(
                            DevConsonants[i] ,
                            NepaliConsonants[i],
                            EnglishConsonants[i],
                            /*Audio Resource*/
                            Audio[i],
                            /*Image Resource If any*/
                            Image[i]


                    )
            );
        }

        return data;
    }
}
