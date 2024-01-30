package com.example.andy.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int view = R.layout.activity_main;
    TextView textView, textViewg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(view);
        final LinearLayout parent = findViewById(R.id.parent);
        textView = findViewById(R.id.text);
        textViewg = findViewById(R.id.textg);
        final MediaPlayer cur = MediaPlayer.create(this,R.raw.currencymp);
        textView.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            cur.start();
                                            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("org.tensorflow.lite.examples.classification");
                                            if (launchIntent != null) {
                                                startActivity(launchIntent);
                                            } else  {
                                                Toast.makeText(MainActivity.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                                            }
                                        }
                                    });
        final MediaPlayer gro = MediaPlayer.create(this,R.raw.grocerry);
        textViewg.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     gro.start();
                                                     Intent launchIntent = getPackageManager().getLaunchIntentForPackage("org.tensorflow.lite.examples.classifi");
                                                     if (launchIntent != null) {
                                                         startActivity(launchIntent);
                                                     } else  {
                                                         Toast.makeText(MainActivity.this, "There is no package available in android", Toast.LENGTH_LONG).show();
                                                     }
                                                 }
                                             }
                );
    }
}