package tech.frits.tourguide;


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

    ArrayList<Place> places = new ArrayList<Place>();
    ListView listView;
    PlaceAdapter placeAdapter;
    boolean looped;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (!looped) {
            places.add(new Place("The Ledbury", "The Ledbury is a restaurant located on Ledbury Road, Notting Hill, London, England. It holds two Michelin stars, and has been featured in S.Pellegrino World's 50 Best Restaurants. The head chef is Brett Graham, and he has been received favorably by critics. The restaurant opened in 2005, under head chef Brett Graham. It is the sister restaurant of The Square, a two Michelin star restaurant in Mayfair, London, with the same backers investing in both restaurants. Graham had previously worked at The Square as a sous chef for three years. The new restaurant gained a Michelin star within a year of opening, but sales only increased by 2009. A second Michelin star followed in 2010. Also in 2010, it was awarded the Square Meal BMW Restaurant of the Year Award.", R.drawable.restaurant1));
            places.add(new Place("The Good Egg","Casual breakfast-til-late neighbourhood spot serving New York and Middle Eastern influenced dishes.", R.drawable.restaurant2));
            places.add(new Place("Gymkhana", "Tandoor oven roasts, sigri charcoal grills and seasonal curries at Raj-era themed Indian restaurant.", R.drawable.restaurant3));
            places.add(new Place("Duck & Waffle","British and European cuisine served 24/7 in modern, 40th-floor space with floor-to-ceiling windows.", R.drawable.restaurant4));
            places.add(new Place("Barrafina", "Cosy, diner-style tapas bar with stools for Spanish small plates, served with sherry, cava and more.", R.drawable.restaurant5));
            places.add(new Place("Hawksmoor Seven Dials", "High-end steak specialist serving British dry-aged T-bone, D-rump and porterhouse, plus seafood", R.drawable.restaurant6));
            places.add(new Place("Bocca di Lupo", "Authentic small or large plate Italian dining in compact restaurant with neighbouring gelateria.", R.drawable.restaurant7));
            places.add(new Place("The Wolseley", "Media types descend here for Modern European food, afternoon tea and grand art deco glamour.", R.drawable.restaurant8));
            placeAdapter = new PlaceAdapter(getActivity(), places);
            looped = true;
        }
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_restaurants, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = (ListView) view.findViewById(R.id.places_list);
        listView.setAdapter(placeAdapter);
        listView.setDivider(null);
    }

}
