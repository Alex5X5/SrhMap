package com.example.SrhMap.gui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.SrhMap.R;

public class MainActivity extends AppCompatActivity {

    private TextView titleText;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view); // 👈 links to the XML
    }
}
