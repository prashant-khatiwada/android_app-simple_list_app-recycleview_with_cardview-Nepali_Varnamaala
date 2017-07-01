package com.momobites.prash.varnamaala.Drawing;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.momobites.prash.varnamaala.ModelAdapters.DrawAdapter;
import com.momobites.prash.varnamaala.ModelAdapters.LetterModel;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;

public class DrawBoardTopFragment extends Fragment {

    public DrawBoardTopFragment(){
        // Required Empty public Constructor
    }


    RecyclerView recyclerView;
    Context context;
    DrawAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate layout for this Fragment
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        // Fix the RecycleView to the inflated Fragment
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycleView);
        // Setting Up Data - fill data
        adapter = new DrawAdapter(getContext(), Data.getData());
        // Set Adapter
        recyclerView.setAdapter(adapter);
        // Set Layout Manager

        // Vertical Orientation By Default
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity()); // (Context context)
        //GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),1);
        //StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        // Return
        return rootView;

    }



    @Override
    public void onStop() {
        super.onStop();
    }

    private static class Data {

        public static ArrayList<LetterModel> getData() {

            ArrayList<LetterModel> data = new ArrayList<>();

            String[] DevConsonants = {
                    "अ", "आ", "इ", "ई",
                    "उ", "ऊ", "ए", "ऐ",
                    "अाे", "अाै", "अं", "अ:"
            };
            String[] NepaliConsonants = {
                    "a", "aa", "i", "ee",
                    "u", "oo", "ae", "aie",
                    "ao", "aou", "am", "ah"
            };
            String[] EnglishConsonants = {
                    "a", "aa", "i", "ee",
                    "u", "oo", "ae", "aie",
                    "ao", "aou", "am", "ah"
            };

            String[] Aspiration = {
                    "Guttural", "Guttural", "Palatal", "Palatal",
                    "Labials", "Labials", "Palatoguttural", "Palatoguttural",
                    "Labioguttural", "Labioguttural", " anusvāra", "visarga"
            };

            String[] Name = {
                    "a kāra", "aa kāra", " i kāra", "ee kāra",
                    "u kāra", "oo kāra", "ae kāra", "aie kāra",
                    "ao kāra", "aou kāra", "am kāra", "aha kāra"

            };

            String[] Pronunciation = {
                    "low back", "low back", "front high", "front high",
                    "back high", "back high", "mid front", "dipthong (a+i)",
                    "mid back", "dipthong(a+u / a+w)", "low back(nasal)", "low back(lengthened)"

            };

            String[] approximatePronunciation = {
                    "a", "aa", "i", "ee",
                    "u", "oo", "ae", "aie",
                    "ao", "aou", "am", "ah"

            };


            String [] [] DevCompounds = {
                    {"क", "ख", "ग", "घ", "ङ","च", "छ", "ज", "झ", "ञ",
                            "ट", "ठ", "ड", "ढ", "ण", "त", "थ", "द", "ध", "न",
                            "प", "फ", "ब", "भ", "म", "य", "र", "ल", "व", "स",
                            "ष", "श", "ह", "क्ष", "त्र", "ज्ञ"},
                    {"का", "खा", "गा", "घा", "ङा","चा", "छा", "जा", "झा", "ञा",
                            "टा", "ठा", "डा", "ढा", "णा", "ता", "था", "दा", "धा", "ना",
                            "पा", "फा", "बा", "भा", "मा", "या", "रा", "ला", "वा", "सा",
                            "षा", "शा", "हा", "क्षा", "त्रा", "ज्ञा"},
                    {"कि", "खि", "गि", "घि", "ङि","चि", "छि", "जि", "झि", "ञि",
                            "टि", "ठि", "डि", "ढि", "णि", "ति", "थि", "दि", "धि", "नि",
                            "पि", "फि", "बि", "भि", "मि", "यि", "रि", "लि", "वि", "सि",
                            "षि", "शि", "हि", "क्षि", "त्रि", "ज्ञि"},
                    {"की", "खी", "गी", "घी", "ङी","ची", "छी", "जी", "झी", "ञी",
                            "टी", "ठी", "डी", "ढी", "णी", "ती", "थी", "दी", "धी", "नी",
                            "पी", "फी", "बी", "भी", "मी", "यी", "री", "ली", "वी", "सी",
                            "षी", "शी", "ही", "क्षी", "त्री", "ज्ञी"},
                    {"कु", "खु", "गु", "घु", "ङु","चु", "छु", "जु", "झु", "ञु",
                            "टु", "ठु", "डु", "ढु", "णु", "तु", "थु", "दु", "धु", "नु",
                            "पु", "फु", "बु", "भु", "मु", "यु", "रु", "लु", "वु", "सु",
                            "षु", "शु", "हु", "क्षु", "त्रु", "ज्ञु"},
                    {"कू", "खू", "गू", "घू", "ङू","चू", "छू", "जू", "झू", "ञू",
                            "टू", "ठू", "डू", "ढू", "णू", "तू", "थू", "दू", "धू", "नू",
                            "पू", "फू", "बू", "भू", "मू", "यू", "रू", "लू", "वू", "सू",
                            "षू", "शू", "हू", "क्षू", "त्रू", "ज्ञू"},
                    {"के", "खे", "गे", "घे", "ङे","चे", "छे", "जे", "झे", "ञे",
                            "टे", "ठे", "डे", "ढे", "णे", "ते", "थे", "दे", "धे", "ने",
                            "पे", "फे", "बे", "भे", "मे", "ये", "रे", "ले", "वे", "से",
                            "षे", "शे", "हे", "क्षे", "त्रे", "ज्ञे"},
                    {"कै", "खै", "गै", "घै", "ङै","चै", "छै", "जै", "झै", "ञै",
                            "टै", "ठै", "डै", "ढै", "णै", "तै", "थै", "दै", "धै", "नै",
                            "पै", "फै", "बै", "भै", "मै", "यै", "रै", "लै", "वै", "सै",
                            "षै", "शै", "है", "क्षै", "त्रै", "ज्ञै"},
                    {"काे", "खाे", "गाे", "घाे", "ङाे","चाे", "छाे", "जाे", "झाे", "ञाे",
                            "टाे", "ठाे", "डाे", "ढाे", "णाे", "ताे", "थाे", "दाे", "धाे", "नाे",
                            "पाे", "फाे", "बाे", "भाे", "माे", "याे", "राे", "लाे", "वाे", "साे",
                            "षाे", "शाे", "हाे", "क्षाे", "त्राे", "ज्ञाे"},
                    {"काै", "खाै", "गाै", "घाै", "ङाै","चाै", "छाै", "जाै", "झाै", "ञाै",
                            "टाै", "ठाै", "डाै", "ढाै", "णाै", "ताै", "थाै", "दाै", "धाै", "नाै",
                            "पाै", "फाै", "बाै", "भाै", "माै", "याै", "राै", "लाै", "वाै", "साै",
                            "षाै", "शाै", "हाै", "क्षाै", "त्राै", "ज्ञाै"},
                    {"कं", "खं", "गं", "घं", "ङं","चं", "छं", "जं", "झं", "ञं",
                            "टं", "ठं", "डं", "ढं", "णं", "तं", "थं", "दं", "धं", "नं",
                            "पं", "फं", "बं", "भं", "मं", "यं", "रं", "लं", "वं", "सं",
                            "षं", "शं", "हं", "क्षं", "त्रं", "ज्ञं"},
                    {"कः", "खः", "गः", "घः", "ङः","चः", "छः", "जः", "झः", "ञः",
                            "टः", "ठः", "डः", "ढः", "णः", "तः", "थः", "दः", "धः", "नः",
                            "पः", "फः", "बः", "भः", "मः", "यः", "रः", "लः", "वः", "सः",
                            "षः", "शः", "हः", "क्षः", "त्रः", "ज्ञः"},



            };

            String [] [] NepCompounds = {
                    {"ka", "kha", "ga", "gha", "nga", "cha", "chha", "ja", "jha", "yna",
                            "ta", "tha", "da", "dha", "na", "ta", "tha", "da", "dha", "na",
                            "pa", "pha", "ba", "bha", "ma", "ya", "ra", "la", "wa", "sa",
                            "khha", "sha", "ha", "chya", "tra", "gya"},
                    {"kaa", "khaa", "gaa", "ghaa", "ngaa", "chaa", "chhaa", "jaa", "jhaa", "ynaa",
                            "taa", "thaa", "daa", "dhaa", "naa", "taa", "thaa", "daa", "dhaa", "naa",
                            "paa", "phaa", "baa", "bhaa", "maa", "yaa", "raa", "laa", "waa", "saa",
                            "khhaa", "shaa", "haa", "chyaa", "traa", "gyaa"},
                    {"ki", "khi", "gi", "ghi", "ngi", "chi", "chhi", "ji", "jhi", "yni",
                            "ti", "thi", "di", "dhi", "ni", "ti", "thi", "di", "dhi", "ni",
                            "pi", "phi", "bi", "bhi", "mi", "yi", "ri", "li", "wi", "si",
                            "khhi", "shi", "hi", "chyi", "tri", "gyi"},
                    {"kee", "khee", "gee", "ghee", "ngee", "chee", "chhee", "jee", "jhee", "ynee",
                            "tee", "thee", "dee", "dhee", "nee", "tee", "thee", "dee", "dhee", "nee",
                            "pee", "phee", "bee", "bhee", "mee", "yee", "ree", "lee", "wee", "see",
                            "khhee", "shee", "hee", "chyee", "tree", "gyee"},
                    {"ku", "khu", "gu", "ghu", "ngu", "chu", "chhu", "ju", "jhu", "ynu",
                            "tu", "thu", "du", "dhu", "nu", "tu", "thu", "du", "dhu", "nu",
                            "pu", "phu", "bu", "bhu", "mu", "yu", "ru", "lu", "wu", "su",
                            "khhu", "shu", "hu", "chyu", "tru", "gyu"},
                    {"koo", "khoo", "goo", "ghoo", "ngoo", "choo", "chhoo", "joo", "jhoo", "ynoo",
                            "too", "thoo", "doo", "dhoo", "noo", "too", "thoo", "doo", "dhoo", "noo",
                            "poo", "phoo", "boo", "bhoo", "moo", "yoo", "roo", "loo", "woo", "soo",
                            "khhoo", "shoo", "hoo", "chyoo", "troo", "gyoo"},
                    {"kae", "khae", "gae", "ghae", "ngae", "chae", "chhae", "jae", "jhae", "ynae",
                            "tae", "thae", "dae", "dhae", "nae", "tae", "thae", "dae", "dhae", "nae",
                            "pae", "phae", "bae", "bhae", "mae", "yae", "rae", "lae", "wae", "sae",
                            "khhae", "shae", "hae", "chyae", "trae", "gyae"},
                    {"kaei", "khaei", "gaei", "ghaei", "ngaei", "chaei", "chhaei", "jaei", "jhaei", "ynaei",
                            "taei", "thaei", "daei", "dhaei", "naei", "taei", "thaei", "daei", "dhaei", "naei",
                            "paei", "phaei", "baei", "bhaei", "maei", "yaei", "raei", "laei", "waei", "saei",
                            "khhaei", "shaei", "haei", "chyaei", "traei", "gyaei"},
                    {"ko", "kho", "go", "gho", "ngo", "cho", "chho", "jo", "jho", "yno",
                            "to", "tho", "do", "dho", "no", "to", "tho", "do", "dho", "no",
                            "po", "pho", "bo", "bho", "mo", "yo", "ro", "lo", "wo", "so",
                            "khho", "sho", "ho", "chyo", "tro", "gyo"},
                    {"kou", "khou", "gou", "ghou", "ngou", "chou", "chhou", "jou", "jhou", "ynou",
                            "tou", "thou", "dou", "dhou", "nou", "tou", "thou", "dou", "dhou", "nou",
                            "pou", "phou", "bou", "bhou", "mou", "you", "rou", "lou", "wou", "sou",
                            "khhou", "shou", "hou", "chyou", "trou", "gyou"},
                    {"kam", "kham", "gam", "gham", "ngam", "cham", "chham", "jam", "jham", "ynam",
                            "tam", "tham", "dam", "dham", "nam", "tam", "tham", "dam", "dham", "nam",
                            "pam", "pham", "bam", "bham", "mam", "yam", "ram", "lam", "wam", "sam",
                            "khham", "sham", "ham", "chyam", "tram", "gyam"},
                    {"kah", "khah", "gah", "ghah", "ngah", "chah", "chhah", "jah", "jhah", "ynah",
                            "tah", "thah", "dah", "dhah", "nah", "tah", "thah", "dah", "dhah", "nah",
                            "pah", "phah", "bah", "bhah", "mah", "yah", "rah", "lah", "wah", "sah",
                            "khhah", "shah", "hah", "chyah", "trah", "gyah"},
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



            };


            for (int i = 0; i < DevConsonants.length; i++) {
                data.add(new LetterModel(
                                DevConsonants[i] ,
                                NepaliConsonants[i],
                                EnglishConsonants[i],
                                DevCompounds[i],
                                NepCompounds[i],
                                Audio[i],
                                Aspiration[i],
                                Name[i],
                                Pronunciation[i],
                                approximatePronunciation[i]


                        )
                );
            }

            return data;
        }
    }
}
