package com.momobites.prash.varnamaala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.momobites.prash.varnamaala.CategoryOne.CatOneActivity;
import com.momobites.prash.varnamaala.CategoryThree.CatThreeActivity;
import com.momobites.prash.varnamaala.CategoryTwo.CatTwoActivity;
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
        adapter = new MenuAdapter(this, MenuData.getMenu(), R.color.colorAccent);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Vertical Orientation By Default


    }

    private static class MenuData {

        public static ArrayList<MenuModel> getMenu() {

            ArrayList<MenuModel> data = new ArrayList<>();


            String[] DevConsonants = {
                    "वर्ण र अंक",
                    "समय",
                    "स्थान",
                    "सम्बन्ध",
                    "चरा, जनावर, \n     माछा",
                    "फूल र बिरुवा",
                    "खाना र पेय \n    पदार्थ",
                    "रंग",
                    "पहिरन"
            };

            String[] NepaliConsonants = {
                    "barna ra anka",
                    "samaya",
                    "sthaan",
                    "sambandha",
                    "chara, janawar, machha",
                    "phool ra biruwa",
                    "khaana ra peya padartha",
                    "ranga",
                    "pahiran"
            };

            String[] EnglishConsonants = {
                    "Letters and Numbers",
                    "Time",
                    "Place",
                    "People and Relations",
                    "Animals, Birds, Fish",
                    "Flowers and Plant",
                    "Food and Drinks",
                    "Colors",
                    "Clothes"
            };

            Class[] Class = {
                    CatOneActivity.class,
                    CatTwoActivity.class,
                    CatOneActivity.class,
                    CatTwoActivity.class,
                    CatThreeActivity.class,
                    CatOneActivity.class,
                    CatTwoActivity.class,
                    CatThreeActivity.class,
                    CatOneActivity.class
            };

            int [] Image = {
                    R.drawable.menu_icon_letter,
                    R.drawable.menu_icon_time,
                    R.drawable.menu_icon_marker,
                    R.drawable.menu_icon_man,
                    R.drawable.menu_icon_cow,
                    R.drawable.menu_icon_flower,
                    R.drawable.menu_icon_food,
                    R.drawable.menu_icon_color,
                    R.drawable.menu_icon_clothes

            };


            for (int i = 0; i < DevConsonants.length; i++) {
                data.add(new MenuModel(
                                DevConsonants[i],
                                NepaliConsonants[i],
                                EnglishConsonants[i],
                                Class[i],
                                Image[i]

                        )
                );
            }

            return data;
        }
    }

}

