package com.example.notificationtest.activity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import androidx.core.app.NotificationCompat;

import com.example.notificationtest.R;
import com.example.notificationtest.framework.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private static final int NOTIFICATION_TO_ACTIVITY = 1;

    @BindView(R.id.send_notice_button)
    Button sendNoticeButton;

    private NotificationManager manager;
    private Notification notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    @OnClick(R.id.send_notice_button)
    public void onClick() {
        Intent intent = new Intent(this, NotificationActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 , intent, 0);
        notification = new NotificationCompat.Builder(this, "AppTestNotificationId")
                .setContentTitle("This is content title")
                .setContentText("This is content text")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build();

        manager.notify(NOTIFICATION_TO_ACTIVITY, notification);
    }
}