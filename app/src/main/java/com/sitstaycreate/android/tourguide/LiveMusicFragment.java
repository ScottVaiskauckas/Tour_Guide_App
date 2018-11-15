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
public class LiveMusicFragment extends Fragment {

    public LiveMusicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of Attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.LiveMusic0, R.string.LiveMusic0_Description,
                R.drawable.stubbs));
        attractions.add(new Attraction(R.string.LiveMusic1, R.string.LiveMusic1_Description,
                R.drawable.empire));
        attractions.add(new Attraction(R.string.LiveMusic2, R.string.LiveMusic2_Description,
                R.drawable.emos));
        attractions.add(new Attraction(R.string.LiveMusic3, R.string.LiveMusic3_Description,
                R.drawable.scoot_inn));
        attractions.add(new Attraction(R.string.LiveMusic4, R.string.LiveMusic4_Description,
                R.drawable.austin_mohawk));
        attractions.add(new Attraction(R.string.LiveMusic5, R.string.LiveMusic5_Description,
                R.drawable.hole_in_the_wall));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.tab3Light);

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
