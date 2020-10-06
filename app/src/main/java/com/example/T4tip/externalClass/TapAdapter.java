package com.example.T4tip.externalClass;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.T4tip.ui.fragments.Frag4Electricity;
import com.example.T4tip.ui.fragments.Frag1Ground;
import com.example.T4tip.ui.fragments.Frag5Plumbing;
import com.example.T4tip.ui.fragments.Frag2Roof;
import com.example.T4tip.ui.fragments.Frag3Wall;
import com.example.T4tip.ui.fragments.Frag6Wood;

public class TapAdapter extends FragmentPagerAdapter {
    private int numOfTabs;
    private String roomKind;
    public TapAdapter(FragmentManager fm, int numOfTabs, String roomKind) {
        super(fm);
        this.numOfTabs=numOfTabs;
        this.roomKind=roomKind;
    }
    @Override
    public Fragment getItem(int i) {

            if(numOfTabs==6) {
                switch (i) {
                    case 0:                                       ////send it to pageadapter like مطبخ 1
                        return new Frag5Plumbing(roomKind);
                    case 1:
                        return new Frag6Wood(roomKind);
                    case 2:
                        return new Frag4Electricity(roomKind);
                    case 3:
                        return new Frag3Wall(roomKind);
                    case 4:
                        return new Frag2Roof(roomKind);
                    case 5:
                        return new Frag1Ground(roomKind);
                    default:
                        return null;
                }
            }
            else{
                switch (i) {

                    case 0:
                        return new Frag6Wood(roomKind);
                    case 1:
                        return new Frag4Electricity(roomKind);
                    case 2:
                        return new Frag3Wall(roomKind);
                    case 3:
                        return new Frag2Roof(roomKind);
                    case 4:
                        return new Frag1Ground(roomKind);
                    default:
                        return null;
                }
            }


        }


    @Override
    public int getCount() {
        return numOfTabs;
    }
}
