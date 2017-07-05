package com.example.sam.lancashirefixtureslistview;

import android.graphics.drawable.Drawable;


/**
 * Created by Sam on 05/07/2017.
 */

public class Match {

    private String opponent;
    private String time;
    private String date;
    private String hOrA;
    private String venue;
    private Drawable image;
    private String url;

    public Match(String opponent, String time, String date, String hOrA, String venue, Drawable image, String url) {
        this.opponent = opponent;
        this.time = time;
        this.date = date;
        this.hOrA = hOrA;
        this.venue = venue;
        this.image = image;
        this.url = url;
    }

    public String getOpponent() {
        return opponent;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getHOrA() {
        return hOrA;
    }

    public String getVenue() {
        return venue;
    }

    public Drawable getImage() {
        return image;
    }

    public String getUrl() {
        return url;
    }
}
