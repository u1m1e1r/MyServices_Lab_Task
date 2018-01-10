package com.example.salman.myservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";
    Button startService;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().register(this);
        startService = findViewById(R.id.btnStartService);
        textView = findViewById(R.id.textView);

        startService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this,MyServiceTest.class);
                Intent intent = new Intent(MainActivity.this, MyIntentService.class);
                startService(intent);   // start service
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(CustomMessageEvent event) {

        Log.d(TAG, "onEvent: ");
        Integer i = event.getNumber();
        textView.setText(i.toString().trim());

    }


}

