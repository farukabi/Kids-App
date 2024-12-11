package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class dikkatoyunu extends AppCompatActivity {
Button anim,geri;
TextView txt;
ImageView resim,resim1,resim2,resim3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dikkatoyunu);
        anim=findViewById(R.id.button18);
        resim=findViewById(R.id.imageView5);
        txt=findViewById(R.id.textView14);
        resim1=findViewById(R.id.imageView6);
        resim2=findViewById(R.id.imageView7);
        resim3=findViewById(R.id.imageView8);
        final Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.an3);

        final Animation animation2=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.an);
        final Animation animation3=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.an1);
        final Animation animation4=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.an2);
        anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resim.startAnimation(animation);
                resim1.startAnimation(animation2);
                resim2.startAnimation(animation4);
                resim3.startAnimation(animation3);
                txt.setVisibility(View.INVISIBLE);


            }
        });
        geri=findViewById(R.id.back1);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}