package com.example.utilisationdesfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton b1;
    private ImageButton b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivitys2();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivitys1();
            }
        });
    }

    private void startActivitys2() {
        Intent activity2Intent = new Intent(getApplicationContext(), MyDynamiqueFragment.class);
        startActivity(activity2Intent);
    }


    private void startActivitys1() {
        Intent activity2Intent = new Intent(getApplicationContext(), MyStatiqueFragment.class);
        startActivity(activity2Intent);
    }
}
