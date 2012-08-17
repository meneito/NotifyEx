package com.orjan.notifyex;

import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;


public class MainActivity extends Activity {


    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
    
   	 
        int icon = R.drawable.ic_launcher;

        long now = System.currentTimeMillis();
        Context context= getApplicationContext();
        Intent intent = new Intent(this,MainActivity.class);
      

   
    Notification notification = new Notification(icon, "HAARP-CORD", now);
    
    NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    
	PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
    
    notification.setLatestEventInfo(context, "Haarp-Cord", "PRaaaaaaa", pendingIntent);
    
    nm.notify(11,notification);
    
    
    }    
    
}
