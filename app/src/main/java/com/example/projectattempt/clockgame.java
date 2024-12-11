package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class clockgame extends AppCompatActivity {
Button geri;
ImageButton btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clockgame);
        geri=findViewById(R.id.saatgeri);

        final Animation animation2=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clock);
        final Animation animation3=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clock1);
        final Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        final Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.trs);
        final ImageButton start1=(ImageButton) findViewById(R.id.gm1);
        btn1=findViewById(R.id.gm2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            btn1.startAnimation(animation2);
            }
        });
        btn2=findViewById(R.id.gm3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.startAnimation(animation3);
            }
        });
        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start1.startAnimation(animation1);
            }
        });

        final ImageView imageView=(ImageView) findViewById(R.id.imageView3);
        final ImageButton start=(ImageButton) findViewById(R.id.gm);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start.startAnimation(animation);
            }
        });
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(back);
            }
        });
    }
}