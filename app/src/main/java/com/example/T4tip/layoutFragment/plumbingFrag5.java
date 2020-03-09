package com.example.T4tip.layoutFragment;


import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.T4tip.R;


public class plumbingFrag5 extends Fragment {
    String roomKind;
    View myview;
    CardView toiletCard,cetchen_card;


    public plumbingFrag5(String roomKind) {
        this.roomKind=roomKind;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myview= inflater.inflate(R.layout.fragment_plumbing_frag5, container, false);
        init();
        VisibilityAction(roomKind.split(" ")[0]);


        return myview;
    }

    private void init() {
        toiletCard=myview.findViewById(R.id.toilet_card);
        cetchen_card=myview.findViewById(R.id.cetchen_card);
    }

    private void VisibilityAction(String roomKind) {
        if(roomKind.equals("حمام")&&toiletCard.getVisibility()==View.GONE)
        {
            toiletCard.setVisibility(View.VISIBLE);
            cetchen_card.setVisibility(View.GONE);

        }
        else if(roomKind.equals("مطبخ")&&cetchen_card.getVisibility()==View.GONE){
            cetchen_card.setVisibility(View.VISIBLE);
            toiletCard.setVisibility(View.GONE);

        }
    }
}
