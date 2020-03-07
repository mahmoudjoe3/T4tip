package com.example.T4tip;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class plumbingFrag5 extends Fragment {
    String roomKind;

    public plumbingFrag5(String roomKind) {
        // Required empty public constructor
        this.roomKind=roomKind;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_plumbing_frag5, container, false);
    }

}
