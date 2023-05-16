package com.example.recycleviewappmusic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {

    private final List<String> musicTitles;

    public MusicAdapter(List<String> musicTitles) {
        this.musicTitles = musicTitles;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.music_item, parent, false);
        return new MusicViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        String musicTitle = musicTitles.get(position);
        holder.musicTitleTextView.setText(musicTitle);
    }

    @Override
    public int getItemCount() {
        return musicTitles.size();
    }

    public static class MusicViewHolder extends RecyclerView.ViewHolder {

        public TextView musicTitleTextView;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            musicTitleTextView = itemView.findViewById(R.id.music_title_text_view);
        }
    }
}

