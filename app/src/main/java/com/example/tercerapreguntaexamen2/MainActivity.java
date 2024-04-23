package com.example.tercerapreguntaexamen2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageButton btnE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnE=findViewById(R.id.btnE);
    }

    public void evento(View view) {
        if(view.getId()==R.id.btnE){
            if(view.getId()==R.id.btnE){
                Intent intent = new Intent(MainActivity.this, FiguraEstrella.class);
                startActivity(intent);
            }



        }
    }
}