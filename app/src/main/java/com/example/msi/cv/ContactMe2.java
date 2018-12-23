package com.example.msi.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

public class ContactMe2 extends AppCompatActivity {

    double edit1, edit2 ,edit3 ,edit4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_me2);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
    }
    public void back1 (View view){

        Intent back3 = new Intent(this,Beranda.class);
        startActivity(back3);


    }

    public void submit(View view){

            Intent submit1 = new Intent(this,Beranda.class);
            startActivity(submit1);

            Toast.makeText(ContactMe2.this, "Your Message Has Been Send.",
                    Toast.LENGTH_LONG).show();

    }
}
