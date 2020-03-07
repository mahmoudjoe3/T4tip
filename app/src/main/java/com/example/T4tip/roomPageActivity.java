package com.example.T4tip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

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
