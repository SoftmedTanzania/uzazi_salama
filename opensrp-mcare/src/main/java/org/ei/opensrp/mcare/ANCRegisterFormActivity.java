package org.ei.opensrp.mcare;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import org.ei.opensrp.mcare.R;
import org.ei.opensrp.mcare.adapter.ANCRegisterPagerAdapter;

public class ANCRegisterFormActivity extends ActionBarActivity {

    private ViewPager viewPager;
    Animation animationFabShow, animationFabHide, animationFabHideSlow;
    FloatingActionButton fabDone;

    private ANCRegisterPagerAdapter pagerAdapter;
    private TabLayout tabs;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ancregister_form);

        Toolbar toolbar = (Toolbar) findViewById(R.id.mToolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("Rejesta Ya Wajawazito");


        animationFabShow = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.anim_fab_show_fast);
        animationFabHide = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.anim_fab_hide_fast);
        animationFabHideSlow = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.anim_fab_hide);


        fabDone = (FloatingActionButton) findViewById(R.id.fabDone);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        pagerAdapter = new ANCRegisterPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapter);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {

                if (position == pagerAdapter.getCount() - 1) {
                    // show only on the last fragment
                    fabDone.startAnimation(animationFabShow);
                    fabDone.setEnabled(true);

                } else if (fabDone.isEnabled()) {
                    fabDone.startAnimation(animationFabHide);
                    fabDone.setEnabled(false);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        // tabs icons
        tabs.getTabAt(0).setIcon(R.drawable.ic_account_circle);
        tabs.getTabAt(1).setIcon(R.drawable.ic_message_bulleted);

        final int colorWhite = ContextCompat.getColor(getApplicationContext(), android.R.color.white);
        final int colorPrimaryLight = ContextCompat.getColor(getApplicationContext(), R.color.primary_light);

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getIcon() != null)
                    tab.getIcon().setColorFilter(colorWhite, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                if (tab.getIcon() != null)
                    tab.getIcon().setColorFilter(colorPrimaryLight, PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (fabDone.isEnabled() &&
                tabs.getSelectedTabPosition() != pagerAdapter.getCount() - 1) {
            // hide fab on starting activity
            fabDone.startAnimation(animationFabHideSlow);
            fabDone.setEnabled(false);
        }
    }
}
