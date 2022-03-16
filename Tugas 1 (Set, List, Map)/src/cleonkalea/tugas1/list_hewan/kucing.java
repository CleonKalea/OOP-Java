package cleonkalea.tugas1.list_hewan;

import java.util.*;

public class kucing {
    public static void jenis(){
        List<String> nama_jenis_kucing = new ArrayList<>();

        nama_jenis_kucing.add("Persia");
        nama_jenis_kucing.add("Anggora");
        nama_jenis_kucing.add("Ragdoll");
        nama_jenis_kucing.add("Sphynx");
        nama_jenis_kucing.add("Bengal");

        nama_jenis_kucing.remove("Ragdoll");

        System.out.println("Jenis-Jenis Kucing : ");

        for(int i = 0 ; i < nama_jenis_kucing.size() ; i++ ) {
            System.out.println(nama_jenis_kucing.get(i));
        }
    }

    public static void makanan(){
        Set<String> nama_makanan_kucing = new HashSet<>();

        nama_makanan_kucing.add("Whiskas");
        nama_makanan_kucing.add("Felibite Dry Food");
        nama_makanan_kucing.add("Purina Proplan");
        nama_makanan_kucing.add("Royal Canin");
        nama_makanan_kucing.add("Purina Proplan");
        nama_makanan_kucing.add("Whiskas");

        System.out.println("\nNama Makanan Kucing : ");

        for (Iterator iterator = nama_makanan_kucing.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }

    public static void obat(){
        Map<String, MapObat> obat_kucing = new HashMap<>();

        obat_kucing.put("Obat Iritasi Mata", new MapObat("Trixin", "7000"));
        obat_kucing.put("Vitamin", new MapObat("Olive Care", "75000"));
        obat_kucing.put("Obat Tetest Kutu Telinga", new MapObat("Vet Otic", "80000"));

        System.out.println("\nObat Kucing : ");

        for (MapObat Obat : obat_kucing.values()){
            System.out.println(Obat);
        }
    }
}
