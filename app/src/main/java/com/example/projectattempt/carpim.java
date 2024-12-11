package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class carpim extends AppCompatActivity {
Button hesap,hesap1,hesap2,hesap3,geri;
String inp,inp1,inp2;
Integer inp3,num=0;


TextView txt,txt1,txt2,txt3,skor;
EditText input,input1,input2,input3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpim);
        hesap=findViewById(R.id.button6);
        txt=findViewById(R.id.textView6);
        txt1=findViewById(R.id.textView11);
        input=findViewById(R.id.carp);
        input1=findViewById(R.id.carp1);
        input2=findViewById(R.id.edt);
        skor=findViewById(R.id.textView);
        txt2=findViewById(R.id.txt5);
        input3=findViewById(R.id.edt1);
        hesap3=findViewById(R.id.btn11);
        hesap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp3=Integer.parseInt(input3.getText().toString());
                if (inp3==63){
                    num++;
                    skor.setText(String.valueOf(num));
                    Toast.makeText(getApplicationContext(),"Doğru",Toast.LENGTH_LONG).show();
                }else {
                    num--;
                    skor.setText(String.valueOf(num));
                    Toast.makeText(getApplicationContext(),"Yanlış",Toast.LENGTH_LONG).show();
                }
            }
        });
        hesap2=findViewById(R.id.btn10);
        hesap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp2=String.valueOf(input2.getText().toString());
                if ("32".equals(inp2)){
                    num++;
                    skor.setText(String.valueOf(num));
                    Toast.makeText(getApplicationContext(),"Doğru",Toast.LENGTH_LONG).show();
                }else{
                    num--;
                    skor.setText(String.valueOf(num));
                    Toast.makeText(getApplicationContext(),"Yanlış",Toast.LENGTH_LONG).show();
                }
            }
        });
        geri=findViewById(R.id.button8);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        hesap1=findViewById(R.id.button7);
        txt3=findViewById(R.id.textView12);
        hesap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp1=String.valueOf(input1.getText().toString());
                if ("25".equals(inp1)){
                    num++;
                    skor.setText(String.valueOf(num));
                    Toast.makeText(getApplicationContext(),"Doğru",Toast.LENGTH_LONG).show();
                } else {

                    num--;
                    skor.setText(String.valueOf(num));
                    Toast.makeText(getApplicationContext(),"Yanlış",Toast.LENGTH_LONG).show();
                }

            }
        });

        hesap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            inp=String.valueOf(input.getText().toString());

            if ("42".equals(inp)){
                num++;
                skor.setText(String.valueOf(num));
                Toast.makeText(getApplicationContext(),"Doğru",Toast.LENGTH_LONG).show();
            }
            else {
                num--;
                skor.setText(String.valueOf(num));
                Toast.makeText(getApplicationContext(),"Yanlış",Toast.LENGTH_LONG).show();
            }

            }
        });

    }
}