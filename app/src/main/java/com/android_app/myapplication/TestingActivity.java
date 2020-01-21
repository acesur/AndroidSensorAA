package com.android_app.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android_app.myapplication.model.Arithmetic;
import com.google.android.material.button.MaterialButton;

public class TestingActivity extends AppCompatActivity {
    private Button btnSum, btnSubtract, btnDivide;
    private EditText etFirst, etSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

       btnSum = findViewById(R.id.btnSum);
       btnSubtract = findViewById(R.id.btnSubtract);
       btnDivide = findViewById(R.id.btnDivide);

       btnSum.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Add();
           }
       });
    }
    private void Add(){
        float first = Float.parseFloat(etFirst.getText().toString().trim());
        float second = Float.parseFloat(etSecond.getText().toString().trim());
        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.add(first,second);

        Intent intent = new Intent(TestingActivity.this, OutputActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}
