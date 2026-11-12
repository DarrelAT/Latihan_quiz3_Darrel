package latihanquiz3;

import java.util.ArrayList;
import java.util.List;

// Menggunakan Bounded Type Parameters (<T extends Product>) supaya khusus produk
public class InventoryManager<T extends Product> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
        System.out.println("Berhasil menambahkan: " + item.getNama());
    }

    public void removeItem(T item) {
        items.remove(item);
        System.out.println("Berhasil menghapus: " + item.getNama());
    }

    public List<T> getItems() {
        return items;
    }
}