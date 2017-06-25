package com.momobites.prash.varnamaala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.momobites.prash.varnamaala.CategoryOne.CatOneActivity;
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


            String[] DevConsonants = { "वर्ण र अंक"
            };

            String[] NepaliConsonants = { "barna ra anka"
            };

            String[] EnglishConsonants = { "Letters and Numbers"
            };

            Class[] Class = { CatOneActivity.class
            };

            int [] Image = {
                    R.drawable.color_gray

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

