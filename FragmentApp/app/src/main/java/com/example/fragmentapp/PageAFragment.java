package com.example.fragmentapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentapp.databinding.FragmentPageABinding;


public class PageAFragment extends Fragment {
    private FragmentPageABinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding=FragmentPageABinding.inflate(inflater, container, false);

        binding.goB.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.AToB);
        });

        return binding.getRoot();
    }
}