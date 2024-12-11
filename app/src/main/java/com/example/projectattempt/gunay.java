package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class gunay extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
Button d1,d2,d3,d4,d5,d6,d7;
Button bck,rst;
Integer num=0;
TextView txt,txt1,deneyim;
ImageView calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunay);
        txt=findViewById(R.id.txt);
        calendar=findViewById(R.id.imageView4);
        b8=findViewById(R.id.btn8);
        deneyim=findViewById(R.id.dnym);
        rst=findViewById(R.id.reset);
        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=0;
                deneyim.setText(String.valueOf(num));
                txt1.setText("HAFTANIN GÜNÜ");
                calendar.setImageResource(R.drawable.img_6);


            }
        });
        b9=findViewById(R.id.btn9);
        b10=findViewById(R.id.btn10);
        b11=findViewById(R.id.btn11);
        b12=findViewById(R.id.btn12);
        b1=findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                deneyim.setText(String.valueOf(num));
                calendar.setImageResource(R.drawable.img_7);
            }
        });
        b2=findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setImageResource(R.drawable.img_8);
                num++;
                deneyim.setText(String.valueOf(num));
            }

        });
        b3=findViewById(R.id.btn3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setImageResource(R.drawable.img_9);
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        b4=findViewById(R.id.btn4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setImageResource(R.drawable.img_10);
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        b5=findViewById(R.id.btn5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setImageResource(R.drawable.img_11);
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        b6=findViewById(R.id.btn6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               calendar.setImageResource(R.drawable.img_12);
                num++;
                deneyim.setText(String.valueOf(num));

            }
        });
        b7=findViewById(R.id.btn7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              calendar.setImageResource(R.drawable.img_27);
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setImageResource(R.drawable.img_28);
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setImageResource(R.drawable.img_29);
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setImageResource(R.drawable.img_30);
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar.setImageResource(R.drawable.img_31);
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              calendar.setImageResource(R.drawable.img_32);
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        txt1=findViewById(R.id.textView13);
        d1=findViewById(R.id.button9);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("PAZARTESİ");
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        d2=findViewById(R.id.button10);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("SALI");
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        d3=findViewById(R.id.button11);
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("ÇARŞAMBA");
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        d4=findViewById(R.id.button12);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("PERŞEMBE");
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        d5=findViewById(R.id.button13);
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("CUMA");
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        d6=findViewById(R.id.button14);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("CUMARTESİ");
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        d7=findViewById(R.id.button15);
        d7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("PAZAR");
                num++;
                deneyim.setText(String.valueOf(num));
            }
        });
        bck=findViewById(R.id.button16);
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}