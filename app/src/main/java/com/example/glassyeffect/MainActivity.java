package com.example.glassyeffect;

import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout constraintLayout=findViewById(R.id.rela);

//        ImageView imageView=findViewById(R.id.imageView);

    }
}