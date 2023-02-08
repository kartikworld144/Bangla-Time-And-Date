package com.kartik.bangladate;

import static java.util.Calendar.AM;
import static java.util.Calendar.PM;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView dateTextView,dateTextView2,dateTextView3,dateTextView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTextView = findViewById(R.id.date_text_view);
        dateTextView2 = findViewById(R.id.date_text_view2);
        dateTextView3 = findViewById(R.id.date_text_view3);
        dateTextView4 = findViewById(R.id.date_text_view4);
        SimpleDateFormat bngFormat = new SimpleDateFormat("dd MMMM yyyy EEEE", new Locale("bn", "BD"));
        SimpleDateFormat bngFormatTime = new SimpleDateFormat(getString(R.string.bang_time_format), new Locale("bn", "BD"));
        SimpleDateFormat bngAmFormat = new SimpleDateFormat("a", new Locale("bn", "BD"));

        Calendar cal = Calendar.getInstance();
        dateTextView.setText(bngFormat.format(cal.getTime()));
        dateTextView3.setText(bngFormatTime.format(cal.getTime())+" মিনিট");
        dateTextView4.setText(bngAmFormat.format(cal.getTime()));

        AM_PM();




    }
    private void AM_PM() {

        String a = dateTextView4.getText().toString();
        String am="AM";
        String pm=getString(R.string.PM);

        if (a!=am) {
            a =getString(R.string.AM);
            dateTextView2.setText("এখন  সময়  "+a);
        }
        else {
            a = pm;
            dateTextView2.setText("এখন  সময়  "+a);
        }


    }


}



