package com.example.salman.myservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyServiceTest extends Service {
    private static final String TAG = "MTAG";

    public MyServiceTest() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");


        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: service started");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // return super.onStartCommand(intent, flags, startId);
        Log.d(TAG, "onStartCommand: Service Started");

        return START_STICKY; // android start service again if the resources again become available(eg memory)
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
