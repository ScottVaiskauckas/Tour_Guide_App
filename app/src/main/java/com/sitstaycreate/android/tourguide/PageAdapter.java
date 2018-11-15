package com.sitstaycreate.android.tourguide;

import android.support.v4.app.FragmentPagerAdapter;

/**The code in this file is based on a tutorial at
 * https://www.codingdemos.com/android-tablayout-example-viewpager.
 * and was accessed 09/01/2018.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link PageAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Attraction} objects.
 */
public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    /**
     * Create a new {@link PageAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     * @param numOfTabs is the number of pages
     *
     */
    PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HistoricSitesFragment();
            case 1:
                return new OutdoorsActivitiesFragment();
            case 2:
                return new RestaurantsFragment();
            case 3:
                return new LiveMusicFragment();
            default:
                return null;
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return numOfTabs;
    }
}