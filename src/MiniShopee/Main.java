/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniShopee;
/**
 *
 * @author zettopiaa
 */
import java.util.Scanner;
import MiniShopeeExceptions.OutOfStockException;
import MiniShopeeExceptions.InsufficientBalanceException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store store = new Store("Mini Shopee");
        User currentUser = new User("Fizka", 500000);
        Cart cart = new Cart();

        // Tambahkan produk
        store.addProduct(new Product("F01", "Sepatu", 300000, 20));
        store.addProduct(new Product("F02", "Tas", 250000, 15));
        store.addProduct(new Product("F03", "Baju", 150000, 30));
        store.addProduct(new Product("F04", "Dompet", 145000, 25));
        store.addProduct(new Product("F05", "Jaket", 350000, 14));
        store.addProduct(new Product("F06", "Tumblr", 189000, 16));

        String pilihan = "";

        while (!pilihan.equals("0")) {
            System.out.println("\n=== MINI SHOPEE ===");
            System.out.println("1. Lihat Produk");
            System.out.println("2. Tambah ke Keranjang");
            System.out.println("3. Hapus dari Keranjang");
            System.out.println("4. Lihat Keranjang");
            System.out.println("5. Checkout");
            System.out.println("6. Beri Rating Produk");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextLine();

            switch (pilihan) {
                case "1":
                    store.viewProducts();
                    break;

                case "2":
                    System.out.print("Masukkan ID produk: ");
                    String pid = sc.nextLine();
                    System.out.print("Masukkan jumlah: ");
                    int qty = Integer.parseInt(sc.nextLine());
                    try {
                        Product p = store.getProductById(pid);
                        if (p != null) {
                            cart.addItem(p, qty);
                            System.out.println("Produk ditambahkan ke keranjang!");
                        } else {
                            System.out.println("Produk tidak ditemukan.");
                        }
                    } catch (OutOfStockException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "3":
                    System.out.print("Masukkan ID produk yang ingin dihapus: ");
                    String delId = sc.nextLine();
                    cart.removeItem(delId);
                    System.out.println("Produk dihapus dari keranjang.");
                    break;

                case "4":
                    cart.viewCart();
                    System.out.printf("Total: Rp%.0f%n", cart.getTotal());
                    break;

                case "5":
                    double total = cart.getTotal();
                    try {
                        if (total == 0)
                            throw new Exception("Keranjang kosong.");
                        if (!currentUser.pay(total))
                            throw new InsufficientBalanceException("Saldo tidak cukup!");

                        System.out.println("Checkout berhasil! Total: Rp" + total);
                        cart.clearCart();
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Checkout gagal: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Kesalahan: " + e.getMessage());
                    }
                    break;

                case "6":
                    System.out.print("Masukkan ID produk yang ingin diberi rating: ");
                    String rid = sc.nextLine();
                    System.out.print("Masukkan nilai rating (1–5): ");
                    int rate = Integer.parseInt(sc.nextLine());
                    Product rp = store.getProductById(rid);
                    if (rp != null) {
                        rp.addRating(rate);
                        System.out.println("Terima kasih atas rating Anda!");
                    } else {
                        System.out.println("Produk tidak ditemukan.");
                    }
                    break;

                case "0":
                    System.out.println("Terima kasih telah berbelanja di Mini Shopee!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        sc.close();
    }    
}
