package com.momobites.prash.varnamaala.Data;

import com.momobites.prash.varnamaala.ModelAdapters.WordModel;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;

/**
 * Created by prash on 6/28/2017.
 */

public class DataTime {

    public static ArrayList<WordModel> getTime() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "अस्ती", "हिजो","आज", "भोली", "पर्सी",  "निको-पर्सी",
                "बिहान", "दिऊसों", "सांझ", "दिन", "रात",
                "मध्य-रात", "मिरमिरे उज्यालो", "मध्य-दिन",
                "आहिले", "अघि", "पछि", "एकछिन",
                "घन्टा", "मिनट"
        };
        String[] NepaliConsonants = {
                "asti", "hijo", "aaja", "bholi", "parsi", "niko parsi",
                "bihana", "diuso", "sanjha", "din", "raat",
                "madhya-raat", "mir mire ujyalo", "madhya-din",
                "ahile", "agjhi", "pachi", "ekchin",
                "ghanta", "minute"

        };
        String[] EnglishConsonants = {
                "day before yesterday", "yesterday", "today", "tomorrow", "day after tomorrow", "three days from today",
                "morning", "afternoon", "evening", "day", "night",
                "mid-night", "morning light", "mid-day",
                "now", "moments ago", "later", "in a moment",
                "hour", "minute"

        };


        int Audio[] = {

                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one


        };


        for (int i = 0; i < DevConsonants.length; i++) {
            data.add(new WordModel(
                            DevConsonants[i] ,
                            NepaliConsonants[i],
                            EnglishConsonants[i],
                            /*Audio Resource*/
                            Audio[i]
                            /*Image Resource If any*/


                    )
            );
        }

        return data;
    }

    public static ArrayList<WordModel> getWeeks() {

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

    public static ArrayList<WordModel> getMonths() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "बैशाख",
                "जेठ",
                "असार",
                "साउन",
                "भाद्र",
                "असोज",
                "कार्तिक",
                "मशिंर",
                "पुष",
                "माघ",
                "फागुन",
                "चैत्र"
        };
        String[] NepaliConsonants = {
                "baisakh",
                "jestha",
                "asaar",
                "saun",
                "bhadra",
                "ashoj",
                "kartik",
                "manshir",
                "poush",
                "magh",
                "fagun",
                "chaitra"

        };
        String[] EnglishConsonants = {

                "Mid-April to Mid-May",
                "Mid-May to Mid-June",
                "Mid-June to Mid-July",
                "Mid-July to Mid-August",
                "Mid-August to Mid-September",
                "Mid-September to Mid-October",
                "Mid-October to Mid-November",
                "Mid-November to Mid-December",
                "Mid-December to Mid-January",
                "Mid-January to Mid-February",
                "Mid-February to Mid-March",
                "Mid-March to Mid-April"

        };


        int Audio[] = {

                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one,
                R.raw.number_one


        };


        for (int i = 0; i < DevConsonants.length; i++) {
            data.add(new WordModel(
                            DevConsonants[i] ,
                            NepaliConsonants[i],
                            EnglishConsonants[i],
                            /*Audio Resource*/
                            Audio[i]
                            /*Image Resource If any*/


                    )
            );
        }

        return data;
    }

    public static ArrayList<WordModel> getSeason() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "बसन्त",
                "ग्रिष्म",
                "वर्षा",
                "शरद्",
                "हेमन्त",
                "शिशिर"
        };
        String[] NepaliConsonants = {
                "vasant", "grishma", "varsha", "sharad", "hemanta", "shishira"
        };
        String[] EnglishConsonants = {
                "Spring", "Summer", "Monsoon", "Autumn", "Winter", "Fall"

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
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_six,

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
