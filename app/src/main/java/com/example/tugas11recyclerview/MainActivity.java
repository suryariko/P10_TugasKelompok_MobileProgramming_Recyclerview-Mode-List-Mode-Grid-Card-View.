package com.example.tugas11recyclerview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private TextView modeCaption;
    private MenuAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        modeCaption = findViewById(R.id.modeCaption);

        adapter = new MenuAdapter(createMenuItems());
        recyclerView.setAdapter(adapter);
        showListMode();

        RadioGroup modeGroup = findViewById(R.id.modeGroup);
        modeGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.modeGrid) {
                showGridMode();
            } else if (checkedId == R.id.modeCard) {
                showCardMode();
            } else {
                showListMode();
            }
        });
    }

    private void showListMode() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setViewMode(MenuAdapter.ViewMode.LIST);
        modeCaption.setText(getString(R.string.caption_list));
        recyclerView.scrollToPosition(0);
    }

    private void showGridMode() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        adapter.setViewMode(MenuAdapter.ViewMode.GRID);
        modeCaption.setText(getString(R.string.caption_grid));
        recyclerView.scrollToPosition(0);
    }

    private void showCardMode() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setViewMode(MenuAdapter.ViewMode.CARD);
        modeCaption.setText(getString(R.string.caption_card));
        recyclerView.scrollToPosition(0);
    }

    private List<MenuItem> createMenuItems() {
        List<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("Nasi Liwet Solo", "Nasi gurih dengan ayam suwir dan sayur labu.", "Makanan utama", "Rp25.000", "4.8", Color.parseColor("#2F7D62")));
        items.add(new MenuItem("Soto Betawi", "Kuah santan hangat dengan daging sapi dan tomat.", "Sup tradisional", "Rp32.000", "4.7", Color.parseColor("#C25A35")));
        items.add(new MenuItem("Sate Madura", "Sate ayam bumbu kacang dengan lontong.", "Menu bakar", "Rp28.000", "4.9", Color.parseColor("#7E5AA6")));
        items.add(new MenuItem("Pempek Palembang", "Pempek kapal selam dengan kuah cuko asam pedas.", "Camilan", "Rp22.000", "4.6", Color.parseColor("#2F6EA5")));
        items.add(new MenuItem("Gudeg Jogja", "Nangka muda manis dengan telur dan krecek.", "Makanan utama", "Rp27.000", "4.8", Color.parseColor("#B9782D")));
        items.add(new MenuItem("Rawon Surabaya", "Sup daging kluwek dengan tauge dan sambal.", "Sup tradisional", "Rp35.000", "4.7", Color.parseColor("#4A5568")));
        items.add(new MenuItem("Rendang Padang", "Daging sapi berbumbu rempah dengan rasa kuat.", "Menu favorit", "Rp38.000", "5.0", Color.parseColor("#9A3D37")));
        items.add(new MenuItem("Es Pisang Ijo", "Pisang berbalut adonan hijau dengan sirup manis.", "Minuman", "Rp18.000", "4.5", Color.parseColor("#459E72")));
        return items;
    }
}
