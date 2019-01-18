package com.example.msi.cv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class end extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
        public void project (View view){

            Intent project = new Intent(this,project.class);
            startActivity(project);
        }

        public void contact (View view){

            Intent contact = new Intent(this,contak.class);
            startActivity(contact);
        }
}
