package com.momobites.prash.varnamaala;

import java.util.ArrayList;

/**
 * Created by prash on 6/22/2017.
 */

public class Data {
    public static ArrayList<Model> getConsonants() {

        ArrayList<Model> data = new ArrayList<>();

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
                "k", "kh", "g" , "gh", "ng",
                "ch", "chh", "j", "jh", "yn",
                "t", "tth", "d", "dh", "an",
                "t", "th", "dh", "dhh", "n",
                "p", "ph", "b", "bh", "m",
                "y", "r", "l", "w", "s",
                "khh", "sh", "h", "chy", "tr",
                "gy"

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
                R.raw.number_one,
                R.raw.number_one,
        };


        for (int i = 0; i < DevConsonants.length; i++) {
            data.add(new Model(
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
