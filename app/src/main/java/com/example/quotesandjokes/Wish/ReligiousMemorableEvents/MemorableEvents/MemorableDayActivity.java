package com.example.quotesandjokes.Wish.ReligiousMemorableEvents.MemorableEvents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.quotesandjokes.DarkModeActivity;
import com.example.quotesandjokes.MainActivity;
import com.example.quotesandjokes.R;

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
                startActivity(new Intent(getApplicationContext(), ValentineDayActivity.class));
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), FriendDayActivity.class));
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), FatherDayActivity.class));
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MotherDayActivity.class));
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), BrotherDayActivity.class));
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SisterDayActivity.class));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.dark_home,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        if (item.getItemId()==R.id.dark) {
            startActivity(new Intent(getApplicationContext(), DarkModeActivity.class));return true;
        }
        if (item.getItemId()==R.id.home){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));return true;
        }
        return  false;
    }
}