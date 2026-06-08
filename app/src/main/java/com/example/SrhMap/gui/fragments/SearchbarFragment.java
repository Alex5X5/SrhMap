package com.example.SrhMap.gui.fragments;


import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.SrhMap.R;

public class SearchbarFragment extends Fragment {

    public SearchbarFragment() {
        super(R.layout.searchbar_fragment); // shorthand constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int bla = R.styleable.SearchbarFragment.length;
    }
}