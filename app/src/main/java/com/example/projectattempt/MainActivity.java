package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLData;


public class MainActivity extends AppCompatActivity {

EditText username,password,repassword;
Button signup,signin;
DBHelper DB;

    @SuppressLint("SQLiteString")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    username=findViewById(R.id.username);
    password=findViewById(R.id.password);
    repassword=findViewById(R.id.repassword);
    signin=findViewById(R.id.btnsignin);
    signup=findViewById(R.id.btnsignup);
    DB=new DBHelper(this);
    signup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String user=username.getText().toString();
            String pass=password.getText().toString();
            String repass=repassword.getText().toString();

            if (user.equals("")||pass.equals("")||repass.equals(""))
                Toast.makeText(MainActivity.this,"Tüm alanları doldurun",Toast.LENGTH_SHORT).show();
            else {
                   if (pass.equals(repass)){
                       Boolean checkuser=DB.checkusername(user);
                       if (checkuser==false){
                           Boolean insert=DB.insertData(user,pass);
                           if (insert==true){
                               Toast.makeText(MainActivity.this,"Başarıyla kayıt yapıldı",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                                startActivity(intent);


                               }
                           else {

                               Toast.makeText(MainActivity.this,"hata",Toast.LENGTH_SHORT).show();

                           }
                       }
                       else {
                           Toast.makeText(MainActivity.this,"Böyle Bir Kullanıcı Zaten Var",Toast.LENGTH_SHORT).show();
                       }
                   }else {
                       Toast.makeText(MainActivity.this,"Şifreler Eşleşmiyor",Toast.LENGTH_SHORT).show();

                   }
            }

        }
    });
    signin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(intent);

        }
    });





    }
}