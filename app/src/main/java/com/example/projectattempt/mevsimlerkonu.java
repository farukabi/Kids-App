package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mevsimlerkonu extends AppCompatActivity {
Button oyun,geri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevsimlerkonu);
    geri=findViewById(R.id.geri);
    geri.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });
    oyun=findViewById(R.id.oyn);
    oyun.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent oyun=new Intent(mevsimlerkonu.this,mevsimleroyun.class);
            startActivity(oyun);

        }
    });
    }

}