package com.alialfayed.buttononclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // add button
    private Button btnChangeText , btnGoToActivity ;
    // add Text
    private TextView txtChange ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChangeText = findViewById(R.id.btnChnageText);
        txtChange = findViewById(R.id.txtChagne);
        btnGoToActivity = findViewById(R.id.btnGoToActivity);
        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtChange.setText(R.string.textChanged);
                btnGoToActivity.setVisibility(View.VISIBLE);
                btnChangeText.setVisibility(View.GONE);
            }
        });

        btnGoToActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
