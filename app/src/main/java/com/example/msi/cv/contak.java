package com.example.msi.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class contak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contak);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void back (View view){

        Intent back = new Intent(this,end.class);
        startActivity(back);
    }

    public void send (View view){

        Intent send = new Intent (this,MainActivity.class);
        startActivity(send);

        Toast.makeText(contak.this, "Your Email Has Been Send. Thank You For Using This App",
                Toast.LENGTH_LONG).show();
    }
}
