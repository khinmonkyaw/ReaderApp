package com.sparrowmon.readerapp.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.sparrowmon.readerapp.R;
import com.sparrowmon.readerapp.adapters.BannerAdapter;
import com.sparrowmon.readerapp.adapters.NewAdapter;
import com.sparrowmon.readerapp.fragments.BannerFragment;
import com.sparrowmon.readerapp.fragments.PopularFragment;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);




        drawerLayout = findViewById(R.id.dl);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView = findViewById(R.id.nv);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case  R.id.about_us :
                        break;
                    case R.id.setting :
                        break;
                    case  R.id.logout :
                        break;

                }

                for(int i=0;i<navigationView.getMenu().size();i++)
                {
                    navigationView.getMenu().getItem(i).setChecked(false);

                }
                menuItem.setChecked(true);
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });




        recyclerView = findViewById(R.id.rv_new);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),  LinearLayoutManager.VERTICAL,false));
        NewAdapter newAdapter = new NewAdapter();
        recyclerView.setAdapter(newAdapter);


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_banner, BannerFragment.newInstance())
                .commit();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_popular, PopularFragment.newInstance())
                .commit();


    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
