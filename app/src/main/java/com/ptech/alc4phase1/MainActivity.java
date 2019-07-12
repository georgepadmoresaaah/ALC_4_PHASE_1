package com.ptech.alc4phase1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private Button button_about_alc;
    private Button button_profile;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("ALC 4 PHASE 1");


        context=this;


        button_about_alc = findViewById(R.id.button_about_alc);
        button_profile = findViewById(R.id.button_profile);


        button_about_alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, aboutalc.class);
                startActivity(intent);

            }
        });

        button_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, my_profile.class);
                startActivity(intent);

            }
        });


    }
}
