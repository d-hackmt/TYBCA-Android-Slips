package com.example.salinivinekari_a58;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class IntentActivity1 extends AppCompatActivity {
    EditText t;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        t=findViewById(R.id.edittext1);
        b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Intent i=new Intent (IntentActivity1.this,IntentActivity2.class);
                i.putExtra("val2","Hello BCA");
                i.putExtra("val1",t.getText().toString());
                startActivity(i);
            }
        });
    }
}