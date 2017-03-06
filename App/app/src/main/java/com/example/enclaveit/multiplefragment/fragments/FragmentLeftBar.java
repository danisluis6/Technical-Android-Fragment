package com.example.enclaveit.multiplefragment.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.enclaveit.multiplefragment.R;

/**
 * Created by enclaveit on 20/12/2016.
 */

public class FragmentLeftBar extends Fragment{

    private ImageView menu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewHirerarchy = inflater.inflate(R.layout.fr_leftbar,container,false);
        return viewHirerarchy;
    }
}
