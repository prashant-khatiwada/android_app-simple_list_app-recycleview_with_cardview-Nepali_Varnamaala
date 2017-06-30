package com.momobites.prash.varnamaala.Data;

import com.momobites.prash.varnamaala.ModelAdapters.LetterModel;
import com.momobites.prash.varnamaala.ModelAdapters.WordModel;
import com.momobites.prash.varnamaala.R;

import java.util.ArrayList;

public class DataLetters {
    public static ArrayList<LetterModel> getConsonants() {

        ArrayList<LetterModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "क", "ख", "ग", "घ", "ङ",
                "च", "छ", "ज", "झ", "ञ",
                "ट", "ठ", "ड", "ढ", "ण",
                "त", "थ", "द", "ध", "न",
                "प", "फ", "ब", "भ", "म",
                "य", "र", "ल", "व", "स",
                "ष", "श", "ह", "क्ष", "त्र",
                "ज्ञ"
        };
        String[] NepaliConsonants = {
                "ka", "kha", "ga", "gha", "nga",
                "cha", "chha", "ja", "jha", "yna",
                "ta", "tha", "da", "dha", "na",
                "ta", "tha", "da", "dha", "na",
                "pa", "pha", "ba", "bha", "ma",
                "ya", "ra", "la", "wa", "sa",
                "khha", "sha", "ha", "chya", "tra",
                "gya"
        };
        String[] EnglishConsonants = {
                "/ka", "/kh/a", "/ga" , "gh/a", "ng/a",
                "ch/a", "chh/a", "j/a", "jh/a", "yn/a",
                "ta", "tt/ha", "da", "dha", "an/a",
                "ta", "tha", "dh/a", "dhh/a", "na",
                "pa", "ph/a", "ba", "bh/a", "ma",
                "ya", "ra", "la", "wa", "sa",
                "khha", "sha", "ha", "chya", "tra",
                "gya"
        };

        String[] Aspiration = {
                "Velars", "Velars", "Velars", "Velars", "Velars",
                "Palatals", "Palatals", "Palatals", "Palatals", "Palatals",
                "Retroflex", "Retroflex", "Retroflex", "Retroflex", "Retroflex",
                "Dentals", "Dentals", "Dentals", "Dentals", "Dentals",
                "Labials", "Labials", "Labials", "Labials", "Labials",
                "Semi-Vowels", "Semi-Vowels", "Semi-Vowels", "Semi-Vowels", "Spirants",
                "Spirants", "Spirants", "Spirants", "Diacritics", "Diacritics",
                "Diacritics"
        };

        String[] Name = {
                "kakāra", "khakāra", "gakāra", "ghakāra", "ṅakāra",
                "cakāra", "chakāra", "jakāra", "jhakāra", "ṅakāra",
                "takāra", "thakāra", "dakāra", "dhakāra", "nakāra",
                "takāra", "thakāra", "dakāra", "dhakāra", "nakāra",
                "pakāra", "phakāra", "bakāra", "bhakāra", "makāra",
                "yakāra", "repha", "lakāra", "vakāra",
                "sakāra", "sakāra", "shakāra", "hakāra",
                "ks", "jṅ",
                "visarga"

        };

        String[] Pronunciation = {
                "unaspirated voiceless velar stop", "aspirated voiceless velar stop", "unaspirated voiced velar stop" , "aspirated voiced velar stop", "velar nasal",
                "unaspirated voiceless palatal stop", "aspirated voiceless palatal stop", "unaspirated voiced palatal stop" , "aspirated voiced palatal stop", "palatal nasal",
                "anaspirated voiceless retroflex stop", "aspirated voiceless retroflex stop", "anaspirated voiced retroflex stop", "aspirated voiced retroflex stop", "retroflex nasal",
                "anaspirated voiceless dental stop", "aspirated voiceless dental stop", "anaspirated voiced dental stop", "aspirated voiced dental stop", "dental nasal",
                "anaspirated voiceless bilabial stop", "aspirated voiceless bilabial stop", "anaspirated voiced bilabial stop", "aspirated voiced bilabial stop", "bilabial nasal",
                "palatal glide", "alveolar liquid", "alveolar liquid", "velar glide", "palatal fricative",
                "palatal retroflex", "dental fricative", "glottal fricative",
                "complex segment (k+s+y)", "complex segment (t+r)", "complex segment (g+y)"

        };

