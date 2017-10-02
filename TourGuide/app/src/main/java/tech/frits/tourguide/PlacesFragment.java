package tech.frits.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlacesFragment extends Fragment {

    ArrayList<Place> places = new ArrayList<Place>();
    ListView listView;
    PlaceAdapter placeAdapter;
    boolean looped;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (!looped) {
            places.add(new Place("Underground", "An underground rapid transit rail system used in various parts of the world", R.drawable.underground));
            places.add(new Place("Londen Aye", "The London Eye is a giant Ferris wheel on the South Bank of the River Thames in London. As of January 2015, it has been advertised as the Coca-Cola London Eye.\n" +
                    "\n" +
                    "The structure is 443 feet (135 m) tall and the wheel has a diameter of 394 feet (120 m). When it opened to the public in 2000 it was the world's tallest Ferris wheel. Its height was surpassed by the 520 feet (158 m) tall Star of Nanchang in 2006, the 541 feet (165 m) tall Singapore Flyer in 2008, and the 550 feet (168 m) High Roller (Las Vegas) in 2014. Supported by an A-frame on one side only, unlike the taller Nanchang and Singapore wheels, the Eye is described by its operators as \"the world's tallest cantilevered observation wheel\".\n" +
                    "\n" +
                    "It is Europe's tallest Ferris wheel, and offered the highest public viewing point in London until it was superseded by the 804 feet (245 m) observation deck on the 72nd floor of The Shard, which opened to the public on 1 February 2013. It is the most popular paid tourist attraction in the United Kingdom with over 3.75 million visitors annually, and has made many appearances in popular culture.\n" +
                    "\n", R.drawable.london_eye));
            places.add(new Place("London Bridge", "Throughout history, a number of bridges named London Bridge have spanned the River Thames between the City of London and Southwark, in central London. The current crossing, which opened to traffic in 1973, is a box girder bridge built from concrete and steel. This replaced a 19th-century stone-arched bridge, which in turn superseded a 600-year-old medieval structure. This was preceded by a succession of timber bridges, the first built by the Roman founders of London.\n" +
                    "\n" +
                    "The current bridge stands at the western end of the Pool of London but is positioned 30 metres (98 ft) upstream from previous alignments. The traditional ends of the medieval bridge were marked by St Magnus-the-Martyr on the northern bank and Southwark Cathedral on the southern shore. Until Putney Bridge opened in 1729, London Bridge was the only road-crossing of the Thames downstream of Kingston upon Thames. Its importance has been the subject of popular culture throughout the ages such as in the nursery rhyme \"London Bridge Is Falling Down\" and its inclusion within art and literature.", R.drawable.london_bridge ));
            places.add(new Place("Starbucks", "Starbucks Corporation is an American coffee company and coffeehouse chain. Starbucks was founded in Seattle, Washington in 1971. As of November 2016, it operates 23,768 locations worldwide.\n" +
                    "\n" +
                    "Starbucks is considered the main representative of \"second wave coffee\", initially distinguishing itself from other coffee-serving venues in the US by taste, quality, and customer experience while popularizing darkly roasted coffee. Since the 2000s, third wave coffee makers have targeted quality-minded coffee drinkers with hand-made coffee based on lighter roasts, while Starbucks nowadays uses automated espresso machines for efficiency and safety reasons. Unlike other cafe venues, Starbucks is known for including a fee for service; as well as for their many customer centered policies.", R.drawable.starbucks));
            places.add(new Place("Big Ben", "Big Ben is the nickname for the Great Bell of the clock at the north end of the Palace of Westminster in London and is usually extended to refer to both the clock and the clock tower as well. The tower is officially known as Elizabeth Tower, renamed to celebrate the Diamond Jubilee of Elizabeth II in 2012; previously, it was known simply as the Clock Tower.\n" +
                    "\n" +
                    "When completed in 1859, it was, says clockmaker Ian Westworth, “the prince of timekeepers: the biggest, most accurate four-faced striking and chiming clock in the world.” The tower had its 150th anniversary on 31 May 2009, during which celebratory events took place.\n" +
                    "\n" +
                    "A British cultural icon, the tower is one of the most prominent symbols of the United Kingdom and is often in the establishing shot of films set in London.k", R.drawable.big_ben));
            places.add(new Place("Palace of Westminster", "The Palace of Westminster is the meeting place of the House of Commons and the House of Lords, the two houses of the Parliament of the United Kingdom. Commonly known as the Houses of Parliament after its occupants, the Palace lies on the north bank of the River Thames in the City of Westminster, in central London.", R.drawable.palace));
            places.add(new Place("The Camden market", "The Camden markets are a number of adjoining large retail markets in Camden Town near the Hampstead Road Lock of the Regent's Canal (popularly referred to as Camden Lock), often collectively named \"Camden Market\" or \"Camden Lock\". Among products sold on the stalls are crafts, clothing, bric-a-brac, and fast food. It is the fourth-most popular visitor attraction in London, attracting approximately 250,000 people each week.\n" +
                    "\n" +
                    "A small local foodstuffs market has operated in Inverness Street in Camden Town since the beginning of the 20th century. From 1974 a small weekly crafts market that operated every Sunday near Camden Lock developed into a large complex of markets. The markets, originally temporary stalls only, extended to a mixture of stalls and fixed premises. The traditional Inverness Street market started losing stalls once local supermarkets opened; by mid-2013 all the original stalls had gone, being replaced by stalls similar to those of the other markets, including fast food but not produce.\n" +
                    "\n" +
                    "The markets originally operated on Sundays only, which continues to be the main trading day. Opening later extended to Saturdays for most of the market. A number of traders, mainly those in fixed premises, operate throughout the week, although the weekend remains the peak period.", R.drawable.camen_market));

            placeAdapter = new PlaceAdapter(getActivity(), places);
            looped = true;
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_places, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = (ListView) view.findViewById(R.id.places_list);
        listView.setAdapter(placeAdapter);
        listView.setDivider(null);
    }

}
