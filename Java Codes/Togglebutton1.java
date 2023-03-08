package com.example.salinivinekari_a58;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Togglebutton1 extends AppCompatActivity {
    ToggleButton t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebutton1);

        t1=findViewById(R.id.toggleButton);

    }

    public void ChangeToggle(View view) {
        if(t1.isChecked())
        {
            Toast.makeText(this, "ON", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "OFF", Toast.LENGTH_SHORT).show();
        }
    }
}