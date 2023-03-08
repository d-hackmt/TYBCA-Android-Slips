package com.example.salinivinekari_a58;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup=findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        switch(i) {
                            case R.id.radioButton1:
                                getWindow().getDecorView().setBackgroundColor(Color.RED);
                                break;

                            case R.id.radioButton2:
                                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                                break;
                            case R.id.radioButton3:
                                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                                break;

                        }
                    }
                }
        );
    }
}