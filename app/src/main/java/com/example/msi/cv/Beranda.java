package com.example.msi.cv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class Beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void pencil (View view){

        Intent ContactMe = new Intent(this,ContactMe2.class);
        startActivity(ContactMe);
    }

    public void button2 (View view){

        Intent end = new Intent(this,end.class);
        startActivity(end);
    }
}
