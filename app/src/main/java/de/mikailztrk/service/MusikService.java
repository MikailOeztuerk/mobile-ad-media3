package de.mikailztrk.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MusikService extends Service {

    MediaPlayer player;

    public MusikService() {


    }

    public void onCreate() {
        player = MediaPlayer.create(this, R.raw.despacito2);
        player.setLooping(false);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        player.start();
        Toast.makeText(this, "PLAYER START", Toast.LENGTH_SHORT).show();

        return START_NOT_STICKY;
    }
        public void onDestroy() {
        player.stop();
        Toast.makeText(this, "PLAYER STOP", Toast.LENGTH_SHORT).show();


    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
