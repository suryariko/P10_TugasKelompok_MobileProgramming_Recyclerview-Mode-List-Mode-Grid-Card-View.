package com.example.tugas11recyclerview;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    public enum ViewMode {
        LIST,
        GRID,
        CARD
    }

    private final List<MenuItem> items;
    private ViewMode viewMode = ViewMode.LIST;

    public MenuAdapter(List<MenuItem> items) {
        this.items = items;
    }

    public void setViewMode(ViewMode viewMode) {
        this.viewMode = viewMode;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return viewMode.ordinal();
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        int layoutId;

        if (viewType == ViewMode.GRID.ordinal()) {
            layoutId = R.layout.item_menu_grid;
        } else if (viewType == ViewMode.CARD.ordinal()) {
            layoutId = R.layout.item_menu_card;
        } else {
            layoutId = R.layout.item_menu_list;
        }

        View view = inflater.inflate(layoutId, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MenuViewHolder extends RecyclerView.ViewHolder {
        private final ImageView foodIcon;
        private final TextView foodName;
        private final TextView foodDescription;
        private final TextView foodCategory;
        private final TextView foodPrice;
        private final TextView foodRating;

        MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            foodIcon = itemView.findViewById(R.id.foodIcon);
            foodName = itemView.findViewById(R.id.foodName);
            foodDescription = itemView.findViewById(R.id.foodDescription);
            foodCategory = itemView.findViewById(R.id.foodCategory);
            foodPrice = itemView.findViewById(R.id.foodPrice);
            foodRating = itemView.findViewById(R.id.foodRating);
        }

        void bind(MenuItem item) {
            if (foodIcon != null) {
                foodIcon.setBackgroundTintList(ColorStateList.valueOf(item.getAccentColor()));
            }

            if (foodName != null) {
                foodName.setText(item.getName());
            }

            if (foodDescription != null) {
                foodDescription.setText(item.getDescription());
            }

            if (foodCategory != null) {
                foodCategory.setText(item.getCategory());
            }

            if (foodPrice != null) {
                foodPrice.setText(item.getPrice());
            }

            if (foodRating != null) {
                foodRating.setText(item.getRating());
            }
        }
    }
}
