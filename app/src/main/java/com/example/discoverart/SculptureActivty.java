package com.example.discoverart;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
public class SculptureActivty extends AppCompatActivity {
    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sculpture_activity);

        viewPager2 = findViewById(R.id.viewpager);

        int[] images = {R.drawable.venus,R.drawable.statueofliberty,R.drawable.thethinkerr,R.drawable.moai,R.drawable.sfenks};
        String[] heading = {"Venus de Milos","Statue of Liberty","The Thinker","Moai Heykelleri","Sfenks"};
        String[] desc = {getString(R.string.a_sculpture),
                getString(R.string.b_sculpture),
                getString(R.string.c_sculpture),
                getString(R.string.d_sculpture),
                getString(R.string.e_sculpture)};

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
