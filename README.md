# Tugas 11 - RecyclerView List, Grid, dan Card View

Project Android sederhana untuk menampilkan data katalog kuliner dalam tiga mode RecyclerView:

- Mode List menggunakan `LinearLayoutManager`
- Mode Grid menggunakan `GridLayoutManager`
- Mode Card menggunakan item layout berbasis `CardView`

## Cara Menjalankan

1. Buka folder ini di Android Studio.
2. Tunggu proses Gradle Sync selesai.
3. Jalankan aplikasi pada emulator atau perangkat Android.
4. Gunakan tombol `List`, `Grid`, dan `Card` di bagian atas aplikasi untuk mengganti mode tampilan.

Build dari command line juga bisa dijalankan dengan:

```bash
./gradlew assembleDebug
```

Di Windows:

```powershell
.\gradlew.bat assembleDebug
```

## Struktur Utama

- `MainActivity.java`: mengatur data, mode tampilan, dan layout manager.
- `MenuAdapter.java`: adapter RecyclerView untuk tiga mode item.
- `item_menu_list.xml`: layout item mode list.
- `item_menu_grid.xml`: layout item mode grid.
- `item_menu_card.xml`: layout item mode card.

## Catatan Pengumpulan

Laporan dan screenshot sudah disiapkan di folder `laporan` pada workspace utama. Setelah source code diunggah ke GitHub/GitLab, ganti bagian `Link Git` pada laporan dengan URL repository.
