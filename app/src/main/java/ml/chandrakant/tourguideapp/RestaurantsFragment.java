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
        final ArrayList<FragmentItem> words = new ArrayList<FragmentItem>();
        words.add(new FragmentItem("Amar Punjabi Dhaba", "Railway Station"));
        words.add(new FragmentItem("AL Kareem", "Airport"));
        words.add(new FragmentItem("Firdaous", "Airport Circle"));
        words.add(new FragmentItem("MacDonalds", "City Mall"));
        words.add(new FragmentItem("Domionos", "IL Centre"));
        words.add(new FragmentItem("Subway", "Indravihar"));
        words.add(new FragmentItem("BMB", "Talwandi"));
        words.add(new FragmentItem("Suwalal Namkeen", "Nayapura"));
        words.add(new FragmentItem("Eatos", "Dadabari"));
        words.add(new FragmentItem("Agarwal Namkeens", "Mahaveer Nagar"));

        // Create an {@link FragmentItemAdapter}, whose data source is a list of {@link FragmentItem}s. The
        // adapter knows how to create list items for each item in the list.
        FragmentItemAdapter adapter = new FragmentItemAdapter(getActivity(), words, android.R.color.holo_red_dark);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = getActivity().findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FragmentItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link FragmentItem} in the list.
        listView.setAdapter(adapter);
    }
}
