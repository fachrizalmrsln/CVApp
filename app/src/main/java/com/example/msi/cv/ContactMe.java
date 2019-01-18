package com.example.msi.cv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class ContactMe extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_me);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
    }

    public void back1 (View view){

        Intent back1 = new Intent(this,MainActivity.class);
        startActivity(back1);


    }

    public void submit(View view){

            Intent submit1 = new Intent(this,MainActivity.class);
            startActivity(submit1);

            Toast.makeText(ContactMe.this, "Your Message Has Been Send.",
                    Toast.LENGTH_LONG).show();



    }
}
