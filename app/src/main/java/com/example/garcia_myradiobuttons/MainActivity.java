package com.example.garcia_myradiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear;
    RadioGroup radioGroup;
    RadioButton radioButtonHamburger;
    RadioButton radioButtonPizza;
    RadioButton radioButtonCarbonara;
    Button buttonOK;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.linear);
        radioGroup = findViewById(R.id.radioGroup);
        radioButtonHamburger = findViewById(R.id.radioButtonHamburger);
        radioButtonPizza = findViewById(R.id.radioButtonPizza);
        radioButtonCarbonara = findViewById(R.id.radioButtonCarbonara);
        buttonOK = findViewById(R.id.buttonOK);
        imageView = findViewById(R.id.imageView);

        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioButtonHamburger.isChecked()) {
                    imageView.setImageResource(R.drawable.hamburger);
                } if (radioButtonPizza.isChecked()) {
                    imageView.setImageResource(R.drawable.pizza);
                } if (radioButtonCarbonara.isChecked()) {
                    imageView.setImageResource(R.drawable.carbonara);
                }
            }
        });
    }
}