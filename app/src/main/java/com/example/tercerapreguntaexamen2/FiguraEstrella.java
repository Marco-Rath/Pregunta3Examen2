package com.example.tercerapreguntaexamen2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class FiguraEstrella extends AppCompatActivity {
    ImageView imgEstrella;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura_estrella);
         imgEstrella = findViewById(R.id.imgEstrella);
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        imgEstrella.startAnimation(scaleAnimation);
    }

}