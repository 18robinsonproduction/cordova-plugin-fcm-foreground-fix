package com.gae.scaffolder.plugin;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseInstanceIDService extends FirebaseMessagingService  {

    private static final String TAG = "FCMPlugin";

    @Override
    public void onNewToken(String token) { //Added onNewToken method
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        FCMPlugin.sendTokenRefresh( refreshedToken );
    }
}
