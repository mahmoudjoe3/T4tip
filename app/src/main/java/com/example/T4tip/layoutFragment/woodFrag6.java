package com.example.T4tip.layoutFragment;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.T4tip.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class woodFrag6 extends Fragment {

    View myveiw;
    String roomKind;
    public woodFrag6(String roomKind) {
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
