package com.example.workarchitecture;

import android.app.Activity;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.workarchitecture.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String tookName=getIntent().getStringExtra("name");
        String tookJob=getIntent().getStringExtra("job");
        int tookAge=getIntent().getIntExtra("age",0);
        Double tookHeight=getIntent().getDoubleExtra("height",0);

        binding.textViewTitle.setText(tookName+" "+tookAge+" "+tookJob+" "+tookHeight);

    }
}