package com.example.fragmentapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentapp.databinding.FragmentMainBinding;
import com.example.fragmentapp.databinding.FragmentPageBBinding;

public class PageBFragment extends Fragment {

    private FragmentPageBBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_page_b, container, false);
    }


}