        String[] approximatePronunciation = {
                "Kite, Kitty", "Khakis, Khukuri", "Goat, God" , "Ghee, Ghost, Ghetto ", "N/A",
                "Chutzpa, Chicken, Cheap", "N/A", "Jealous, Javelin, Jasmin", "N/A", "N/A",
                "Top, Timid", "Thwart, Thatch", "Dazzle, Denmark", "Adhere", "Own",
                "Little", "Thicker, Thrifty", "Then", "And He", "No",
                "Li/p", "U/ph/ill", "Ba/by", "A/bh/or", "Man, Menu",
                "Yard, Yellow", "Rare, Ring", "Lily", "We, Wand", "shy (palatalized)",
                "shy (retroflexed)", "Sand", "Hat, Human", "N/A", "Trinket",
                "N/A jṅ"

        };


        String [] [] DevCompounds = {
                {"क", "का", "कि", "की", "कु", "कू", "के", "कै", "काे", "काै", "कं", "क:" },
                {"ख", "खा", "खि", "खी", "खु", "खू", "खे", "खै", "खाे", "खाै", "खं", "ख:" },
                {"ग", "गा", "गि", "गी", "गु", "गू", "गे", "गै", "गाे", "गाै", "गं", "ग:" },
                {"घ", "घा", "घि", "घी", "घु", "घू", "घे", "घै", "घाे", "घाै", "घं", "घ:" },
                {"ङ", "ङा", "ङि", "ङी", "ङु", "ङू", "ङे", "ङै", "ङाे", "ङाै", "ङं", "ङ:" },

                {"च", "चा", "चि", "ची", "चु", "चू", "चे", "चै", "चाे", "चाै", "चं", "च:" },
                {"छ", "छा", "छि", "छी", "छु", "छू", "छे", "छै", "छाे", "छाै", "छं", "छ:" },
                {"ज", "जा", "जि", "जी", "जु", "जू", "जे", "जै", "जाे", "जाै", "जं", "ज:" },
                {"झ", "झा", "झि", "झी", "झु", "झू", "झे", "झै", "झाे", "झाै", "झं", "झ:" },
                {"ञ", "ञा", "ञि", "ञी", "ञु", "ञू", "ञे", "ञै", "ञाे", "ञाै", "ञं", "ञ:" },

                {"ट", "टा", "टि", "टी", "टु", "टू", "टे", "टै", "टाे", "टाै", "टं", "ट:" },
                {"ठ", "ठा", "ठि", "ठी", "ठु", "ठू", "ठे", "ठै", "ठाे", "ठाै", "ठं", "ठ:" },
                {"ड", "डा", "डि", "डी", "डु", "डू", "डे", "डै", "डाे", "डाै", "डं", "ड:" },
                {"ढ", "ढा", "ढि", "ढी", "ढु", "ढू", "ढे", "ढै", "ढाे", "ढाै", "ढं", "ढ:" },
                {"ण", "णा", "णि", "णी", "णु", "णू", "णे", "णै", "णाे", "णाै", "णं", "ण:" },

                {"त", "ता", "ति", "ती", "तु", "तू", "ते", "तै", "ताे", "ताै", "तं", "त:" },
                {"थ", "था", "थि", "थी", "थु", "थू", "थे", "थै", "थाे", "थाै", "थं", "थ:" },
                {"द", "दा", "दि", "दी", "दु", "दू", "दे", "दै", "दाे", "दाै", "दं", "द:" },
                {"ध", "धा", "धि", "धी", "धु", "धू", "धे", "धै", "धाे", "धाै", "धं", "ध:" },
                {"न", "ना", "नि", "नी", "नु", "नू", "ने", "नै", "नाे", "नाै", "नं", "न:" },

                {"प", "पा", "पि", "पी", "पु", "पू", "पे", "पै", "पाे", "पाै", "पं", "प:" },
                {"फ", "फा", "फि", "फी", "फु", "फू", "फे", "फै", "फाे", "फाै", "फं", "फ:" },
                {"ब", "बा", "बि", "बी", "बु", "बू", "बे", "बै", "बाे", "बाै", "बं", "ब:" },
                {"भ", "भा", "भि", "भी", "भु", "भू", "भे", "भै", "भाे", "भाै", "भं", "भ:" },
                {"म", "मा", "मि", "मी", "मु", "मू", "मे", "मै", "माे", "माै", "मं", "म:" },

                {"य", "या", "यि", "यी", "यु", "यू", "ये", "यै", "याे", "याै", "यं", "य:" },
                {"र", "रा", "रि", "री", "रु", "रू", "रे", "रै", "राे", "राै", "रं", "र:" },
                {"ल", "ला", "लि", "ली", "लु", "लू", "ले", "लै", "लाे", "लाै", "लं", "ल:" },
                {"व", "वा", "वि", "वी", "वु", "वू", "वे", "वै", "वाे", "वाै", "वं", "व:" },
                {"स", "सा", "सि", "सी", "सु", "सू", "से", "सै", "साे", "साै", "सं", "स:" },
                {"ष", "षा", "षि", "षी", "षु", "षू", "षे", "षै", "षाे", "षाै", "षं", "ष:" },
                {"श", "शा", "शि", "शी", "शु", "शू", "शे", "शै", "शाे", "शाै", "शं", "श:" },
                {"ह", "हा", "हि", "ही", "हु", "हू", "हे", "है", "हाे", "हाै", "हं", "ह:" },

                {"क्ष", "क्षा", "क्षि", "क्षी", "क्षु", "क्षू", "क्षे", "क्षै", "क्षाे", "क्षाै", "क्षं", "क्ष:" },
                {"त्र", "त्रा", "त्रि", "त्री", "त्रु", "त्रू", "त्रे", "त्रै", "त्राे", "त्राै", "त्रं", "त्र:" },
                {"ज्", "ज्ा", "ज्ि", "ज्ी", "ज्ु", "ज्ू", "ज्े", "ज्ै", "ज्ाे", "ज्ाै", "ज्ं", "ज्:" },

        };
        
