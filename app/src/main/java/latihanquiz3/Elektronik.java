package latihanquiz3;

public class Elektronik extends Product {
    private int garansiBulan;
    public Elektronik(String id, String nama, double harga, int garansiBulan){
        this.garansiBulan = garansiBulan;
        super(id, nama, harga);
    }

    @Override 
    public String showPrint() {
        return "[" + id + "] " + nama + "- Rp " + harga;
    }
}
