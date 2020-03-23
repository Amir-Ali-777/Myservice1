package com.example.myservice1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {

    MediaPlayer mPlayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this,"service created",Toast.LENGTH_SHORT).show();
        mPlayer = MediaPlayer.create(this,R.raw.song1);
        mPlayer.setLooping(false);

    }

    @Override
    public void onStart(Intent intent, int startId) {
        Toast.makeText(this,"service started",Toast.LENGTH_SHORT).show();
        mPlayer.start();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"service destroyed",Toast.LENGTH_SHORT).show();
        mPlayer.stop();
    }
}
