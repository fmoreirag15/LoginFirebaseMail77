package com.example.loginfirebasemail77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registrarpaciente extends AppCompatActivity {

    EditText  nameTutor, firstname, lastname, birthname, gender, imagBase64, decivename,macadress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarpaciente);
        nameTutor=findViewById(R.id.txtNameTutor);
        firstname=findViewById(R.id.firtname);
        lastname=findViewById(R.id.txtlastname);
        birthname=findViewById(R.id.editTextDate);
        gender=findViewById(R.id.firtname);
        imagBase64=findViewById(R.id.img);
        decivename=findViewById(R.id.txtDecivename);
        macadress=findViewById(R.id.txtMac);
        
    }

    public void addFirebasePaciente(View view)
    {

    }
}