package com.example.msi.cv;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


        @Override
    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            TextView text2 = (TextView) findViewById(R.id.text2);
            text2.setText("My name is Fachrizal Achmad Zulfikar Mursalin. I'm 19 years old when i make this Application on Mei 2017. I have much hobby in my life, playing video games is one of them. I'm in collage in Bandung City for now. Although i was bron in Makassar.\n\nSo what am i doing in Bandung? Why i must go to collage in Bandung? What Campus i has chose to collage in Bandung? What is my another hobby? Did i have a girlfriend? Just click that button below. ");
        }

    public void pencil (View view){

        Intent ContactMe = new Intent(this,ContactMe.class);
        startActivity(ContactMe);
    }

    public void readmore (View view){

        Intent readmore = new Intent(this,Beranda.class);
        startActivity(readmore);
    }
}

