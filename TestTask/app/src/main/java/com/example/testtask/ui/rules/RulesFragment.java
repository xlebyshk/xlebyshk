package com.example.testtask.ui.rules;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testtask.R;
import com.example.testtask.repository.MenuFragmentRepository;

public class RulesFragment extends Fragment {
    private static final String TAG = "RulesFragment";
    private RulesViewModel rulesViewModel;
    private TextView rulesTextView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rulesViewModel =
                new ViewModelProvider(this).get(RulesViewModel.class);
        Log.d(TAG, "onCreateView: create");
        View root = inflater.inflate(R.layout.fragment_rules, container, false);
        rulesTextView = root.findViewById(R.id.rules_fragment_rules_text);
        MenuFragmentRepository.getRulesMutableLiveData().observe(getViewLifecycleOwner(), rules -> {
            if (rules != null){
                rulesTextView.setText(rules);
            }
        });
        return root;
    }
}