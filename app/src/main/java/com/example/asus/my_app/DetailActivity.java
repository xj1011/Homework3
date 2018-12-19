package com.example.asus.my_app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class DetailActivity extends Activity {
    private CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
    }
}
