package com.example.recycleviewappmusic;

public class Playlist {

    private int imageResId;
    private String title;
    private String artist;

    public Playlist(int imageResId, String title, String artist) {
        this.imageResId = imageResId;
        this.title = title;
        this.artist = artist;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

