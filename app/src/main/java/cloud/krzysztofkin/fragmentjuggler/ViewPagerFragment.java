package cloud.krzysztofkin.fragmentjuggler;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewPagerFragment extends Fragment {

    ViewPager viewPager;
    TabLayout tabLayout;

    public ViewPagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_view_pager, container, false);

        //Create viewPager to swipe between categories
        viewPager = rootView.findViewById(R.id.view_pager);
        // Create an adapter that knows which fragment should be shown on each page
        ParametricFragmentPageAdapter adapter = new ParametricFragmentPageAdapter(getFragmentManager());
        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        //TabLayout
        tabLayout =  rootView.findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        return rootView;
    }

}
