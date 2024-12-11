package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class yon extends AppCompatActivity {
    ImageButton forward,back,right,left;
    Button anasayfa,rst;
    TextView yon,deneyim;
    Integer num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yon);
        yon=findViewById(R.id.yn);
        deneyim=findViewById(R.id.sayi);
        forward=findViewById(R.id.aup);
        rst=findViewById(R.id.reset1);
        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=0;
                deneyim.setText(String.valueOf(num));
                yon.setText("");
            }
        });
        anasayfa=findViewById(R.id.anasyf);
        anasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ana=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(ana);
            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yon.setText("Forward");
                num++;
                deneyim.setText(String.valueOf(num));


            }
        });
        back=findViewById(R.id.down);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yon.setText("BACK");
                num++;
                deneyim.setText(String.valueOf(num));

            }
        });
        right=findViewById(R.id.frw);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yon.setText("RIGHT");
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        left=findViewById(R.id.bck);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yon.setText("LEFT");
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
    }



}