package com.example.asthaproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatCallback;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText name,emailaddress,user_password;
    AppCompatButton submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        emailaddress=findViewById(R.id.emailaddress);
        user_password=findViewById(R.id.user_password);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext = new Intent(MainActivity.this , Submitdata_activity.class);
                String name1=name.getText().toString();
                String email=emailaddress.getText().toString();
                String password=user_password.getText().toString();

                inext.putExtra("name",name1);
                inext.putExtra("email",email);
                inext.putExtra("password",password);
                startActivity(inext);

            }
        });
    }
}