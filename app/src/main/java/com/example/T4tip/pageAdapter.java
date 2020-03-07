package com.example.T4tip;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pageAdapter extends FragmentPagerAdapter {
    private int numOfTabs;
    private String roomKind;
    public pageAdapter(FragmentManager fm, int numOfTabs,String roomKind) {
        super(fm);
        this.numOfTabs=numOfTabs;
        this.roomKind=roomKind;
    }
    @Override
    public Fragment getItem(int i) {

            if(numOfTabs==6) {
                switch (i) {
                    case 0:
                        return new plumbingFrag5(roomKind);
                    case 1:
                        return new woodFrag6(roomKind);
                    case 2:
                        return new electricityFrag4(roomKind);
                    case 3:
                        return new wallFrag3(roomKind);
                    case 4:
                        return new roofFrag2(roomKind);
                    case 5:
                        return new groundFrag1(roomKind);
                    default:
                        return null;
                }
            }
            else{
                switch (i) {

                    case 0:
                        return new woodFrag6(roomKind);
                    case 1:
                        return new electricityFrag4(roomKind);
                    case 2:
                        return new wallFrag3(roomKind);
                    case 3:
                        return new roofFrag2(roomKind);
                    case 4:
                        return new groundFrag1(roomKind);
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
