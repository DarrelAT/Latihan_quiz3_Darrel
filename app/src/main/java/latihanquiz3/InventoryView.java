package latihanquiz3;

import java.util.List;

public class InventoryView {
    
    // Generic Method / Wildcard untuk mencetak list produk apa saja
    public void printInventoryReport(String categoryName, List<? extends Product> productList) {
        System.out.println("\n=== LAPORAN INVENTARIS: " + categoryName.toUpperCase() + " ===");
        if (productList.isEmpty()) {
            System.out.println("Gudang kosong.");
        } else {
            for (Product p : productList) {
                System.out.println("- " + p.toString());
            }
        }
        System.out.println("==========================================");
    }
}