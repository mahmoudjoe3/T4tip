package com.example.T4tip.ui.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.T4tip.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag4Electricity extends Fragment {

    View myveiw;
    String roomKind;
    public Frag4Electricity(String roomKind) {
        this.roomKind=roomKind;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_electricity_frag4, container, false);
    }

}
