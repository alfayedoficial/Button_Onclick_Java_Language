package com.alialfayed.buttononclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    TextView colorText;
    Button btnRed,btnGreen,btnYellow,btnOrange,btnBlue;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        colorText = findViewById(R.id.colorText);
        btnRed = findViewById(R.id.btnRed);
        btnBlue = findViewById(R.id.btnBlue);
        btnOrange = findViewById(R.id.btnOrange);
        btnYellow = findViewById(R.id.btnYellow);
        btnGreen = findViewById(R.id.btnGreen);
        layout = findViewById(R.id.backgroundActivity);

        btnRed.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
        btnOrange.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnYellow.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnRed:
                layout.setBackgroundColor(getResources().getColor(R.color.red));
                colorText.setText(getText(R.string.Red));
                colorText.setTextColor(Color.WHITE);
                break;
            case R.id.btnGreen:
                layout.setBackgroundColor(getResources().getColor(R.color.green));
                colorText.setText(getText(R.string.Green));
                colorText.setTextColor(Color.WHITE);
                break;
            case R.id.btnYellow:
                layout.setBackgroundColor(getResources().getColor(R.color.yellow));
                colorText.setText(getText(R.string.Yello));
                colorText.setTextColor(Color.WHITE);
                break;
            case R.id.btnOrange:
                layout.setBackgroundColor(getResources().getColor(R.color.orange));
                colorText.setText(getText(R.string.Orange));
                colorText.setTextColor(Color.WHITE);
                break;
            case R.id.btnBlue:
                layout.setBackgroundColor(getResources().getColor(R.color.blue));
                colorText.setText(getText(R.string.Blue));
                colorText.setTextColor(Color.WHITE);
                break;

        }
    }
}
