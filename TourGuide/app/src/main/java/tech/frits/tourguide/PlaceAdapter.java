package tech.frits.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_item, parent, false);
        }

        Place current_place = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.subject_txt);
        nameTextView.setText(current_place.getName());

        TextView description_text = (TextView) listItemView.findViewById(R.id.description_txt);
        description_text.setText(current_place.getDescription());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageView);

        int img_resource = current_place.getImageResourceId();
        if (img_resource == 0) {
            iconView.setVisibility(View.GONE);
        } else {
            iconView.setImageResource(current_place.getImageResourceId());
        }

        return listItemView;
    }
}
