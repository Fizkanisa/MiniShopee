**🛒MiniShopee — Simulasi Aplikasi Belanja Online**

Proyek MiniShopee adalah aplikasi berbasis Java sederhana yang meniru sistem belanja online seperti Shopee. Program ini menerapkan konsep Pemrograman Berorientasi Objek (PBO) seperti class, object, array, exception handling, serta menerapkan Array untuk menyimpan data produk dan item keranjang belanja.

Program MiniShopee dimulai dengan membuat objek toko (Store), pengguna (User), dan keranjang (Cart).
Kemudian ditambahkan beberapa produk ke dalam daftar toko.
Melalui menu interaktif di console, pengguna dapat memilih untuk melihat produk, menambah ke keranjang, atau melakukan checkout.
Jika saldo pengguna tidak mencukupi atau stok produk habis, program akan menampilkan pesan error menggunakan exception handling tanpa menghentikan eksekusi program.
Setelah checkout berhasil, keranjang akan dikosongkan, dan pengguna dapat memberi rating pada produk yang telah dibeli.

**🧠Konsep Pemrograman yang Diterapkan**

| Konsep                                     | Implementasi                                                 |
| ------------------------------------------ | ------------------------------------------------------------ |
| **Class & Object**                         | `Product`, `User`, `Store`, `Cart`, `Main`                   |
| **Constructor**                            | Digunakan untuk inisialisasi data produk dan user            |
| **Method dengan Parameter & Return Value** | `addItem()`, `getTotal()`, `pay()`                           |
| **Variabel**                               | Variabel `name`, `price`, `balance`, `total`, dll            |
| **Konstanta**                              | Digunakan untuk penamaan tetap seperti ID produk             |
| **Primitive & Reference Type**             | `int`, `double`, `String`, `ArrayList<Product>`              |
| **Kondisional**                            | `if-else`, `switch-case` untuk logika menu                   |
| **Looping**                                | `while` dan `for-each` digunakan pada menu dan daftar produk |
| **Manipulasi String & Character**          | Input ID produk, pencarian berdasarkan String                |
| **Array / ArrayList**                      | Menyimpan kumpulan produk dan item belanja                   |
| **Exception Handling**                     | `OutOfStockException` dan `InsufficientBalanceException`     |
| **Package**                                | `MiniShopee` dan `MiniShopeeExceptions`                      |
| **Input Scanner**                          | Untuk interaksi user melalui terminal                        |


**🧩Desain Class (Diagram Sederhana)**
```
+------------------+
|      Product     |
+------------------+
| - id: String     |
| - name: String   |
| - price: double  |
| - stock: int     |
| - ratings: int[] |
+------------------+
| + addRating()    |
| + getAverage()   |
| + reduceStock()  |
+------------------+

+------------------+
|       Store      |
+------------------+
| - products[]     |
+------------------+
| + addProduct()   |
| + viewProducts() |
| + getProductById()|
+------------------+

+------------------+
|       Cart       |
+------------------+
| - items[]        |
+------------------+
| + addItem()      |
| + removeItem()   |
| + getTotal()     |
| + clearCart()    |
+------------------+

+------------------+
|       User       |
+------------------+
| - name: String   |
| - balance: double|
+------------------+
| + pay()          |
| + getBalance()   |
+------------------+

+------------------+
|       Main       |
+------------------+
| + main()         |
| (Menu Program)   |
+------------------+
```

**💡Fitur Utama Program**
1. Lihat Produk --> digunakan untuk menampilkan seluruh produk beserta harga dan stok.
2. Tambah Keranjang --> user dapat memasukkan produk ke keranjang belanja berdasarkan ID produk.
3. Hapus dari Keranjang --> menghapus produk ke keranjang belanja berdasarkan ID produk.
4. Lihat Keranjang --> menampilkan isi keranjang dan total harga belanja.
5. Checkout --> melakukan pembayaran dengan saldo pengguna - otomatis memotong saldo jika cukup.
6. Beri Rating Produk --> setelah checkout, user dapat memberikan rating (1-5) untuk produk.

**🧩Struktur Project**
```
MiniShopee/
│
├── src/
│   ├── MiniShopee/
│   │   ├── Main.java
│   │   ├── Store.java
│   │   ├── Product.java
│   │   ├── Cart.java
│   │   └── User.java
│   │
│   └── MiniShopeeExceptions/
│       ├── OutOfStockException.java
│       └── InsufficientBalanceException.java
│
└── README.md

```

**🎥Video Penjelasan & Demo**

📺 Video Penjelasan di YouTube:

👉 https://youtu.be/UOdBL_33CbA

Isi video:
1. Penjelasan struktur class & package.
2. Implementasi konsep PBO dan Array.
3. Demo jalannya program (input, output, error handling).

**👩‍🎓Identitas Pembuat**

| Nama                  | NIM      | Program Studi | Fakultas                     |
| --------------------- | -------- | ------------- | ---------------------------- |
| **Fizka Khairunnisa** | L0324013 | Informatika PSDKU  | Fakultas Teknologi Informasi dan Sains Data|

