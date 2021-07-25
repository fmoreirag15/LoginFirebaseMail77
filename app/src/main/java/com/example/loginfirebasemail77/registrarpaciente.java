package com.example.loginfirebasemail77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginfirebasemail77.modelos.paciente;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class registrarpaciente extends AppCompatActivity {

    EditText  nameTutor, firstname, lastname, birthname, gender, imagBase64, decivename,macadress;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
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
        inicializarFirebase();
    }
    public void addFirebasePaciente(View view)
    {
        paciente p=new paciente();
        p.setIdpatient(UUID.randomUUID().toString());
        p.setNameTutor(nameTutor.getText().toString());
        p.setFirstname(firstname.getText().toString());
        p.setLastname(lastname.getText().toString());
        p.setBirthname(birthname.getText().toString());
        p.setGender(gender.getText().toString());
        p.setImagBase64(imagBase64.getText().toString());
        p.setDecivename(decivename.getText().toString());
        p.setMacadress(macadress.getText().toString());
        p.setState("True");

        databaseReference.child("Paciente").child(p.getIdpatient()).setValue(p);

        Toast.makeText(this, "Agregado", Toast.LENGTH_SHORT).show();

    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase=FirebaseDatabase.getInstance();
        firebaseDatabase.setPersistenceEnabled(true);
        databaseReference=firebaseDatabase.getReference();
    }
}