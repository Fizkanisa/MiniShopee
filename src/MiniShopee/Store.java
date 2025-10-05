/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniShopee;

/**
 *
 * @author zettopiaa
 */
import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public Product getProductById(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public void viewProducts() {
        System.out.println("\n=== Daftar Produk di " + name + " ===");
        for (Product p : products) {
            p.display();
        }
    }    
}
