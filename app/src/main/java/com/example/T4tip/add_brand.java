package com.example.T4tip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class add_brand extends AppCompatActivity {

    private Spinner deprt_spin;
    private ArrayAdapter<CharSequence> deprt_adapt;
    private ImageView arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_brand);

        deprt_spin = (Spinner)findViewById(R.id.spinner);
        deprt_adapt = ArrayAdapter.createFromResource(this,R.array.department_values,R.layout.spinner);
        deprt_spin.setAdapter(deprt_adapt);

        arrow = (ImageView)findViewById(R.id.arrow_btn);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activ2 = new Intent(add_brand.this, add_product.class);
                startActivity(activ2);

            }
        });

    }
}
