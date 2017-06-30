package com.momobites.prash.varnamaala.Data;

import com.momobites.prash.varnamaala.ModelAdapters.WordModel;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;

/**
 * Created by prash on 6/29/2017.
 */

public class DataFood {

    public static ArrayList<WordModel> getDailyFoods() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "आइतबार", "सोमबार", "मगंलबार", "बुधबार", "बिहिबार", "शुक्रबार", "शनिबार"
        };
        String[] NepaliConsonants = {
                "aaita-baar", "som-baar", "mangal-baar", "budha-baar", "bihi-baar", "shukra-baar", "shani-baar"
        };
        String[] EnglishConsonants = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"

        };


        int Audio[] = {

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
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

    public static ArrayList<WordModel> getFruits() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {

                "भुइकटहर",
                "अनार",
                "अम्बा",
                "अंगुर",
                "अंजीर",
                "आँप",
                "आरु",
                "आलस",
                "आलुबखडा",
                "ओखर",
                "उखु",
                "कटहर",
                "काजु",
                "किसमिस",
                "काफल",
                "काशीफल",
                "केरा",
                "खजूर",
                "खरबुजा",
                "गाजर",
                "चिनिया बदाम",
                "जैतुन",
               "जापानी बयर",
                "तितरी",
                "नरिवल",
                "ज्यामिर",
                "मेवा",
                "पेस्ता",
                "बदाम",
                "बयर",
                "मुँगफली",
                "मौसमी",
                "लिची",
                "मनक्का",
                "सरीफा",
                "स्याउ",
                "सुन्तला",
                "घ्याम्पे ऐंसेलु जामुन",
        };
        String[] NepaliConsonants = {
                "भुइकटहर ",
                "अनार",
                "अम्बा",
                "अंगुर",
                "अंजीर",
                "आँप",
                "आरु",
                "आलस",
                "आलुबखडा",
                "ओखर",
                "उखु",
                "कटहर",
                "काजु",
                "किसमिस",
                "काफल",
                "काशीफल",
                "केरा",
                "खजूर",
                "खरबुजा",
                "गाजर",
                "चिनिया बदाम",
                "जैतुन",
                "जापानी बयर",
                "तितरी",
                "नरिवल",
                "ज्यामिर",
                "मेवा",
                "पेस्ता",
                "बदाम",
                "बयर",
                "मुँगफली",
                "मौसमी",
                "लिची",
                "मनक्का",
                "सरीफा",
                "स्याउ",
                "सुन्तला",
                "घ्याम्पे ऐंसेलु जामुन",        };
        String[] EnglishConsonants = {
                "भुइकटहर ",
                "अनार",
                "अम्बा",
                "अंगुर",
                "अंजीर",
                "आँप",
                "आरु",
                "आलस",
                "आलुबखडा",
                "ओखर",

                "उखु",
                "कटहर",
                "काजु",
                "किसमिस",
                "काफल",
                "काशीफल",
                "केरा",
                "खजूर",
                "खरबुजा",
                "गाजर",

                "चिनिया बदाम",
                "जैतुन",
                "जापानी बयर",
                "तितरी",
                "नरिवल",
                "ज्यामिर",
                "मेवा",
                "पेस्ता",
                "बदाम",
                "बयर",
                "मुँगफली",

                "मौसमी",
                "लिची",
                "मनक्का",
                "सरीफा",
                "स्याउ",
                "सुन्तला",
                "घ्याम्पे ऐंसेलु जामुन",
        };


        int Audio[] = {

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six,
                R.raw.number_seven,
                R.raw.number_eight,
                R.raw.number_nine,
                R.raw.number_ten,

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six,
                R.raw.number_seven,
                R.raw.number_eight,
                R.raw.number_nine,
                R.raw.number_ten,


                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six,
                R.raw.number_seven,
                R.raw.number_eight,
                R.raw.number_nine,
                R.raw.number_ten,


                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
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
                            Audio[i]
                            /*Image Resource If any*/
                            //Image[i]


                    )
            );
        }

        return data;
    }

    public static ArrayList<WordModel> getVegetables() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {

                "अदुवा",
                "आलु",
                "कागती",
                "करेला",
                "काउली",
                "काक्रो",
                "किम्बु",
                "कुभिण्डो",
                "केराउ",
                "खुसानी",

                "ग्याँठ कोभी",
                "च्याउ",
                "चिचिन्डो",
                "तरुल",
                "धनिया",
                "पालक",
                "पिंडालु",
                "कर्कलो",
                "पुदिना",
                "प्याज",

                "फर्सी",
                "बन्दागोबी",
                "बैगन",
                "भिन्डी, रामतोरिया",
                "मकै",
                "मूला",
                "तरुल",
                "सकरकन्द",
                "सलगम",
                "साबुदाना",

                "सिमी",
                "सुठनी"
        };
        String[] NepaliConsonants = {

                "अदुवा",
                "आलु",
                "कागती",
                "करेला",
                "काउली",
                "काक्रो",
                "किम्बु",
                "कुभिण्डो",
                "केराउ",
                "खुसानी",

                "ग्याँठ कोभी",
                "च्याउ",
                "चिचिन्डो",
                "तरुल",
                "धनिया",
                "पालक",
                "पिंडालु",
                "कर्कलो",
                "पुदिना",
                "प्याज",

                "फर्सी",
                "बन्दागोबी",
                "बैगन",
                "भिन्डी, रामतोरिया",
                "मकै",
                "मूला",
                "तरुल",
                "सकरकन्द",
                "सलगम",
                "साबुदाना",

                "सिमी",
                "सुठनी"

        };
        String[] EnglishConsonants = {
                "अदुवा",
                "आलु",
                "कागती",
                "करेला",
                "काउली",
                "काक्रो",
                "किम्बु",
                "कुभिण्डो",
                "केराउ",
                "खुसानी",

                "ग्याँठ कोभी",
                "च्याउ",
                "चिचिन्डो",
                "तरुल",
                "धनिया",
                "पालक",
                "पिंडालु",
                "कर्कलो",
                "पुदिना",
                "प्याज",

                "फर्सी",
                "बन्दागोबी",
                "बैगन",
                "भिन्डी, रामतोरिया",
                "मकै",
                "मूला",
                "तरुल",
                "सकरकन्द",
                "सलगम",
                "साबुदाना",

                "सिमी",
                "सुठनी"
        };


        int Audio[] = {

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six,
                R.raw.number_seven,
                R.raw.number_eight,
                R.raw.number_nine,
                R.raw.number_ten,

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six,
                R.raw.number_seven,
                R.raw.number_eight,
                R.raw.number_nine,
                R.raw.number_ten,


                R.raw.number_one,
                R.raw.number_two,

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
                            Audio[i]
                            /*Image Resource If any*/
                            //Image[i]


                    )
            );
        }

        return data;
    }

    public static ArrayList<WordModel> getDrinks() {

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
