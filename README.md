RecyclerView List, Grid, dan Card View
Project Android sederhana untuk menampilkan data katalog kuliner dalam tiga mode RecyclerView:

Mode List menggunakan LinearLayoutManager
Mode Grid menggunakan GridLayoutManager
Mode Card menggunakan item layout berbasis CardView
Cara Menjalankan
Buka folder ini di Android Studio.
Tunggu proses Gradle Sync selesai.
Jalankan aplikasi pada emulator atau perangkat Android.
Gunakan tombol List, Grid, dan Card di bagian atas aplikasi untuk mengganti mode tampilan.
Build dari command line juga bisa dijalankan dengan:

./gradlew assembleDebug
Di Windows:

.\gradlew.bat assembleDebug
Struktur Utama
MainActivity.java: mengatur data, mode tampilan, dan layout manager.
MenuAdapter.java: adapter RecyclerView untuk tiga mode item.
item_menu_list.xml: layout item mode list.
item_menu_grid.xml: layout item mode grid.
item_menu_card.xml: layout item mode card.
