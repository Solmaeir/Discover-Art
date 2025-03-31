package com.example.discoverart;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class ArchitectureActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.architecture_activty);

        viewPager2 = findViewById(R.id.viewpager);

        int[] images = {R.drawable.edinburg,R.drawable.montsaintmichel,R.drawable.alhambra,R.drawable.carcassonne,R.drawable.edinburg};
        String[] heading = {"Notre Dame Katedrali","Mont Saint-Michel","Alhambra Sarayı","Carcassonne Şehri","Edinburgh Kalesi"};
        String[] desc = {getString(R.string.a_architecture),
                getString(R.string.b_architecture),
                getString(R.string.c_architecture),
                getString(R.string.d_architecture)
                ,getString(R.string.e_architecture)};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i =0; i< images.length ; i++){

            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i],heading[i],desc[i]);
            viewPagerItemArrayList.add(viewPagerItem);

        }

        ViewPagerAdapter vpAdapter = new ViewPagerAdapter(viewPagerItemArrayList,R.layout.architecture_view_pager);

        viewPager2.setAdapter(vpAdapter);

        viewPager2.setClipToPadding(false);

        viewPager2.setClipChildren(false);

        viewPager2.setOffscreenPageLimit(2);

        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

    }
}
