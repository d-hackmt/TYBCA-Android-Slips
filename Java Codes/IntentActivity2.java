package com.example.salinivinekari_a58;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IntentActivity2 extends AppCompatActivity {
    EditText tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        tv=findViewById(R.id.editText2);
        Intent i1=getIntent();
        Bundle b=i1.getExtras();
        String str=b.getString("val2");
        String str1=b.getString("val1");
        //tv.setText(str);
      tv.setText(str1);
       // Toast.makeText(this, ""+str, Toast.LENGTH_SHORT).show();
       Toast.makeText(this, ""+str1, Toast.LENGTH_SHORT).show();
    }
}