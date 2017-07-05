package com.example.sam.lancashirefixtureslistview;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

import static com.example.sam.lancashirefixtureslistview.R.drawable.durhamjets;


/**
 * Created by Sam on 05/07/2017.
 */

public class Fixtures {

    private ArrayList<Match> list;
    private Context context;

    public Fixtures(Context context){
        this.context = context;
        list = new ArrayList<Match>();
        list.add(new Match("Durham Jets", "18:30", "07/07", "A", "Emirates Riverside", context.getResources().getDrawable(R.drawable.durhamjets), "http://www.lccc.co.uk/cricket/match-centre/durham-jets-v-lancashire-lightning-natwest-t20-blast-emirates-riverside/"));
        list.add(new Match("Leicestershire Foxes", "14:30", "09/07", "H", "Liverpool CC", context.getResources().getDrawable(R.drawable.leicestershirefoxes), "http://www.lccc.co.uk/cricket/match-centre/lancashire-lightning-v-leicestershire-foxes-natwest-t20-blast/"));
        list.add(new Match("Yorkshire Vikings", "19:00", "14/07", "H", "Emirates Old Trafford", context.getResources().getDrawable(R.drawable.yorkshirevikings), "http://www.lccc.co.uk/cricket/match-centre/lancashire-lightning-v-yorkshire-vikings-natwest-t20-blast-emirates-old-trafford/"));
        list.add(new Match("Derbyshire Falcons", "14:30", "16/07", "H", "Emirates Old Trafford", context.getResources().getDrawable(R.drawable.derbyshire_county_cricket_club_logo), "http://www.lccc.co.uk/cricket/match-centre/lancashire-lightning-v-derbyshire-falcons-natwest-t20-blast/"));
        list.add(new Match("Worcestershire Rapids", "17:30", "21/07", "A", "New Road", context.getResources().getDrawable(R.drawable.worcestershirerapids), "http://www.lccc.co.uk/cricket/match-centre/worcestershire-rapids-v-lancashire-lightning-new-road-natwest-t20-blast/"));
        list.add(new Match("Durham Jets", "14:30", "23/07", "H", "Emirates Old Trafford", context.getResources().getDrawable(R.drawable.durhamjets), "http://www.lccc.co.uk/cricket/match-centre/lancashire-lightning-v-durham-jets-emirates-old-trafford-natwest-t20-blast/"));
        list.add(new Match("Derbyshire Falcons", "19:00", "25/07", "A", "3AAA County Ground", context.getResources().getDrawable(R.drawable.derbyshire_county_cricket_club_logo), "http://www.lccc.co.uk/cricket/match-centre/derbyshire-falcons-v-lancashire-lightning-3aaa-county-ground-natwest-t20-blast/"));
        list.add(new Match("Nottinghamshire Outlaws", "18:30", "28/07", "H", "Emirates Old Trafford", context.getResources().getDrawable(R.drawable.nottinghamshireoutlaws), "http://www.lccc.co.uk/cricket/match-centre/lancashire-lightning-v-nottinghamshire-outlaws-emirates-old-trafford-natwest-t20-blast/"));
        list.add(new Match("Birmingham Bears", "14:30", "30/07", "A", "Edgbaston", context.getResources().getDrawable(R.drawable.birminghambears), "http://www.lccc.co.uk/cricket/match-centre/birmingham-bears-v-lancashire-lightning-edgbaston-natwest-t20-blast/"));
        list.add(new Match("Northamptonshire Steelbacks", "18:30", "03/08", "A", "County Ground, Northampton", context.getResources().getDrawable(R.drawable.northamptonshiresteelbacks), "http://www.lccc.co.uk/cricket/match-centre/northamptonshire-steelback-v-lancashire-lightning-wantage-road-natwest-t20-blast/"));
        list.add(new Match("Leicestershire Foxes", "18:30", "04/08", "A", "Fisher County Ground", context.getResources().getDrawable(R.drawable.leicestershirefoxes), "http://www.lccc.co.uk/cricket/match-centre/leicestershire-foxes-v-lancashire-lightning-grace-road-natwest-t20-blast/"));
        list.add(new Match("Yorkshire Vikings", "18:30", "11/08", "A", "Headingley", context.getResources().getDrawable(R.drawable.yorkshirevikings), "http://www.lccc.co.uk/cricket/match-centre/yorkshire-vikings-v-lancashire-lightning-headingley-natwest-t20-blast/"));
        list.add(new Match("Worcestershire Rapids", "18:30", "16/08", "H", "Emirates Old Trafford", context.getResources().getDrawable(R.drawable.worcestershirerapids), "http://www.lccc.co.uk/cricket/match-centre/lancashire-lightning-v-worcestershire-rapids-emirates-old-trafford-natwest-t20-blast/"));
        list.add(new Match("Birmingham Bears", "18:30", "18/08","H", "Emirates Old Trafford", context.getResources().getDrawable(R.drawable.birminghambears), "http://www.lccc.co.uk/cricket/match-centre/lancashire-lightning-v-birmingham-bears-emirates-old-trafford-natwest-t20-blast/"));
    }

    public ArrayList<Match> getList() {
        return list;
    }
}
