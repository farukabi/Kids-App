package com.example.projectattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText username,password;
Button btnLogin;
DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=findViewById(R.id.username1);
        password=findViewById(R.id.password1);
        btnLogin=findViewById(R.id.btnsignin1);
        DB=new DBHelper(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(LoginActivity.this,"Tüm Alanları Doldurun",Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkuserpass=DB.checkusernamepassword(user,pass);
                    if (checkuserpass==true){
                        Toast.makeText(LoginActivity.this,"Başarrıyla Giriş Yapıldı",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(LoginActivity.this,"Böyle Bir Kullanıcı Bulunamadı",Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });
    }
}