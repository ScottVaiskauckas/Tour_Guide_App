package com.sitstaycreate.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OutdoorsActivitiesFragment extends Fragment {

    public OutdoorsActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.Outdoors0, R.string.Outdoors0_Description,
                R.drawable.barton_springs_pool));
        attractions.add(new Attraction(R.string.Outdoors1, R.string.Outdoors1_Description,
                R.drawable.greenbelt));
        attractions.add(new Attraction(R.string.Outdoors2, R.string.Outdoors2_Description,
                R.drawable.bonnell));
        attractions.add(new Attraction(R.string.Outdoors3, R.string.Outdoors3_Description,
                R.drawable.zilker));
        attractions.add(new Attraction(R.string.Outdoors4, R.string.Outdoors4_Description,
                R.drawable.mckinney));
        attractions.add(new Attraction(R.string.Outdoors5, R.string.Outdoors5_Description,
                R.drawable.hamilton_pool));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.tab1Light);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}