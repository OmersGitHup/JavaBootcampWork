package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private StringBuilder displayValue = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        View.OnClickListener numberClickListener = view -> {
            Button clickedButton = (Button) view;
            
            displayValue.append(clickedButton.getText().toString());
            binding.textAction.setText(displayValue.toString());
        };


        binding.btn0.setOnClickListener(numberClickListener);
        binding.btn1.setOnClickListener(numberClickListener);
        binding.btn2.setOnClickListener(numberClickListener);
        binding.btn3.setOnClickListener(numberClickListener);
        binding.btn4.setOnClickListener(numberClickListener);
        binding.btn5.setOnClickListener(numberClickListener);
        binding.btn6.setOnClickListener(numberClickListener);
        binding.btn7.setOnClickListener(numberClickListener);
        binding.btn8.setOnClickListener(numberClickListener);
        binding.btn9.setOnClickListener(numberClickListener);

        binding.btnPlus.setOnClickListener(view -> {
            displayValue.append("+");
            binding.textAction.setText(displayValue.toString());
        });


        binding.btnResult.setOnClickListener(view -> {
            // Toplama işlemi yap
            String[] numbers = displayValue.toString().split("\\+");
            int sum = 0;
            for (String number : numbers) {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number);
                }
            }

            binding.textAction.setText(String.valueOf(sum));
        });



    }

}