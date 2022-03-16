package cleonkalea.tugas1.list_hewan;

public class MapObat {
    private String nama;
    private String harga;

    public MapObat(String nama, String harga){
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString(){
        return "Obat " + nama + " = Rp." + harga;
    }
}
