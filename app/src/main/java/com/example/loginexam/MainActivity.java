package com.example.loginexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView res = (TextView) findViewById(R.id.lgtxt);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegisterATV.class);
                startActivity(intent);
            }
        });
        TextView email = (TextView) findViewById(R.id.lgemail);
        TextView password = (TextView) findViewById(R.id.lgpassword);
        Button login = (Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Outdata.class);
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("password",password.getText().toString());
                startActivity(intent);
            }
        });
    }
}