package latihanquiz3;

public class InventoryController<T extends Product> {
    private InventoryManager<T> manager;
    private InventoryView view;

    public InventoryController(InventoryManager<T> manager, InventoryView view) {
        this.manager = manager;
        this.view = view;
    }

    public void tambahProduk(T produk) {
        manager.addItem(produk);
    }

    public void tampilkanLaporan(String namaKategori) {
        view.printInventoryReport(namaKategori, manager.getItems());
    }
}