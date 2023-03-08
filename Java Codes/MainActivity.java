package com.example.salinivinekari_a58;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1, chk2, chk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk1=findViewById(R.id.checkBox);
        chk2=findViewById(R.id.checkBox2);
        chk3=findViewById(R.id.checkBox3);
    }

    public void changeColor(View view) {
        try {

            if (chk1.isChecked() == true) {
                getWindow().getDecorView().setBackgroundColor(Color.RED);
            } else if (chk2.isChecked() == true) {
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            } else if (chk3.isChecked() == true) {
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            }
        }
        catch(Exception e)
        {
            Toast.makeText(this,e+"",Toast.LENGTH_LONG).show();
        }
    }
}