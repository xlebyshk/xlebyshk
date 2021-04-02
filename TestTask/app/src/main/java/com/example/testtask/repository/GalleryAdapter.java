package com.example.testtask.repository;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testtask.R;
import com.example.testtask.models.GalleryModel;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.GalleryHolder> {
    private List<GalleryModel> gallery;

    public GalleryAdapter(List<GalleryModel> gallery) {
        this.gallery = gallery;
    }

    @NonNull
    @Override
    public GalleryAdapter.GalleryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_item, parent, false);
        return new GalleryAdapter.GalleryHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryHolder holder, int position) {
        GalleryModel currentGallery = gallery.get(position);
        holder.photo.setImageResource(currentGallery.getPhoto());
    }

    @Override
    public int getItemCount() {
        return gallery.size();
    }

    public class GalleryHolder extends RecyclerView.ViewHolder {
        private ImageView photo;

        public GalleryHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.gallery_item_photo_imageView);
        }
    }
}
