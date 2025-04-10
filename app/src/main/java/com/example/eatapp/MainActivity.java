package com.example.eatapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 하단 바를 찾습니다.
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        // 이제 null이 아니어야 합니다.
        BottomNavigationHandle.setupBottomNavigation(this, bottomNav);
    }
}
