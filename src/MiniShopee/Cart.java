/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniShopee;

import java.util.ArrayList;
import MiniShopeeExceptions.OutOfStockException;

/**
 *
 * @author zettopiaa
 */
public class Cart {
    private ArrayList<Product> items = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();

    public void addItem(Product p, int qty) throws OutOfStockException {
        if (p.getStock() < qty)
            throw new OutOfStockException("Stok " + p.getName() + " tidak mencukupi!");
        items.add(p);
        quantities.add(qty);
        p.reduceStock(qty);
    }

    public void removeItem(String productId) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(productId)) {
                items.remove(i);
                quantities.remove(i);
                break;
            }
        }
    }

    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Keranjang kosong.");
        } else {
            System.out.println("\nIsi Keranjang:");
            for (int i = 0; i < items.size(); i++) {
                Product p = items.get(i);
                int qty = quantities.get(i);
                System.out.printf("%s x%d = Rp%.0f%n", p.getName(), qty, p.getPrice() * qty);
            }
        }
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }

    public void clearCart() {
        items.clear();
        quantities.clear();
    } 
}
