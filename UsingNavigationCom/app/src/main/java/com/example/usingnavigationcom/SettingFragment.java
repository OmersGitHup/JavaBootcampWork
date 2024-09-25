package com.example.usingnavigationcom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usingnavigationcom.databinding.FragmentMainPageBinding;


public class SettingFragment extends Fragment {

    private FragmentMainPageBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentMainPageBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}