package com.example.quotesandjokes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class MemorableDayActivity extends AppCompatActivity {
    CircleImageView c1,c2,c3,c4,c5,c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memorable_day);
        c1=findViewById(R.id.c1);c1.setTooltipText("Valentine Day");
        c2=findViewById(R.id.c2);c2.setTooltipText("Friendship Day");
        c3=findViewById(R.id.c3);c3.setTooltipText("Father Day");
        c4=findViewById(R.id.c4);c4.setTooltipText("Mother Day");
        c5=findViewById(R.id.c5);c5.setTooltipText("Brother Day");
        c6=findViewById(R.id.c6);c6.setTooltipText("Sister Day");
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ValentineDayActivity.class));
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FriendDayActivity.class));
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FatherDayActivity.class));
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MotherDayActivity.class));
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),BrotherDayActivity.class));
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SisterDayActivity.class));
            }
        });
    }
}