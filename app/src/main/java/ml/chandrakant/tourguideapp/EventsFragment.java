package ml.chandrakant.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("Upcoming Events");
        // Create an array of numbers
        final ArrayList<FragmentItem> words = new ArrayList<FragmentItem>();
        words.add(new FragmentItem("Vivek Bindra Motivation", "IL Auditorium", "10th \n Dec"));
        words.add(new FragmentItem("Swami Ramdev Yoga Shivir", "Gandhi Maidan", "11th \n DEC"));
        words.add(new FragmentItem("PM Modi's Address", "Netaji Maidan", "12th \n DEC"));
        words.add(new FragmentItem("Ujjwal Patani Motivation", "IL Auditorium", "13th \n DEC"));
        words.add(new FragmentItem("CM Raje Speech", "Public Assembly", "15th \n DEC"));
        words.add(new FragmentItem("Job Fair", "Commerce College", "16th \n DEC"));
        words.add(new FragmentItem("Open Expo", "IL Auditorium", "18th \n DEC"));
        words.add(new FragmentItem("Science Fair", "Career Point University", "20th \n DEC"));
        words.add(new FragmentItem("Sandeep Maheshwari Motivation", "IL Auditorium", "22nd \n DEC"));
        words.add(new FragmentItem("Pre Christmas Celebration", "City Church", "24th \n DEC"));

        // Create an {@link FragmentItemAdapter}, whose data source is a list of {@link FragmentItem}s. The
        // adapter knows how to create list items for each item in the list.
        FragmentItemAdapter adapter = new FragmentItemAdapter(getActivity(), words, android.R.color.holo_purple);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = getActivity().findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FragmentItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link FragmentItem} in the list.
        listView.setAdapter(adapter);
    }
}
