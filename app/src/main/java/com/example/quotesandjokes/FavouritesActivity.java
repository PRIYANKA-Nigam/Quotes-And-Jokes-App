package com.example.quotesandjokes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FavouritesActivity extends AppCompatActivity {
private ImageView i1,i2,i3,i4,i5,i6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        i1=findViewById(R.id.circle); i1.setTooltipText("See All your Favourites Quotes");
        i2=findViewById(R.id.circle2); i2.setTooltipText("See All your Favourites Jokes");
        i3=findViewById(R.id.c3); i3.setTooltipText("See All your Favourites Special Events Wishes");
        i4=findViewById(R.id.c4); i4.setTooltipText("See All your Favourites Religious Events Wishes");
        i5=findViewById(R.id.c5); i5.setTooltipText("See All your Favourites International Events Wishes");
        i6=findViewById(R.id.c6); i6.setTooltipText("See All your Favourites Memorable Events Wishes");
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),QuotesFavActivity.class));
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),JokesFavActivity.class));
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SpecialEventsFavActivity.class));
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ReligiousEventsFavActivity.class));
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),InternationalEventsFavActivity.class));
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MemorableEventFavActivity.class));
            }
        });
    }
}