package ml.chandrakant.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("City Attractions");
        // Create an array of attractions
        final ArrayList<FragmentItem> attractions = new ArrayList<FragmentItem>();
        attractions.add(new FragmentItem("Seven Wonders", "Gumanpura", R.drawable.taj_7_wonders_kota));
        attractions.add(new FragmentItem("Garadia Mahadev Temple", "Nayapura", R.drawable.gardia_mahadev));
        attractions.add(new FragmentItem("Chambal Garden", "Station Road", R.drawable.chambal_garden));
        attractions.add(new FragmentItem("Kishore Sagar", "Airport South", R.drawable.kishore_sagar));
        attractions.add(new FragmentItem("Kota Garh", "Garh Palace", R.drawable.kota_garh));
        attractions.add(new FragmentItem("Khade Ganesh Ji", "Indravihar", R.drawable.khade_ganesh_ji));
        attractions.add(new FragmentItem("Gaipernath Waterfall", "Keshavpura", R.drawable.gaipernath));
        attractions.add(new FragmentItem("Jag Mandir Palace", "Dadabari", R.drawable.jag_mandir));
        attractions.add(new FragmentItem("Ahluwalia's The Great Mall of Kota", "Vigyan Nagar", R.drawable.the_great_mall));
        attractions.add(new FragmentItem("Government Museum", "Jawahar Nagar", R.drawable.museum_kota));

        // Create an {@link FragmentItemAdapter}, whose data source is a list of {@link FragmentItem}s. The
        // adapter knows how to create list items for each item in the list.
        FragmentItemAdapter adapter = new FragmentItemAdapter(getActivity(), attractions, android.R.color.holo_orange_dark);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list.
        ListView listView = getActivity().findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FragmentItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link FragmentItem} in the list.
        listView.setAdapter(adapter);
    }
}
