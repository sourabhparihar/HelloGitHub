package com.example.semat.callbackhandingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hello World");
        Toast.makeText(this, "Hello " , Toast.LENGTH_LONG).show();
    }
}
