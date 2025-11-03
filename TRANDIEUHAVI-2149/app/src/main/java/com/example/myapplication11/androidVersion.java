package com.example.myapplication11;

public class androidVersion {
    private String name;
    private String position;
    private int imageResId;

    public androidVersion(String name, String position, int imageResId) {
        this.name = name;
        this.position = position;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getImageResId() {
        return imageResId;
    }
}
