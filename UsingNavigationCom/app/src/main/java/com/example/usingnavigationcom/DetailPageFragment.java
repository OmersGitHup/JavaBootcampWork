package com.example.usingnavigationcom;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usingnavigationcom.databinding.FragmentDetailPageBinding;
import com.google.android.material.snackbar.Snackbar;


public class DetailPageFragment extends Fragment {


    private FragmentDetailPageBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentDetailPageBinding.inflate(inflater, container, false);

        DetailPageFragmentArgs bundle=DetailPageFragmentArgs.fromBundle(getArguments());
        String gotName=bundle.getAd();
        int gotAge=bundle.getAge();
        float gotHeight=bundle.getHeight();
        boolean gotMarriage=bundle.getMarriage();

        Products products=bundle.getProduct();

        binding.textViewInfo.setText(gotAge+" "+gotHeight+" "+gotMarriage+" "+gotName+ " "+ products.getId()+" "+products.getName());

        OnBackPressedCallback backButton=new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Snackbar.make(binding.textViewInfo,"Would you like to get back?",Snackbar.LENGTH_LONG).
                        setAction("Yes",view->{
                            setEnabled(false);
                            requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        }).show();
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(),backButton);


        return binding.getRoot();



    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("LifeCircle","onCreate");
        //When the applicaton started first time
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("LifeCircle","onResume");
        //It work as the page showed by user

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("LifeCircle","onPause");
        //When user leave the page
    }
}