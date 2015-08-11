package com.mokelab.demo.installreferrer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Receiver for Install referrer
 */
public class ReferrerReceiver extends BroadcastReceiver {
    private static final String KEY_REFERRER = "referrer";

    @Override
    public void onReceive(Context context, Intent intent) {
        String referrer = intent.getStringExtra(KEY_REFERRER);
        sendConversion(referrer);
    }

    private void sendConversion(String referrer) {
        // send this referrer string to your server
        Log.v("Referrer", "referrer=" + referrer);
    }
}
