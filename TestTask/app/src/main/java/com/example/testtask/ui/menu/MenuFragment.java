package com.example.testtask.ui.menu;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.testtask.ui.MainActivity;
import com.example.testtask.R;

public class MenuFragment extends Fragment {

    private MenuViewModel mViewModel;
    private Button footballButton;
    private Button basketballButton;
    private Button tennisButton;
    private Button handballButton;
    private Intent intent;

    public static MenuFragment newInstance() {
        return new MenuFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        footballButton = view.findViewById(R.id.menu_fragment_button_football);
        basketballButton = view.findViewById(R.id.menu_fragment_button_basketball);
        tennisButton = view.findViewById(R.id.menu_fragment_button_tennis);
        handballButton = view.findViewById(R.id.menu_fragment_button_handball);
        intent = new Intent(getActivity(), MainActivity.class);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MenuViewModel.class);
        footballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.itsFootball();
                startActivity(intent);
            }
        });
        basketballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.itsBasketball();
                startActivity(intent);
            }
        });
        tennisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.itsTennis();
                startActivity(intent);
            }
        });
        handballButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.itsHandball();
                startActivity(intent);
            }
        });
    }

}