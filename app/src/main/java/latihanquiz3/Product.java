package latihanquiz3;

class Product{
    public String id;
    public String nama;
    public double harga;

    public Product(String id, String nama, double harga){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public void setId(){
        this.id = id;
    }

    public String getId(String id){
        return id;
    }

    public void setNama(){
        this.nama = nama;
    }

    public String getNama(String nama){
        return nama;
    }

    public void setHarga(){
        this.harga = harga;
    }

    public double getHarga(double harga){
        return harga;
    }

    public String showPrint() {
        return "[" + id + "] " + nama + "- Rp " + harga;
    }
}