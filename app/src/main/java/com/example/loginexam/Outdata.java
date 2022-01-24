package com.example.loginexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Outdata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdata);

        TextView name = (TextView) findViewById(R.id.Oname);
        TextView email = (TextView) findViewById(R.id.OEmail);
        TextView password = (TextView) findViewById(R.id.OPassword);
        TextView gender = (TextView) findViewById(R.id.Ogender);
        TextView bday = (TextView) findViewById(R.id.Obirth);
        Intent intent = getIntent();

        name.setText(intent.getStringExtra("name"));
        email.setText(intent.getStringExtra("email"));
        password.setText(intent.getStringExtra("password"));
        gender.setText(intent.getStringExtra("gender"));
        bday.setText(intent.getStringExtra("bday"));

        Button btn1 = (Button) findViewById(R.id.button3);
        Button btn2 = (Button) findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Outdata.this,MainActivity.class);
                startActivity(intent1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Outdata.this,RegisterATV.class);
                startActivity(intent1);
            }
        });
    }
}