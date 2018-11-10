package com.example.vijaylaxmi.assignment;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
            Toast.makeText(context,"Connectivity Changed", Toast.LENGTH_SHORT).show();
        }

    }

}
