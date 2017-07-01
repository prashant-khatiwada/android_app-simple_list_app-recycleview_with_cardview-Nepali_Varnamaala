package com.momobites.prash.varnamaala.Data;

import com.momobites.prash.varnamaala.ModelAdapters.WordModel;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;

/**
 * Created by prash on 7/1/2017.
 */

public class Data07Others {

    public static ArrayList<WordModel> getColors() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "रातो",
                "निलो",
                "हरियो",
                "कालो",
                "सेतो",
                "खरानी",
                "खैरो",
                "सुन्तला",
                "पहेंलो",
                "प्याजी"
        };
        String[] NepaliConsonants = {
                "rato",
                "neelo",
                "hariyo",
                "kaalo",
                "seto",
                "kharani",
                "khairo",
                "suntala",
                "pahelo",
                "pyaji"
        };
        String[] EnglishConsonants = {
                "red",
                "blue",
                "green",
                "black",
                "white",
                "gray",
                "brown",
                "orange",
                "yellow",
                "purple"

        };


        int Audio[] = {

                R.raw.color_red,
                R.raw.color_blue,
                R.raw.color_green,
                R.raw.color_black,
                R.raw.color_white,
                R.raw.color_gray,
                R.raw.color_brown,
                R.raw.color_orange,
                R.raw.color_yellow,
                R.raw.color_purple,

        };


        int Image [] = {
                R.drawable.color_red,
                R.drawable.color_blue,
                R.drawable.color_green,
                R.drawable.color_black,
                R.drawable.color_white,
                R.drawable.color_gray,
                R.drawable.color_brown,
                R.drawable.color_orange,
                R.drawable.color_yellow,
                R.drawable.color_purple

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
                "kapas ",
                "karbir",
                "kamrakh",
                "kamal",
                "kimbu",
                "kewara",
                "gulbahar",
                "gulaaf",
                "godawari f",
                "ghaas",

                "chameli",
                "champa",
                "cheeku",
                "dhatura",
                "naagvhika",
                "neelkamal",
                "patuwa",
                "paan",
                "bakaino",
                "makhamali f",

                "lazzawati",
                "sayapatri",
                "simal"

            };
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
                R.raw.number_seven
        };


        int Image [] = {
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,

                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,

                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
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

    public static ArrayList<WordModel> getFlowers() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "सयपत्री फुल",
                "फुल",
                "फुल",
                "फुल",
                "फुल",
                "फुल"
        };
        String[] NepaliConsonants = {
                "sayapatri phool", "phool", "phool", "phool", "phool", "phool"
        };
        String[] EnglishConsonants = {
                "marigold flower", "flower", "flower", "flower", "flower", "flower"

        };


        int Audio[] = {

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six,

        };


        int Image [] = {
                R.drawable.time_season_spring,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
                R.drawable.image_placeholder,
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
