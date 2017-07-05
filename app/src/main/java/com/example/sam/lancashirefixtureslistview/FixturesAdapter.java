package com.example.sam.lancashirefixtureslistview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sam on 05/07/2017.
 */

public class FixturesAdapter extends ArrayAdapter<Match> {

    public FixturesAdapter(Context context, ArrayList<Match> fixtures){
        super(context, 0 , fixtures);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.fixture_item, parent, false);
        }

        Match currentMatch = getItem(position);

        TextView hOrA = (TextView) listItemView.findViewById(R.id.h_or_a);
        hOrA.setText(currentMatch.getHOrA());

        TextView opponent = (TextView) listItemView.findViewById(R.id.opponent);
        opponent.setText(currentMatch.getOpponent());

        TextView time = (TextView) listItemView.findViewById(R.id.time);
        time.setText(currentMatch.getTime());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentMatch.getDate());

        TextView venue = (TextView) listItemView.findViewById(R.id.venue);
        venue.setText(currentMatch.getVenue());

        ImageView logo = (ImageView) listItemView.findViewById(R.id.logo);
        logo.setImageDrawable(currentMatch.getImage());


        listItemView.setTag(currentMatch);

        return listItemView;
    }
}
