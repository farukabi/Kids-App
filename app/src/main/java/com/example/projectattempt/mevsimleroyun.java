package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class mevsimleroyun extends AppCompatActivity {
Button yaz,kis,ib,sb,rst,back;

ImageView image,image1,image2,image3;
TextView dny;
Integer n=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mevsimleroyun);
        dny=findViewById(R.id.kdny);
        kis=findViewById(R.id.kis);
    back=findViewById(R.id.back);
    ib=findViewById(R.id.ibah);
    sb=findViewById(R.id.sbah);
    image=findViewById(R.id.ks);
    image1=findViewById(R.id.yz);
    image2=findViewById(R.id.ib);
    image3=findViewById(R.id.sb);
    yaz=findViewById(R.id.don);
    rst=findViewById(R.id.rst);
    rst.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            n=0;
            dny.setText(String.valueOf(n));
            image.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image1.setVisibility(View.INVISIBLE);


        }
    });
    yaz.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            image.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image1.setVisibility(View.VISIBLE);
            n++;
            dny.setText(String.valueOf(n));
        }
    });
    kis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            image.setVisibility(View.VISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image1.setVisibility(View.INVISIBLE);
            n++;
            dny.setText(String.valueOf(n));


        }
    });
    sb.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            image.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.INVISIBLE);
            image3.setVisibility(View.VISIBLE);
            image1.setVisibility(View.INVISIBLE);
            n++;
            dny.setText(String.valueOf(n));
        }
    });
    ib.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            image.setVisibility(View.INVISIBLE);
            image2.setVisibility(View.VISIBLE);
            image3.setVisibility(View.INVISIBLE);
            image1.setVisibility(View.INVISIBLE);
            n++;
            dny.setText(String.valueOf(n));
        }
    });
    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(intent);
        }
    });
    }


}