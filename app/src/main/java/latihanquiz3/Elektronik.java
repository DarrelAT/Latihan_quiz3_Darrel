package latihanquiz3;

public class Elektronik extends Product {
    private int garansiBulan;
    public Elektronik(String id, String nama, double harga, int garansiBulan){
        super(id, nama, harga);
        this.garansiBulan = garansiBulan;
    }

    public int getGaransiBulan() {
        return garansiBulan;
    }

    @Override 
    public String showPrint() {
        return "[" + id + "] " + nama + "- Rp " + harga;
    }
}
