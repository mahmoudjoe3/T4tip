package com.example.T4tip.ui.activities;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.T4tip.R;
import com.example.T4tip.externalClass.ZoomOutPageTransformer;
import com.example.T4tip.externalClass.TapAdapter;
import com.google.android.material.tabs.TabLayout;

public class Mainpage extends AppCompatActivity implements TabLayout.BaseOnTabSelectedListener{

    TextView roomTitle;
    EditText length,height,width;

    TabLayout tabLayout;
    ViewPager viewPager;
    TapAdapter TapAdapter;
    String roomKind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_main);
        findViewProcess();
        roomKind=getIntent().getStringExtra("roomKind");
        roomTitle.setText(roomKind);

        viewBasedOn_roomKind(roomKind.split(" ")[0]);

        TapAdapter =new TapAdapter(getSupportFragmentManager(),tabLayout.getTabCount(),roomKind); //send it to pageadapter like مطبخ 1
        viewPager.setPageTransformer(true,new ZoomOutPageTransformer());
        viewPager.setAdapter(TapAdapter);

        tabLayout.addOnTabSelectedListener(this);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    private void viewBasedOn_roomKind(String roomkind) {

        if(roomkind.equals("غرفه")||roomkind.equals("ريسيبشن"))
        {
            //no spaka
            if(tabLayout.getTabCount()==6) {
                tabLayout.removeTabAt(0);
            }
        }
        else if(roomkind.equals("حمام")||roomkind.equals("مطبخ"))
        {
            if(tabLayout.getTabCount()==5) {
                TabLayout.Tab tab = tabLayout.newTab().setText("السباكه");
                tabLayout.addTab(tab);
            }
        }

    }

    private void findViewProcess() {
        roomTitle=findViewById(R.id.roomTitle);

        length=findViewById(R.id.txtLength);
        height=findViewById(R.id.txtHeight);
        width=findViewById(R.id.txtWidth);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.TabsContainer);


    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        int pos=tab.getPosition();
        viewPager.setCurrentItem(pos);
//        if(pos==0) {
//            roomTitle.setText("الغرفه");
//        }
//        if(pos==1) {
//            roomTitle.setText("السباكه");
//        }
//        else if(pos==2) {
//            roomTitle.setText("الغرفه");
//        }
//        else if(pos==3) {
//            roomTitle.setText("الغرفه");
//        }
//        else if(pos==4) {
//            roomTitle.setText("الغرفه");
//        }
//        else if(pos==5) {
//            roomTitle.setText("الغرفه");

//        }

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }


}
