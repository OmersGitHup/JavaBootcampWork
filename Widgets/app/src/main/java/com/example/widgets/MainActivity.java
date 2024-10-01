package com.example.widgets;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.widgets.databinding.ActivityMainBinding;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private boolean kontrol=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.readButton.setOnClickListener(view -> {
            binding.textViewResult.setText(binding.editTextText.getText().toString());
        });

        binding.buttonResim1.setOnClickListener(view -> {
            binding.imageView.setImageResource(R.drawable.baseline_mood_24_picture);
        });

        binding.buttonResim2.setOnClickListener(view -> {
            binding.imageView.setImageResource(R.drawable.baseline_mood_bad_24);
        });

        binding.switch1.setOnCheckedChangeListener(((compoundButton, isChecked) -> {
            if (isChecked){
                Log.e("Result" , "Switch:on");
            }else {
                Log.e("Result","Switch:off");
            }
        }));

        binding.buttonShow.setOnClickListener(view -> {
            Log.e("Result","Switch Statu"+binding.switch1.isChecked());
        });


        binding.toggleButton.addOnButtonCheckedListener(((group, checkedId, isChecked) -> {
            if (kontrol){
                Button secilenButton=findViewById(binding.toggleButton.getCheckedButtonId());
                String buttonWrite=secilenButton.getText().toString();
                Log.e("Result sTATU","Toggle Statu"+buttonWrite);
            }
        }));

        binding.buttonShow.setOnClickListener(view -> {

        });

        ArrayList<String> countries=new ArrayList<>();
        countries.add("Türkiye");
        countries.add("Italy");
        countries.add("Japan");
//
//        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.ListItem,countries);
//        binding.li.setAdapter(arrayAdapter);


        binding.textViewSlider.setText("Slider : "+binding.slider.getProgress());
        binding.slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                binding.textViewSlider.setText("Slider : "+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}