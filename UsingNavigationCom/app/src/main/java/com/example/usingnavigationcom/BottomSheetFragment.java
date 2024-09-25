package com.example.usingnavigationcom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usingnavigationcom.databinding.FragmentBottomSheetBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.snackbar.Snackbar;

public class BottomSheetFragment extends BottomSheetDialogFragment {

    private FragmentBottomSheetBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentBottomSheetBinding.inflate(inflater, container, false);
        binding.imageViewShare.setOnClickListener(view ->

        {
            Snackbar.make(view,"Shared",Snackbar.LENGTH_LONG).show();
        });

        binding.imageViewCopy.setOnClickListener(view ->
        {
            Snackbar.make(view,"Copy",Snackbar.LENGTH_LONG).show();
        });

        return binding.getRoot();
    }
}