package com.demo.cd_sm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerColors;
    private TextView textViewDescriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerColors = findViewById(R.id.spinnerOfColors);
        textViewDescriptions = findViewById(R.id.textViewDescriptions);
    }

    public void descriptColor(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String description = getColorByPos(position);
        textViewDescriptions.setText(description);
    }

    public String getColorByPos(int position){
        String[] description = getResources().getStringArray(R.array.colors_descriptions);
        return description[position];
    }
}