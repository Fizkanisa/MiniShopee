MiniShopee

MiniShopee adalah proyek sederhana berbasis Java yang meniru sistem e-commerce seperti Shopee.
Program ini dibuat untuk memenuhi tugas Array dan Pemrograman Berorientasi Objek (PBO) dengan menerapkan konsep-konsep dasar seperti:

Class dan Object

Constructor dan Method

Variabel, Konstanta, dan Tipe Data

Kondisional dan Looping

Manipulasi String dan Character

Array

Exception Handling

Package

🎯 Tema Project

Simulasi Aplikasi Belanja Online (MiniShopee)
Pengguna dapat melihat daftar produk, menambahkan produk ke keranjang, melakukan checkout, serta memberikan rating untuk produk.

🧩 Struktur Package dan File
MiniShopee/
│
├── src/
│   └── main/
│       └── java/
│           ├── MiniShopee/
│           │   ├── Main.java
│           │   ├── Store.java
│           │   ├── Product.java
│           │   ├── Cart.java
│           │   └── User.java
│           │
│           └── MiniShopeeExceptions/
│               ├── OutOfStockException.java
│               └── InsufficientBalanceException.java
│
├── README.md
└── LICENSE (opsional)

🧠 Desain Class (Diagram Sederhana)
User
 ├─ name : String
 ├─ balance : double
 ├─ pay(amount) : boolean
 └─ toString()

Product
 ├─ id : String
 ├─ name : String
 ├─ price : double
 ├─ stock : int
 ├─ totalRating : int
 ├─ ratingCount : int
 ├─ reduceStock(qty)
 ├─ addRating(rate)
 └─ getAverageRating()

Cart
 ├─ items[] : Product
 ├─ quantities[] : int
 ├─ addProduct(p, qty)
 ├─ viewCart()
 ├─ getTotal()
 └─ clearCart()

Store
 ├─ products[] : Product
 ├─ addProduct(p)
 ├─ showProducts()
 └─ getProductById(id)

Exceptions
 ├─ OutOfStockException
 └─ InsufficientBalanceException

Main
 └─ Program utama (menu interaktif)

⚙️ Fitur Utama

✅ Menampilkan daftar produk
✅ Menambahkan produk ke keranjang
✅ Melihat isi keranjang dan total belanja
✅ Melakukan checkout dengan pengecekan saldo
✅ Memberikan rating pada produk
✅ Penanganan error menggunakan Exception
✅ Menggunakan Array, Looping, dan Kondisional

🎥 Video Penjelasan & Demo

Isi video:

Penjelasan struktur class dan package

Penerapan konsep PBO (class, method, array, exception, dll)

Demo menjalankan program di NetBeans

🧮 Konsep PBO yang Diterapkan
Konsep	Implementasi
Class & Object	Product, User, Cart, Store, Main
Constructor	Digunakan untuk inisialisasi objek
Method (dengan parameter & return)	addProduct(), pay(), getTotal()
Variabel & Konstanta	Variabel instance dan lokal di setiap class
Kondisional	if-else, switch-case
Looping	for, do-while
Array	Menyimpan produk & keranjang
String & Character	ID produk, nama produk, input user
Exception Handling	OutOfStockException, InsufficientBalanceException
Package	MiniShopee dan MiniShopeeExceptions
👩‍💻 Pengembang

Nama: Fizka Khairunnisa
NIM: L0324013
Mata Kuliah: Pemrograman Berorientasi Objek

🧾 Lisensi

Proyek ini dibuat untuk keperluan akademik.
Silakan gunakan sebagai referensi belajar pemrograman Java berorientasi objek.

