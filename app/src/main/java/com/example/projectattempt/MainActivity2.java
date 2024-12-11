package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
Button back,clok,mvs,carpim,gun,dikkat,yonb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        back=findViewById(R.id.button5);
        clok=findViewById(R.id.clk);
        mvs=findViewById(R.id.button);
        gun=findViewById(R.id.button3);
        yonb=findViewById(R.id.yon);
        yonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,yon.class);
                startActivity(intent);
            }
        });
        dikkat=findViewById(R.id.button19);
        dikkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dikkat=new Intent(MainActivity2.this,dikkatoyunu.class);
                startActivity(dikkat);
            }
        });
        carpim=findViewById(R.id.button4);
        gun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gun=new Intent(MainActivity2.this,gunay.class);
                    startActivity(gun);
            }
        });
        carpim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent carp=new Intent(MainActivity2.this,carpim.class);
                startActivity(carp);
            }
        });
        mvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mevsim=new Intent(MainActivity2.this,mevsimlerkonu.class);
                startActivity(mevsim);
            }
        });
        clok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clok=new Intent(MainActivity2.this,clock.class);
                startActivity(clok);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}