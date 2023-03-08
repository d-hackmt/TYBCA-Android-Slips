package com.example.salinivinekari_a58;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;



public class datetimepicker1 extends AppCompatActivity {
    DatePicker datePicker;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datetimepicker1);

        datePicker=findViewById(R.id.datePicker);
        timePicker=findViewById(R.id.timePicker);

        Calendar c=Calendar.getInstance();

        datePicker.init(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                        Toast.makeText(getApplicationContext(),datePicker.getDayOfMonth()+"-"+datePicker.getMonth()+"-"+datePicker.getYear(),
                                Toast.LENGTH_SHORT).show();
                    }
        });
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                int hour;

                if(i>12)
                    hour=i-12;
                else
                    hour=i;
                Toast.makeText( getApplicationContext(),"Time is "+hour+":"+i1, Toast.LENGTH_SHORT).show();
            }
        });

    }
}