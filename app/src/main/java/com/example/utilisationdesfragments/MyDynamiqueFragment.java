package com.example.utilisationdesfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MyDynamiqueFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dynamique_fragment);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.Container, new DynamiqueFragment()).commit();
    }
}
