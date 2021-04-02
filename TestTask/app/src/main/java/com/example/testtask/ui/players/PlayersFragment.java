package com.example.testtask.ui.players;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testtask.R;
import com.example.testtask.repository.MenuFragmentRepository;

public class PlayersFragment extends Fragment {
    private static final String TAG = "PlayersFragment";
    private PlayersViewModel playersViewModel;
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        playersViewModel =
                new ViewModelProvider(this).get(PlayersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_players, container, false);
        recyclerView = root.findViewById(R.id.players_fragment_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        MenuFragmentRepository.getPlayerAdapterMutableLiveData().observe(getViewLifecycleOwner(),playerAdapter -> {
            recyclerView.setAdapter(playerAdapter);
        });
        return root;
    }
}