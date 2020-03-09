package com.example.T4tip;


import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class wallFrag3 extends Fragment {


    View myview;
    ConstraintLayout exp1,exp2,exp3,exp4,exp5;
    ImageView arrow1,arrow2,arrow3,arrow4,arrow5;
    CardView card1,card2,card3,card4,card5;

    String roomKind;
    public wallFrag3(String roomKind) {
        this.roomKind=roomKind;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myview= inflater.inflate(R.layout.fragment_wall_frag3, container, false);
        cardAnimation();
        VisibilityAction(roomKind.split(" ")[0]);


        return myview;
    }

    private void VisibilityAction(String roomKind) {
        if((roomKind.equals("حمام")||roomKind.equals("مطبخ"))&&card4.getVisibility()==View.GONE)
        {
            card4.setVisibility(View.VISIBLE);
            card5.setVisibility(View.VISIBLE);

        }
        else if((roomKind.equals("غرفه")||roomKind.equals("ريسيبشن"))&&exp4.getVisibility()==View.VISIBLE){
            card4.setVisibility(View.GONE);
            card5.setVisibility(View.GONE);

        }
    }

    private void cardAnimation() {
        exp1 = myview.findViewById(R.id.exp1);
        arrow1 = myview.findViewById(R.id.arrow1);
        card1 = myview.findViewById(R.id.window_card);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exp1.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(card1, new AutoTransition());
                    exp1.setVisibility(View.VISIBLE);
                    arrow1.setImageResource(R.drawable.shape);
                } else {
                    TransitionManager.beginDelayedTransition(card1, new AutoTransition());
                    exp1.setVisibility(View.GONE);
                    arrow1.setImageResource(R.drawable.shape1);
                }
            }
        });


        exp2 = myview.findViewById(R.id.exp2);
        arrow2 = myview.findViewById(R.id.arrow2);
        card2 = myview.findViewById(R.id.card2);

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exp2.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(card2, new AutoTransition());
                    exp2.setVisibility(View.VISIBLE);
                    arrow2.setImageResource(R.drawable.shape);
                } else {
                    TransitionManager.beginDelayedTransition(card2, new AutoTransition());
                    exp2.setVisibility(View.GONE);
                    arrow2.setImageResource(R.drawable.shape1);
                }
            }
        });


        exp3 = myview.findViewById(R.id.exp3);
        arrow3 = myview.findViewById(R.id.arrow3);
        card3 = myview.findViewById(R.id.card3);

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exp3.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(card3, new AutoTransition());
                    exp3.setVisibility(View.VISIBLE);
                    arrow3.setImageResource(R.drawable.shape);
                } else {
                    TransitionManager.beginDelayedTransition(card3, new AutoTransition());
                    exp3.setVisibility(View.GONE);
                    arrow3.setImageResource(R.drawable.shape1);
                }
            }
        });


        exp4 = myview.findViewById(R.id.exp4);
        arrow4 = myview.findViewById(R.id.arrow4);
        card4 = myview.findViewById(R.id.card4);

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exp4.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(card4, new AutoTransition());
                    exp4.setVisibility(View.VISIBLE);
                    arrow4.setImageResource(R.drawable.shape);
                } else {
                    TransitionManager.beginDelayedTransition(card4, new AutoTransition());
                    exp4.setVisibility(View.GONE);
                    arrow4.setImageResource(R.drawable.shape1);
                }
            }
        });


        exp5 = myview.findViewById(R.id.exp5);
        arrow5 = myview.findViewById(R.id.arrow5);
        card5 = myview.findViewById(R.id.card5);

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (exp5.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(card5, new AutoTransition());
                    exp5.setVisibility(View.VISIBLE);
                    arrow5.setImageResource(R.drawable.shape);
                } else {
                    TransitionManager.beginDelayedTransition(card5, new AutoTransition());
                    exp5.setVisibility(View.GONE);
                    arrow5.setImageResource(R.drawable.shape1);
                }
            }
        });
        //end cardAnimation
    }

}