        String [] [] NepCompounds = {
                {"ka", "kaa", "ki", "kee", "ku", "koo", "ke", "kei", "ko", "kou", "kam", "kah"  },
                {"kha", "khaa", "khi", "khee", "khu", "khoo", "khe", "khei", "kho", "khou", "kham", "khah"  },
                {"ga", "gaa", "gi", "gee", "gu", "goo", "ge", "gei", "go", "gou", "gam", "gah"  },
                {"gha", "ghaa", "ghi", "ghee", "ghu", "ghoo", "ghe", "ghei", "gho", "ghou", "gham", "ghah"  },
                {"nga", "ngaa", "ngi", "ngee", "ngu", "ngoo", "nge", "ngei", "ngo", "ngou", "ngam", "ngah"  },

                {"cha", "chaa", "chi", "chee", "chu", "choo", "che", "chei", "cho", "chou", "cham", "chah"  },
                {"chha", "chhaa", "chhi", "chhee", "chhu", "chhoo", "chhe", "chhei", "chho", "chhou", "chham", "chhah"  },
                {"ja", "jaa", "ji", "jee", "ju", "joo", "je", "jei", "jo", "jou", "jam", "jah"  },
                {"jha", "jhaa", "jhi", "jhee", "jhu", "jhoo", "jhe", "jhei", "jho", "jhou", "jham", "jhah"  },
                {"yna", "ynaa", "yni", "ynee", "ynu", "ynoo", "yne", "ynei", "yno", "ynou", "ynam", "ynah"  },

                {"ta", "taa", "ti", "tee", "tu", "too", "te", "tei", "to", "tou", "tam", "tah"  },
                {"tha", "thaa", "thi", "thee", "thu", "thoo", "the", "thei", "tho", "thou", "tham", "thah"  },
                {"da", "daa", "di", "dee", "du", "doo", "de", "dei", "do", "dou", "dam", "dah"  },
                {"dha", "dhaa", "dhi", "dhee", "dhu", "dhoo", "dhe", "dhei", "dho", "dhou", "dham", "dhah"  },
                {"naa", "naaa", "nai", "naee", "nau", "naoo", "nae", "naei", "nao", "naou", "naam", "naah"  },

                {"ta", "taa", "ti", "tee", "tu", "too", "te", "tei", "to", "tou", "tam", "tah"  },
                {"tha", "thaa", "thi", "thee", "thu", "thoo", "the", "thei", "tho", "thou", "tham", "thah"  },
                {"da", "daa", "di", "dee", "du", "doo", "de", "dei", "do", "dou", "dam", "dah"  },
                {"dha", "dhaa", "dhi", "dhee", "dhu", "dhoo", "dhe", "dhei", "dho", "dhou", "dham", "dhah"  },
                {"na", "naa", "ni", "nee", "nu", "noo", "ne", "nei", "no", "nou", "nam", "nah"  },

                {"pa", "paa", "pi", "pee", "pu", "poo", "pe", "pei", "po", "pou", "pam", "pah"  },
                {"pha", "phaa", "phi", "phee", "phu", "phoo", "phe", "phei", "pho", "phou", "pham", "phah"  },
                {"ba", "baa", "bi", "bee", "bu", "boo", "be", "bei", "bo", "bou", "bam", "bah"  },
                {"bha", "bhaa", "bhi", "bhee", "bhu", "bhoo", "bhe", "bhei", "bho", "bhou", "bham", "bhah"  },
                {"ma", "maa", "mi", "mee", "mu", "moo", "me", "mei", "mo", "mou", "mam", "mah"  },

                {"ya", "yaa", "yi", "yee", "yu", "yoo", "ye", "yei", "yo", "you", "yam", "yah"  },
                {"ra", "raa", "ri", "ree", "ru", "roo", "re", "rei", "ro", "rou", "ram", "rah"  },
                {"la", "laa", "li", "lee", "lu", "loo", "le", "lei", "lo", "lou", "lam", "lah"  },
                {"wa", "waa", "wi", "wee", "wu", "woo", "we", "wei", "wo", "wou", "wam", "wah"  },
                {"sa", "saa", "si", "see", "su", "soo", "se", "sei", "so", "sou", "sam", "sah"  },
                {"khha", "khhaa", "khhi", "khhee", "khhu", "khhoo", "khhe", "khhei", "khho", "khhou", "khham", "khhah"  },
                {"sha", "shaa", "shi", "shee", "shu", "shoo", "she", "shei", "sho", "shou", "sham", "shah"  },
                {"ha", "haa", "hi", "hee", "hu", "hoo", "he", "hei", "ho", "hou", "ham", "hah"  },

                {"chya", "chyaa", "chyi", "chyee", "chyu", "chyoo", "chye", "chyei", "chyo", "chyou", "chyam", "chyah"  },
                {"tra", "traa", "tri", "tree", "tru", "troo", "tre", "trei", "tro", "trou", "tram", "trah"  },
                {"gya", "gyaa", "gyi", "gyee", "gyu", "gyoo", "gye", "gyei", "gyo", "gyou", "gyam", "gyah"  },
                
        };

