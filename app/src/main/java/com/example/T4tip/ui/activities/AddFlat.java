package com.example.T4tip.ui.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.T4tip.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddFlat extends AppCompatActivity {

    private FloatingActionButton add_realty_bt;
    private String myText;
    private ListView listView;
    private ArrayAdapter<String> realty_adapter;
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_realty);

        init();

        add_realty_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alert_Dialog();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String roomkind = realty_adapter.getItem(i);
                Intent realty_intent =  new Intent(AddFlat.this, FlatDetails.class);
                realty_intent.putExtra("room kind",roomkind);
                startActivity(realty_intent);
            }
        });

    }

    private void Alert_Dialog() {
        final AlertDialog.Builder myDialog = new AlertDialog.Builder(AddFlat.this);

        myDialog.setTitle("أدخل اسم العقار");
        final EditText realty_name = new EditText(AddFlat.this);
        realty_name.setInputType(InputType.TYPE_CLASS_TEXT);
        myDialog.setView(realty_name);
        myDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                myText = realty_name.getText().toString();
                realty_adapter.add(myText);
            }
        });
        myDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        myDialog.show();
        relativeLayout.setVisibility(View.VISIBLE);
    }

    private void init() {
        add_realty_bt = (FloatingActionButton)findViewById(R.id.add_realty_btn);
        add_realty_bt.setRippleColor(getResources().getColor(R.color.colorhover));
        listView = (ListView)findViewById(R.id.realty_list);
        realty_adapter = new ArrayAdapter<String>(AddFlat.this, R.layout.list_layout);
        listView.setAdapter(realty_adapter);
        relativeLayout = (RelativeLayout)findViewById(R.id.line_layout);
        relativeLayout.setVisibility(View.GONE);
    }
}
