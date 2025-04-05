package com.example.eatapp;

import android.app.Activity;
import android.content.Intent;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationHandle {

    public static void setupBottomNavigation(Activity activity, BottomNavigationView bottomNavigationView) {
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.nav_favorites && !(activity instanceof FavoritesActivity)) {
                activity.startActivity(new Intent(activity, FavoritesActivity.class));
                activity.overridePendingTransition(0, 0);
                return true;
            } else if (itemId == R.id.nav_notifications && !(activity instanceof NotificationsActivity)) {
                activity.startActivity(new Intent(activity, NotificationsActivity.class));
                activity.overridePendingTransition(0, 0);
                return true;
            } else if (itemId == R.id.nav_home && !(activity instanceof MainActivity)) {
                activity.startActivity(new Intent(activity, MainActivity.class));
                activity.overridePendingTransition(0, 0);
                return true;
            } else if (itemId == R.id.nav_random && !(activity instanceof RandomMenuActivity)) {
                activity.startActivity(new Intent(activity, RandomMenuActivity.class));
                activity.overridePendingTransition(0, 0);
                return true;
            } else if (itemId == R.id.nav_settings && !(activity instanceof SettingsActivity)) {
                activity.startActivity(new Intent(activity, SettingsActivity.class));
                activity.overridePendingTransition(0, 0);
                return true;
            }

            return false;
        });
    }
}
