package com.example.eatapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RandomMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_menu);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        com.example.eatapp.BottomNavigationHandle.setupBottomNavigation(this, bottomNav);
    }
}
