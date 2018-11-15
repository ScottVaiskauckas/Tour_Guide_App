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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.Restaurants0, R.string.Restaurants0_Description,
                R.drawable.casa_colombia));
        attractions.add(new Attraction(R.string.Restaurants1, R.string.Restaurants1_Description,
                R.drawable.franklin));
        attractions.add(new Attraction(R.string.Restaurants2, R.string.Restaurants2_Description,
                R.drawable.salt_and_time));
        attractions.add(new Attraction(R.string.Restaurants3, R.string.Restaurants3_Description,
                R.drawable.kemuri));
        attractions.add(new Attraction(R.string.Restaurants4, R.string.Restaurants4_Description,
                R.drawable.odd_duck));
        attractions.add(new Attraction(R.string.Restaurants5, R.string.Restaurants5_Description,
                R.drawable.torchy));
        attractions.add(new Attraction(R.string.Restaurants6, R.string.Restaurants6_Description,
                R.drawable.la_barbecue));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.tab2Light);

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