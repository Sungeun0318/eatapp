package com.example.eatapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FavoritesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        // 이제 null이 아닙니다.
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        BottomNavigationHandle.setupBottomNavigation(this, bottomNav);
    }
}

