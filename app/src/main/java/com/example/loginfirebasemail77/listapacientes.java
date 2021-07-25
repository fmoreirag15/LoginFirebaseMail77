package com.example.loginfirebasemail77;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.CalendarContract;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.loginfirebasemail77.modelos.paciente;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class listapacientes extends AppCompatActivity {

    List<paciente>  list=new ArrayList<paciente>();
    ArrayAdapter<paciente> arrayAdapterPaciente;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    ListView listaView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listapacientes);
        listaView=findViewById(R.id.listaComponentes);
        inicializarFirebase();
        listapaciente();
    }

    private void listapaciente() {
        databaseReference.child("Paciente").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();
                for (DataSnapshot objShaptshot : snapshot.getChildren())
                {
                    paciente p= objShaptshot.getValue(paciente.class);
                    list.add(p);

                    arrayAdapterPaciente= new ArrayAdapter<paciente>(listapacientes.this, android.R.layout.simple_list_item_1, list);
                    listaView.setAdapter(arrayAdapterPaciente);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase= FirebaseDatabase.getInstance();
        firebaseDatabase.setPersistenceEnabled(true);
        databaseReference=firebaseDatabase.getReference();
    }
}