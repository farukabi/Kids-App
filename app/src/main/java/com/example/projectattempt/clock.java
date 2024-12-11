package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class clock extends AppCompatActivity {
    Button game,geri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);
        final Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        final ImageView imageView=(ImageView) findViewById(R.id.imageView);
        geri=findViewById(R.id.satkonugeri);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        game=findViewById(R.id.button2);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(clock.this,clockgame.class);
                    startActivity(intent);
            }
        });
    }
}