        int Audio[] = {

                R.raw.number_one,
                R.raw.number_two,
                R.raw.number_three,
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

    public static ArrayList<LetterModel> getVowels() {

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

    public static ArrayList<WordModel> getNumbers() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "१", "२", "३", "४", "५", "६", "७", "८", "९", "१०",
                "११", "१२", "१३", "१४", "१५", "१६", "१७", "१८", "१९", "२०"
        };
        String[] NepaliConsonants = {
                "ek", "dui", "teen", "chaar", "paanch", "cha", "saat", "aath", "nau", "dus",
                "eghaar", "barha", "terha", "chauda", "pandhra", "sorha", "satra", "athara", "unnais", "bis"
        };
        String[] EnglishConsonants = {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"

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
                R.raw.number_ten



        };


        int Image [] = {
                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_six,
                R.drawable.number_seven,
                R.drawable.number_eight,
                R.drawable.number_nine,
                R.drawable.number_ten,
                R.drawable.number_one,
                R.drawable.number_two,
                R.drawable.number_three,
                R.drawable.number_four,
                R.drawable.number_five,
                R.drawable.number_six,
                R.drawable.number_seven,
                R.drawable.number_eight,
                R.drawable.number_nine,
                R.drawable.number_ten
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

    public static ArrayList<WordModel> getNotations() {

        ArrayList<WordModel> data = new ArrayList<>();

        String[] DevConsonants = {
                "१", "१०", "१००", "१०००", "१०,०००", "१००,०००", "१,००,०००", "१०,००,०००"
        };
        String[] NepaliConsonants = {
                "ek", "das", "saya", "hajar", "das hajar", "lakh", "das lakh", "crore"

        };
        String[] EnglishConsonants = {
                "1", "10", "100", "1000", "10,000", "100,000", "1,00,000", "10,00,000"

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

}
