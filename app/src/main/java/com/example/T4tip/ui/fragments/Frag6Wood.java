package com.example.T4tip.ui.fragments;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.T4tip.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag6Wood extends Fragment {

    View myveiw;
    String roomKind;
    public Frag6Wood(String roomKind) {
        this.roomKind=roomKind;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myveiw= inflater.inflate(R.layout.fragment_wood6, container, false);

        






        return myveiw;
    }

}
