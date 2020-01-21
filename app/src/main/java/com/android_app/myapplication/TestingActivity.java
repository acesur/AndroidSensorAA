package com.android_app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TestingActivity extends AppCompatActivity {
    private Button btnSum, btnSubtract, btnDivide;
    private EditText etFirst, etSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

       btnSum = findViewById(R.id.btnSum);
    }
}
