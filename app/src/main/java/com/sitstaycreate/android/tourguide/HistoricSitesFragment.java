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
public class HistoricSitesFragment extends Fragment {

    public HistoricSitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.Historic0, R.string.Historic0_Description,
                R.drawable.capitol));
        attractions.add(new Attraction(R.string.Historic1, R.string.Historic1_Description,
                R.drawable.driskill));
        attractions.add(new Attraction(R.string.Historic2, R.string.Historic2_Description,
                R.drawable.dickinson));
        attractions.add(new Attraction(R.string.Historic3, R.string.Historic3_Description,
                R.drawable.fire_museum));
        attractions.add(new Attraction(R.string.Historic4, R.string.Historic4_Description,
                R.drawable.paramount));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.colorPrimaryLight);

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
