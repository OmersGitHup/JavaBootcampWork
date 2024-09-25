package com.example.workarchitecture;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.workarchitecture.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.goDetail.setOnClickListener(view ->

        {
            Intent intent=new Intent(MainActivity.this,DetailActivity.class);
            intent.putExtra("name","ad");
            intent.putExtra("age",23);
            intent.putExtra("height",1.78);
            intent.putExtra("job","football player");
            startActivity(intent);
            binding.textViewTitle2.setText("Hi");
        });




    }
}