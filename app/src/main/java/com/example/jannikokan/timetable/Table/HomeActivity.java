package com.example.jannikokan.timetable.Table;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jannikokan.timetable.Helper.BottomNavVieweHerlper;
import com.example.jannikokan.timetable.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends AppCompatActivity {

    private Context myContext = HomeActivity.this;
    private final static String TAG = "HomeActivity";
    private final static int ACTIVITY_NUM = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, " -> onCreate") ;
setupBottomNavigationView();

    }


    /**
     *  Bottom Navigation View
     * */
    private void setupBottomNavigationView(){
        Log.d(TAG, "-> setupBottomNavView");

        BottomNavigationViewEx bottomNavView =  (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavVieweHerlper.setupBottomNavigationView(bottomNavView);
        BottomNavVieweHerlper.enableNavigation(myContext, bottomNavView);
        Menu menu = bottomNavView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }




}