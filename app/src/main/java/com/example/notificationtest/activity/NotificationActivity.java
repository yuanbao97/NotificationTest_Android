package com.example.notificationtest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.os.Bundle;

import com.example.notificationtest.R;

public class NotificationActivity extends AppCompatActivity {

    private static final int NOTIFICATION_TO_ACTIVITY = 1;

    private NotificationManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
//        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        manager.cancel(NOTIFICATION_TO_ACTIVITY);
    }
}