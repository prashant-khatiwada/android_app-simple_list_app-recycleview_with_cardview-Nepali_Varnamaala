package com.momobites.prash.varnamaala.Category03Place;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.momobites.prash.varnamaala.Category04Four.*;
import com.momobites.prash.varnamaala.Category04Four.General;
import com.momobites.prash.varnamaala.Category06Six.DailyFood;
import com.momobites.prash.varnamaala.Category06Six.Drinks;
import com.momobites.prash.varnamaala.Category06Six.FruitAndNuts;
import com.momobites.prash.varnamaala.Category06Six.VegetablesAndSpices;
import com.momobites.prash.varnamaala.ModelAdapters.MenuAdapter;
import com.momobites.prash.varnamaala.R;

/**
 * Created by prash on 7/1/2017.
 */

public class CatThreeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MenuAdapter adapter;
    View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity
        setContentView(R.layout.activity_fragments);
        // Find and then Set Viewpager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        // Create Adapter for fragments
        CatThreeActivity.PageAdapter pageAdapter = new CatThreeActivity.PageAdapter(getSupportFragmentManager(), CatThreeActivity.this);
        // Set in the adapter
        viewPager.setAdapter(pageAdapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        // Connect the tab layout with the view pager. This will
        tabLayout.setupWithViewPager(viewPager);

    }




    class PageAdapter extends FragmentPagerAdapter {




        private Context mContext;

        public PageAdapter(FragmentManager fm, CatThreeActivity context) {
            super(fm);
            mContext = context;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new General();
                case 1:
                    return new Cities();
                case 2:
                    return new States();
                case 3:
                    return new Countries();

            }

            return null;
        }

        // Set Tab Titles and the Number of Tabs
        String tabTitles[] = new String[]{
                "General",
                "Cities",
                "States",
                "Countries"
        };

        @Override
        public int getCount() {
            return tabTitles.length;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }

    }




}
