package com.momobites.prash.varnamaala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.momobites.prash.varnamaala.CategoryOne.Consonants;
import com.momobites.prash.varnamaala.CategoryOne.Notations;
import com.momobites.prash.varnamaala.CategoryOne.Numbers;
import com.momobites.prash.varnamaala.CategoryOne.Vowels;
import com.momobites.prash.varnamaala.ModelAdapters.MenuAdapter;
import com.momobites.prash.varnamaala.ModelAdapters.MenuModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    MenuAdapter adapter;
    View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        adapter = new MenuAdapter(this, MenuData.getMenu());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Vertical Orientation By Default


    }

    private static class MenuData {

        public static ArrayList<MenuModel> getMenu() {

            ArrayList<MenuModel> data = new ArrayList<>();


            String[] DevConsonants = { "व्यन्जन वर्ण", "स्वर वर्ण", "अंक १-२०", "अंक नोटेसन", "CatOneActivity"
            };

            String[] NepaliConsonants = { "byanjan barna", "swor barna", "anka ek - beis", "anka notation", "Fragment Test"
            };

            String[] EnglishConsonants = { "Consonants", "Vowels", "Numbers 1 to 20", "Number Notation", "Fragment Tezt"
            };

            Class[] Class = { Consonants.class, Vowels.class, Numbers.class, Notations.class, CatOneActivity.class
            };


            for (int i = 0; i < DevConsonants.length; i++) {
                data.add(new MenuModel(
                                DevConsonants[i],
                                NepaliConsonants[i],
                                EnglishConsonants[i],
                                Class[i]

                        )
                );
            }

            return data;
        }
    }

}

