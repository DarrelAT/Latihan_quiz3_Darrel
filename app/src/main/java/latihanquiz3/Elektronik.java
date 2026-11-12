package latihanquiz3;

public class Elektronik extends Product {
    private int garansiBulan;
    public Elektronik(int garansiBulan, String id, String nama, double harga){
        this.garansiBulan = garansiBulan;
        super(id, nama, harga);
    }
}
