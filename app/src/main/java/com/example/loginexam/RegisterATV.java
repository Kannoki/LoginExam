package com.example.loginexam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class RegisterATV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_atv);

        TextView name = (TextView) findViewById(R.id.Rname);
        TextView email = (TextView) findViewById(R.id.Remail);
        TextView password = (TextView) findViewById(R.id.Rpassword);

        Switch gender =  (Switch) findViewById(R.id.switch1);
        TextView showgender = (TextView) findViewById(R.id.abc);
            showgender.setText("Male");




        TextView bday = (TextView) findViewById(R.id.Rbirthday);
        Button chose = (Button) findViewById(R.id.button5);

        Button res = (Button) findViewById(R.id.button2);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterATV.this,Outdata.class);
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("password",password.getText().toString());
                intent.putExtra("bday",bday.getText().toString());
                if (gender.isChecked()){
                    intent.putExtra("gender","Female");

                } else {
                    intent.putExtra("gender","Male");
                }
                startActivity(intent);
            }
        });
        TextView lg = (TextView) findViewById(R.id.lgtxt);
        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterATV.this,MainActivity.class);
                startActivity(intent);
            }
        });


        chose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);

                DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {

                        String datetime = dayOfMonth + "/" + monthOfYear + "/" + year;
                        bday.setText(datetime);
                    }
                };
                DatePickerDialog datePickerDialog = new DatePickerDialog(RegisterATV.this,
                        android.R.style.Theme_Holo_Light_Dialog_NoActionBar,
                        dateSetListener, year, month, day);

// Show
                datePickerDialog.show();


            }
        });

        gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gender.isChecked()){
                    showgender.setText("Female");

                } else {
                    showgender.setText("Male");
                }
            }
        });

    }

}