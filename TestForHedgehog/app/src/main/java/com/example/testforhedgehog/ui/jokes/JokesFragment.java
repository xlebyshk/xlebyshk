package com.example.testforhedgehog.ui.jokes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testforhedgehog.R;
import com.example.testforhedgehog.repository.JokesAdapter;

public class JokesFragment extends Fragment {

    private JokesViewModel jokesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        jokesViewModel =
                new ViewModelProvider(this).get(JokesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_jokes, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        assert view != null;
        Button reloadButton = view.findViewById(R.id.jokes_fragment_reload_button);
        TextView countText = view.findViewById(R.id.jokes_fragment_count_text);
        RecyclerView recyclerViewJoke = view.findViewById(R.id.jokes_fragment_joke_recyclerView);
        recyclerViewJoke.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewJoke.setHasFixedSize(true);

        reloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(countText.getText().toString()) <= 0){
                    Toast.makeText(getContext(), "Вам требуется ввести число которое было бы больше 0", Toast.LENGTH_SHORT).show();
                }
                else {
                    jokesViewModel.receiveJokes(Integer.parseInt(countText.getText().toString()));
                }
            }
        });

        jokesViewModel.getJoke().observe(getViewLifecycleOwner(), jokeForLists -> {
            if (jokeForLists.size() != 0){
                JokesAdapter jokesAdapter = new JokesAdapter(jokeForLists);
                recyclerViewJoke.setAdapter(jokesAdapter);
            }
        });
    }
}