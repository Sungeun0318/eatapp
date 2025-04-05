package com.example.eatapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NotificationsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 필요하다면 layout/activity_notifications.xml 생성
        setContentView(R.layout.activity_notifications);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationView);
        com.example.eatapp.BottomNavigationHandle.setupBottomNavigation(this, bottomNav);
    }
}
