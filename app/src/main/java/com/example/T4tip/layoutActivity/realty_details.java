package com.example.T4tip.layoutActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.T4tip.R;
import com.example.T4tip.ExternalClass.house;

public class realty_details extends AppCompatActivity {

private Button submit_house;
private EditText country,area,houseKind,num_of_room,num_of_toilet,num_of_cetchen,num_of_reception;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.realty_detailes);
        init();

        submit_house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(notEmpty()) {
                    house mHouse=new house(
                            country.getText().toString(),
                            area.getText().toString(),
                            houseKind.getText().toString(),
                            Integer.parseInt(num_of_room.getText().toString()),
                            Integer.parseInt(num_of_toilet.getText().toString()),
                            Integer.parseInt(num_of_cetchen.getText().toString()),
                            Integer.parseInt(num_of_reception.getText().toString())
                    );

                    Intent in = new Intent(realty_details.this, roomPageActivity.class);
                    in.putExtra("the house",mHouse);
                    startActivity(in);
                }
                else
                    Toast.makeText(realty_details.this, "missing data to fill", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void init() {
        submit_house = findViewById(R.id.signingbtn);
        country=findViewById(R.id.txt_country);
        area=findViewById(R.id.txt_area);
        houseKind=findViewById(R.id.txt_houseKind);
        num_of_room=findViewById(R.id.txt_num_of_room);
        num_of_toilet=findViewById(R.id.txt_num_of_toilet);
        num_of_cetchen=findViewById(R.id.txt_num_of_cetchin);
        num_of_reception=findViewById(R.id.txt_num_of_reception);
    }
    private boolean notEmpty()
    {
        if(country.getText().toString().equals(""))
            return false;
        if(area.getText().toString().equals(""))
            return false;
        if(houseKind.getText().toString().equals(""))
            return false;
        if(num_of_room.getText().toString().equals(""))
            return false;
        if(num_of_toilet.getText().toString().equals(""))
            return false;
        if(num_of_cetchen.getText().toString().equals(""))
            return false;
        if(num_of_reception.getText().toString().equals(""))
            return false;
        return true;
    }
}
