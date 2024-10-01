package com.example.usertinterraction;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.usertinterraction.databinding.ActivityMainBinding;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonToast.setOnClickListener(view -> {
            Toast.makeText(this, "Merhaba", Toast.LENGTH_SHORT).show();
        });

        binding.buttonSnackbar.setOnClickListener(view -> {
            Snackbar.make(view,"Merhaba",Snackbar.LENGTH_LONG)
                    .setAction("Evet",view1 -> {

                        Snackbar.make(view,"Hi",Snackbar.LENGTH_LONG)

                    .setBackgroundTint(Color.WHITE)
                    .setTextColor(Color.BLUE);
                    }).show();
        });

        binding.buttonDialog.setOnClickListener(view -> {
            new MaterialAlertDialogBuilder(this)
                    .setTitle("Başlık")
                    .setMessage("Mesaj")
                    .setPositiveButton("Tamam",(d,i)->{
                        Toast.makeText(this, "TAMAM", Toast.LENGTH_SHORT).show();
                    }).setNegativeButton("İptal",((d, i) -> {
                        Toast.makeText(this, "İPTAL", Toast.LENGTH_SHORT).show();
                    })).show();
        });


    }
}