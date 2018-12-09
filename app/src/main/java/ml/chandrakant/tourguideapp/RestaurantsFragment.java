package ml.chandrakant.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("Popular Restaurants");
        // Create an array of restaurants.
        final ArrayList<FragmentItem> restaurants = new ArrayList<FragmentItem>();
        restaurants.add(new FragmentItem("Amar Punjabi Dhaba", "Railway Station"));
        restaurants.add(new FragmentItem("AL Kareem", "Airport"));
        restaurants.add(new FragmentItem("Firdaous", "Airport Circle"));
        restaurants.add(new FragmentItem("MacDonalds", "City Mall"));
        restaurants.add(new FragmentItem("Domionos", "IL Centre"));
        restaurants.add(new FragmentItem("Subway", "Indravihar"));
        restaurants.add(new FragmentItem("BMB", "Talwandi"));
        restaurants.add(new FragmentItem("Suwalal Namkeen", "Nayapura"));
        restaurants.add(new FragmentItem("Eatos", "Dadabari"));
        restaurants.add(new FragmentItem("Agarwal Namkeens", "Mahaveer Nagar"));

        // Create an {@link FragmentItemAdapter}, whose data source is a list of {@link FragmentItem}s. The
        // adapter knows how to create list items for each item in the list.
        FragmentItemAdapter adapter = new FragmentItemAdapter(getActivity(), restaurants, android.R.color.holo_red_dark);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list.
        ListView listView = getActivity().findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FragmentItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link FragmentItem} in the list.
        listView.setAdapter(adapter);
    }
}
