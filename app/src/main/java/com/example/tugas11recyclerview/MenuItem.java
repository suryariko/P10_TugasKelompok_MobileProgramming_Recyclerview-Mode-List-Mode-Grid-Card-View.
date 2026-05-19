package com.example.tugas11recyclerview;

public class MenuItem {
    private final String name;
    private final String description;
    private final String category;
    private final String price;
    private final String rating;
    private final int accentColor;

    public MenuItem(String name, String description, String category, String price, String rating, int accentColor) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.accentColor = accentColor;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }

    public String getRating() {
        return rating;
    }

    public int getAccentColor() {
        return accentColor;
    }
}
