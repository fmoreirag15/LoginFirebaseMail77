package com.example.loginfirebasemail77;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class editarpaciente extends AppCompatActivity {
    EditText nameTutor,firstname,lastname,birthname,imagBase64,decivename,macadress;
    TextView gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editarpaciente);
        nameTutor=findViewById(R.id.EditNameTutoor);
        firstname=findViewById(R.id.Editarrfirtname);
        lastname=findViewById(R.id.Editarrlastname);
        birthname=findViewById(R.id.EditarrDate);
        gender=findViewById(R.id.EditarrtextView5);
        imagBase64=findViewById(R.id.Editarrimg);
        decivename=findViewById(R.id.EditarrDecivename);
        macadress=findViewById(R.id.EditarrMac);

        String idpatient=getIntent().getExtras().getString("idpatient");
        nameTutor.setText(getIntent().getExtras().getString("nameTutor"));
        firstname.setText(getIntent().getExtras().getString("firstname"));
        lastname.setText(getIntent().getExtras().getString("lastname"));
        birthname.setText(getIntent().getExtras().getString("birthname"));
        gender.setText(getIntent().getExtras().getString("gender"));
        imagBase64.setText(getIntent().getExtras().getString("imagBase64"));
        decivename.setText(getIntent().getExtras().getString("decivename"));
        macadress.setText(getIntent().getExtras().getString("macadress"));

    }
}