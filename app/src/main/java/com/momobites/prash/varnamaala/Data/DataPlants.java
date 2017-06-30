package com.momobites.prash.varnamaala.Data;

import com.momobites.prash.varnamaala.ModelAdapters.WordModel;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;

/**
 * Created by prash on 6/29/2017.
 */

public class DataPlants {

    public static ArrayList<WordModel> getPlants() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "कपास",
                "करवीर",
                "कमरख",
                "कमल",
                "किम्बु",
                "केवरा",
                "गुल बहार",
                "गुलाफ",
                "गोदावरी फूल",
                "घाँस",

                "चमेली",
                "चम्पा",
                "चीकू",
                "धतुरा",
                "नागभिका",
                "नीलकमल",
                "पटुआ",
                "पान",
                "बकाइनो",
                "मखमली फूल",

                "लज्जावती झार",
                "सयपत्री फुल",
                "सिमल"
        };
        String[] NepaliConsonants = {
                "कपास",
                "करवीर",
                "कमरख",
                "कमल",
                "किम्बु",
                "केवरा",
                "गुल बहार",
                "गुलाफ",
                "गोदावरी फूल",
                "घाँस",

                "चमेली",
                "चम्पा",
                "चीकू",
                "धतुरा",
                "नागभिका",
                "नीलकमल",
                "पटुआ",
                "पान",
                "बकाइनो",
                "मखमली फूल",

                "लज्जावती झार",
                "सयपत्री फुल",
                "सिमल"        };
        String[] EnglishConsonants = {
                "कपास",
                "करवीर",
                "कमरख",
                "कमल",
                "किम्बु",
                "केवरा",
                "गुल बहार",
                "गुलाफ",
                "गोदावरी फूल",
                "घाँस",

                "चमेली",
                "चम्पा",
                "चीकू",
                "धतुरा",
                "नागभिका",
                "नीलकमल",
                "पटुआ",
                "पान",
                "बकाइनो",
                "मखमली फूल",

                "लज्जावती झार",
                "सयपत्री फुल",
                "सिमल"
        };


        int Audio[] = {

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six,
                R.raw.number_seven,

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six,
                R.raw.number_seven,

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six,
                R.raw.number_seven,


                R.raw.number_six,
                R.raw.number_seven,
        };


        int Image [] = {
                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_six,
                R.drawable.number_seven,

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
