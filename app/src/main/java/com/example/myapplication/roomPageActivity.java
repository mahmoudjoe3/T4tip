package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class roomPageActivity extends AppCompatActivity {
    int num_of_room,num_of_toilet,num_of_cetchen,num_of_reception;
    String country,area,house;

    ArrayList<String> items;
    house mHouse;
    houseAdapter adapter;
    TextView txt_house;
    RecyclerView container;
    GridLayoutManager gridLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_page);
        init();

        txt_house.setText(mHouse.houseKind);
        fillItemArrayWith(mHouse.num_of_room,"غرفه");
        fillItemArrayWith(mHouse.num_of_toilet,"حمام");
        fillItemArrayWith(mHouse.num_of_cetchen,"مطبخ");
        fillItemArrayWith(mHouse.num_of_reception,"ريسيبشن");

        container.setLayoutManager(gridLayoutManager);
        container.setAdapter(adapter);
    }

    private void fillItemArrayWith(int N,String value) {
        for (int i=0;i<N;i++)
        {
            items.add(value+" "+(i+1));
        }
    }

    private void init() {
        txt_house=findViewById(R.id.house);
        container=findViewById(R.id.container);


        items=new ArrayList<>();
        adapter=new houseAdapter(this,items);
        gridLayoutManager= new GridLayoutManager(this,2);
        mHouse=(house) getIntent().getSerializableExtra("the house");
    }


}
