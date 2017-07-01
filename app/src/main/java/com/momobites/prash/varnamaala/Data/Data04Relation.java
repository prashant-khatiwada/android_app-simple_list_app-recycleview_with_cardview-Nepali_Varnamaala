package com.momobites.prash.varnamaala.Data;

import com.momobites.prash.varnamaala.ModelAdapters.WordModel;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;

/**
 * Created by prash on 7/1/2017.
 */

public class Data04Relation {

    public static ArrayList<WordModel> getNuclear() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "अामा", "बाबा"
        };
        String[] NepaliConsonants = {
                "aama", "baba"
        };
        String[] EnglishConsonants = {
                "mother", "father"

        };


        int Audio[] = {

                R.raw.number_one,
                R.raw.number_one

        };

        int Image[] = {

                R.drawable.family_mother,
                R.drawable.family_father
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

    public static ArrayList<WordModel> getExtended() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "मामा"
        };
        String[] NepaliConsonants = {
                "mama"
        };
        String[] EnglishConsonants = {
                "maternal (mother's brother)"

        };


        int Audio[] = {

                R.raw.number_one

        };

        int Image[] = {

                R.drawable.family_older_brother
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

    public static ArrayList<WordModel> getGeneralRelation() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "गुरु"
        };
        String[] NepaliConsonants = {
                "guru"
        };
        String[] EnglishConsonants = {
                "Teacher"

        };


        int Audio[] = {

                R.raw.number_one

        };

        int Image[] = {

                R.drawable.family_grandfather
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
