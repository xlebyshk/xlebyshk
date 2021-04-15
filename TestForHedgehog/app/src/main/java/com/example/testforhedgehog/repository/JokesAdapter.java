package com.example.testforhedgehog.repository;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testforhedgehog.R;
import com.example.testforhedgehog.model.JokeForList;

import java.util.List;

public class JokesAdapter extends RecyclerView.Adapter<JokesAdapter.JokeHolder> {
    List<JokeForList> jokesForList;

    public JokesAdapter(List<JokeForList> jokesForList) {
        this.jokesForList = jokesForList;
    }

    @NonNull
    @Override
    public JokesAdapter.JokeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.joke_item,parent,false);
        return new JokeHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull JokeHolder holder, int position) {
        JokeForList currentJoke = jokesForList.get(position);
        holder.joke.setText(currentJoke.getJoke());
    }

    @Override
    public int getItemCount() {
        return jokesForList.size();
    }

    public class JokeHolder extends RecyclerView.ViewHolder {
        private final TextView joke;
        public JokeHolder(@NonNull View itemView) {
            super(itemView);
            joke = itemView.findViewById(R.id.joke_item_joke_textView);
        }
    }
}
