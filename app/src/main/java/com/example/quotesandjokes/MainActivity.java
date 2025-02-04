package com.example.quotesandjokes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.PictureInPictureParams;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.quotesandjokes.Favourite.FavouritesActivity;
import com.example.quotesandjokes.Joke.JokesFragment;
import com.example.quotesandjokes.Quote.QuotesFragment;
import com.example.quotesandjokes.Share.ShareQRActivity;
import com.example.quotesandjokes.Slogan.SloganFragment;
import com.example.quotesandjokes.Wish.WishesFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private MyFragmentAdapter adapter;
 private FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton=findViewById(R.id.floatingActionButton1);
        floatingActionButton.setTooltipText("Check list of favourites");
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         startActivity(new Intent(MainActivity.this, FavouritesActivity.class));
            }
        });
        tabLayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.vv);
        adapter=new MyFragmentAdapter(getSupportFragmentManager());
        adapter.AddFragment(new WishesFragment(),"Wish");
        adapter.AddFragment(new SloganFragment(),"Slogan");
        adapter.AddFragment(new QuotesFragment(),"Quote");
        adapter.AddFragment(new JokesFragment(),"Joke");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    public void onUserLeaveHint () {
        PictureInPictureParams pictureInPictureParams= new PictureInPictureParams.Builder().build();
        enterPictureInPictureMode(pictureInPictureParams);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.dark_mode,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        if (item.getItemId()==R.id.dark) {
            startActivity(new Intent(getApplicationContext(),DarkModeActivity.class));return true;
        }
        if (item.getItemId()==R.id.qr) {
            startActivity(new Intent(getApplicationContext(), ShareQRActivity.class));return true;
        }
        return false;
    }
}