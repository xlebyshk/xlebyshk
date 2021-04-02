package com.example.testtask.repository;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testtask.R;
import com.example.testtask.models.PlayerModel;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerHolder> {
    private List<PlayerModel> players;

    public PlayerAdapter(List<PlayerModel> players) {
        this.players = players;
    }

    @NonNull
    @Override
    public PlayerAdapter.PlayerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_item, parent, false);
        return new PlayerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerHolder holder, int position) {
        PlayerModel currentPlayer = players.get(position);
        holder.avatar.setImageResource(currentPlayer.getAvatar());
        holder.name.setText(currentPlayer.getName());
        holder.sport.setText(currentPlayer.getSport());
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    public class PlayerHolder extends RecyclerView.ViewHolder {
        private ImageView avatar;
        private TextView name;
        private TextView sport;

        public PlayerHolder(@NonNull View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.player_item_avatar_imageView);
            name = itemView.findViewById(R.id.player_item_name_textView);
            sport = itemView.findViewById(R.id.player_item_kind_of_sport_textView);
        }
    }
}
