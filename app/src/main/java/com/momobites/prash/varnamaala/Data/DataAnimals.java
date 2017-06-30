package com.momobites.prash.varnamaala.Data;

import com.momobites.prash.varnamaala.ModelAdapters.WordModel;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;

/**
 * Created by prash on 6/28/2017.
 */

public class DataAnimals {

    public static ArrayList<WordModel> getAnimals() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "ऊट","कस्तुरी मृग","भालु","भेडा","भैँसी","मुसा", "मृग, हरिण", "लंगुर, ढेडू",
                "लोखर्के","साँढे","स्याल","फयाउरो","सिंह","सुँगुर","हात्ती","कंगारु","कुकुर","खसी",
                "खच्चर","खरायो","गधा","गाई","गैंडा","गोरु","घोडा","कालो बाघ","चितुवा","छुचुन्द्रो",
                "जिराफ","पाटे घोडा","दुम्सी","न्याउरी मुसो","बनेल","बाघ","बाह्र सिगा","बाँदर","बिरालो","ब्वाँसो"


        };
        String[] NepaliConsonants = {
                "unt","kasturi mriga","bhalu","bheda","bhainsi","musa", "mriga, harina", "langura, dhedu",
                "lokharke","sandhe","syala","phayauro","sinh","sungur","hatti","kangaru","kukur","khasi",
                "khaccara","kharayo","gadha","gai","gainda","goru","ghoda","kalo bagh","chituwa","chucundro",
                "jiraph","pate ghoda","dumsi","nyauri muso","banel","bagh","bahra singa","bandar","biralo","bwanso"

        };
        String[] EnglishConsonants = {
                "Camel","Musk Deer","Bear","Sheep","Buffalo","Mouse", "Deer", "Ape",
                "Squirrel","Bull","Jackal","Fox","Lion","Pig","Elephant","Kangaroo","Dog","Goat",
                "Mule","Rabbit","Donkey","Cow","Rhinoceros","Ox","Horse","Panther","Chetaah","Mole",
                "Giraffe","Zebra","Porcupine","Mongoose","Wild Boar","Tiger","Stag","Monkey","Cat","Hyena"

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

        };


        int Image [] = {
                R.drawable.animal_camel,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,

                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,

                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,

                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,

                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,



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

    public static ArrayList<WordModel> getBirds() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "कठफोरा", "काग", "कालो कौवा", "कुखुरा", "कोइली", "गरुड", "गिद्ध", "र्गौथली", "चमेरो", "चिल",
                "जुरेली", "ढुक्कुर", "तित्रा", "धोबी चरा", "परेवा", "बर्टाई", "बाज", "भङ्गेरा", "भारद्धाज चरा", "मुजुर",
                "लाटोकोसेरो", "राजहाँस", "सारस", "सुगा", "हाँस", "डाँफे"
        };
        String[] NepaliConsonants = {
                "kathaphora", "kag", "kalo kauva", "kukhura", "koili", "garud", "giddha", "gauthali", "chamero", "chiel",
                "jureli", "dhukkur", "titra", "dhobi chara", "pareva", "battai", "baaj", "bhangera", "bharad’dhaja cara", "mujur",
                "latokosero", "rajahans", "saras", "suga", "hans", "danfe"

        };
        String[] EnglishConsonants = {
                "woodpecker", "crow", "raven", "hen", "cuckoo", "eagle", "vulture", "swallow", "bat", "kite",
                "nightingale", "dove", "partige", "magpie", "pigeon", "quail", "hawk", "sparrow", "lark", "peacock",
                "owl", "swan", "crane", "parrot", "duck", "lophophorus"


        };


        int Audio[] = {

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six,
                R.raw.number_seven,
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
                R.raw.number_five,
                R.raw.number_six,
                R.raw.number_seven,

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
                R.raw.number_four,
                R.raw.number_five,
                R.raw.number_six

        };


        int Image [] = {
                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_six,
                R.drawable.number_seven,
                R.drawable.number_five,
                R.drawable.number_six,
                R.drawable.number_seven,


                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_six,
                R.drawable.number_seven,
                R.drawable.number_five,
                R.drawable.number_six,
                R.drawable.number_seven,

                R.drawable.number_one,
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

    public static ArrayList<WordModel> getFish() {

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

    public static ArrayList<WordModel> getReptiles() {

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

}
