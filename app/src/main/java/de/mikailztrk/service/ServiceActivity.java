package de.mikailztrk.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity implements View.OnClickListener{

    Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        start = (Button)findViewById(R.id.button);
        stop = (Button)findViewById(R.id.button2);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show();
                startService(new Intent(this, MusikService.class));
                break;

            case R.id.button2:
                Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
                stopService(new Intent(this, MusikService.class));
                break;
        }
    }
}
