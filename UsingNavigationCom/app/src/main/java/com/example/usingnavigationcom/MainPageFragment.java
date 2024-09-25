package com.example.usingnavigationcom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usingnavigationcom.databinding.FragmentMainPageBinding;


public class MainPageFragment extends Fragment {
    private FragmentMainPageBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding= FragmentMainPageBinding.inflate(inflater, container, false);

        binding.buttonDetail.setOnClickListener(view -> {
            Products product=new Products(100,"TV");

            MainPageFragmentDirections.MaintoDetail transfer=MainPageFragmentDirections.maintoDetail(product);
            transfer.setAd("Ahmet");
            transfer.setAge(23);
            transfer.setHeight(1.78f);
            transfer.setMarriage(true);
            Navigation.findNavController(view).navigate(transfer);
        });

        binding.show.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.bottomSheetsTransfer);
        });

        return binding.getRoot();

    }
}