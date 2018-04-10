package cloud.krzysztofkin.fragmentjuggler;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class ParametricFragmentPageAdapter extends FragmentPagerAdapter {
    ParametricFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position position
     */
    @Override
    public Fragment getItem(int position) {
        return ParametricFragment.newInstance("Parameter: " + Integer.toString(position));
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "POSITION " + Integer.toString(position);
    }
}
