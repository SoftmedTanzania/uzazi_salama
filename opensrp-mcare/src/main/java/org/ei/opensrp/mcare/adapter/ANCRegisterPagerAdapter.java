package org.ei.opensrp.mcare.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ei.opensrp.mcare.fragment.ANCRegister1stFragment;
import org.ei.opensrp.mcare.fragment.ANCRegister2ndFragment;
import org.ei.opensrp.mcare.fragment.ANCRegister3rdFragment;

/**
 * Created by ali on 8/22/17.
 */

public class ANCRegisterPagerAdapter extends FragmentPagerAdapter {

    public ANCRegisterPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ANCRegister1stFragment();

            case 1:
                return new ANCRegister2ndFragment();

            case 2:
                return new ANCRegister3rdFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return String.valueOf(position + 1);
    }
}
