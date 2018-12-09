package ml.chandrakant.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FragmentItemAdapter extends ArrayAdapter<FragmentItem> {

    /** Resource color ID for category */
    private int mColorResourceId;

    public FragmentItemAdapter(Context context, ArrayList<FragmentItem> fragmentItems, int colorResourceId) {
        super(context, 0, fragmentItems);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_list_item, parent, false);
        }

        // Get the {@link FragmentItem} object located at this position in the list
        FragmentItem currentFragmentItem = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.attraction_name_text_view);
        nameTextView.setText(currentFragmentItem.getAttractionName());

        TextView locationTextView = listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(currentFragmentItem.getAttractionLocation());

        ImageView iconImage = listItemView.findViewById(R.id.image);
        if (currentFragmentItem.hasImage()) {
            // Set the image view with appropriate image resource.
            iconImage.setImageResource(currentFragmentItem.getImageResource());

            // Make sure that the view is visible
            iconImage.setVisibility(View.VISIBLE);
        } else {
            // Set Visibility to be GONE, so that no extra space is consumed.
            iconImage.setVisibility(View.GONE);
        }

        TextView date = listItemView.findViewById(R.id.event_date_text_view);
        if (currentFragmentItem.hasDate()) {
            // Set the text view with appropriate date.
            date.setText(currentFragmentItem.getEventDate());

            // Make sure that the view is visible
            date.setVisibility(View.VISIBLE);
        } else {
            // Set Visibility to be GONE, so that no extra space is consumed.
            date.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
