package com.example.asthaproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Submitdata_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sumitdata);

        Intent from_main = getIntent();
        String name1 = from_main.getStringExtra("name");
        String email = from_main.getStringExtra("email");
        String password = from_main.getStringExtra("password");

        TextView txtrno = findViewById(R.id.txtrno);

        txtrno.setText("Student name :" + name1 + "\n");
        txtrno.append("email-id :" + email + "\n");
        txtrno.append("Password :" + password + "\n");
    }
}