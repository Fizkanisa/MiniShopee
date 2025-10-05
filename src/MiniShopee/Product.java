/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniShopee;

/**
 *
 * @author zettopiaa
 */
public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;
    private int totalRating;
    private int ratingCount;

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void reduceStock(int qty) {
        this.stock -= qty;
    }

    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            totalRating += rating;
            ratingCount++;
        }
    }

    public double getAverageRating() {
        return ratingCount == 0 ? 0 : (double) totalRating / ratingCount;
    }

    public void display() {
        System.out.printf("%s - %s | Rp%.0f | Stok: %d | Rating: %.1f%n",
                id, name, price, stock, getAverageRating());
    }    
}
