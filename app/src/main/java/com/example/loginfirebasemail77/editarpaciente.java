package com.example.loginfirebasemail77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class editarpaciente extends AppCompatActivity {
    TextView nameTutor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editarpaciente);
        nameTutor=findViewById(R.id.EditarNameTutoor);
        nameTutor.setText(getIntent().getExtras().getString("idpatient"));
        nameTutor.setText(getIntent().getExtras().getString("idpatient"));
        nameTutor.setText(getIntent().getExtras().getString("idpatient"));
        nameTutor.setText(getIntent().getExtras().getString("idpatient"));
        nameTutor.setText(getIntent().getExtras().getString("idpatient"));
        nameTutor.setText(getIntent().getExtras().getString("idpatient"));
        nameTutor.setText(getIntent().getExtras().getString("idpatient"));
        nameTutor.setText(getIntent().getExtras().getString("idpatient"));

    }
}