package com.example.myapplication;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;

public class houseAdapter extends RecyclerView.Adapter<houseAdapter.MyHolder>  {


    private Context context;
    private ArrayList<String> items;

    public houseAdapter(Context context, ArrayList<String> items) {
        this.context = context;

        this.items = items;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_temp, parent, false);
        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }
    String itemName,temp;
    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {
        itemName=items.get(position);
        holder.text.setText(itemName);
        temp=itemName.split(" ")[0];
        attachImageByItemName(holder,temp);

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(context, Mainpage.class);
                in.putExtra("roomKind",items.get(position));
                context.startActivity(in);
            }
        });
    }

    private void attachImageByItemName(MyHolder holder, String itemName) {
        if(itemName.equals("غرفه")) {
            holder.image.setImageResource(R.drawable.room);
        }
        else if(itemName.equals("حمام")) {
            holder.image.setImageResource(R.drawable.toilet);
        }
        else if(itemName.equals("مطبخ")) {
            holder.image.setImageResource(R.drawable.cetchen);
        }
        else if(itemName.equals("ريسيبشن")) {
            holder.image.setImageResource(R.drawable.reception);
        }
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView text;
        ImageView image;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.text);
            image=itemView.findViewById(R.id.image);
        }
    }

}
