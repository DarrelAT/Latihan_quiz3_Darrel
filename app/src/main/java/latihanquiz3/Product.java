package latihanquiz3;

public class Product {
    protected String id;
    protected String nama;
    protected double harga;

    public Product(String id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public double getHarga() { return harga; }

    @Override
    public String toString() {
        return "[" + id + "] " + nama + " - Rp " + harga;
    }
}