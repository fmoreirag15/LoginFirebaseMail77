package com.example.loginfirebasemail77;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class animation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animation);


        //Agregar Animaciones
        Animation animation_1= AnimationUtils.loadAnimation(this, R.anim.deplazamiento_arriba);
        Animation animation_2= AnimationUtils.loadAnimation(this, R.anim.deplazamiento_abajo);


        TextView textView=findViewById(R.id.textView);
        TextView textView1=findViewById(R.id.textView5);
        ImageView imageView=findViewById(R.id.imageView);

        textView.setAnimation(animation_2);
        textView1.setAnimation(animation_2);
        imageView.setAnimation(animation_1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(animation.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        },4000);
    }
}