package com.example.T4tip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.T4tip.layoutActivity.Mainpage;

public class add_product extends AppCompatActivity {

    private Spinner deprt_spin , level_spin, brand_spin;
    private ArrayAdapter<CharSequence> deprt_adapt,level_adapt,brand_adapt;
    private ImageView arrow_img;
    private Button addproduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product);

        deprt_spin = (Spinner)findViewById(R.id.department);
        deprt_adapt = ArrayAdapter.createFromResource(this,R.array.department_values,R.layout.spinner);
        deprt_spin.setAdapter(deprt_adapt);

        level_spin = (Spinner)findViewById(R.id.level);
        level_adapt = ArrayAdapter.createFromResource(this,R.array.level_values,R.layout.spinner);
        level_spin.setAdapter(level_adapt);

        brand_spin = (Spinner)findViewById(R.id.brand);
        brand_adapt = ArrayAdapter.createFromResource(this,R.array.brand_values,R.layout.spinner);
        brand_spin.setAdapter(brand_adapt);

        arrow_img = (ImageView)findViewById(R.id.button_img);
        arrow_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(add_product.this, Mainpage.class);
                startActivity(intent);
            }
        });

        addproduct =findViewById(R.id.addproductBTN);
        addproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
