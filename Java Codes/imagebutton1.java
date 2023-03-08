package com.example.salinivinekari_a58;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class imagebutton1 extends AppCompatActivity {
    ImageButton imgbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagebutton1);
        imgbutton=(ImageButton) findViewById(R.id.imageButton);
        imgbutton.setOnClickListener(this::onClick);
    }


    public void onClick(View view)
    {
        Toast.makeText(getApplicationContext(), "Your dowload is resumed", Toast.LENGTH_SHORT).show();
    }


}