package com.aliomercik.mobildefter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splashscreen extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        textView = findViewById(R.id.textview);
        imageView = findViewById(R.id.imageViewm);

        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        imageView.startAnimation(animation);
        textView.startAnimation(animation);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(Splashscreen.this,Login_screen.class);
                    startActivity(intent);
                    finish();
                    overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
                }
            },6000);

    }
}