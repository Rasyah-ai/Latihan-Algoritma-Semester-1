import java.util.ArrayList;
import java.util.List;

class Latihan2MataKuliah {
    String namaMataKuliah;
    int sks;
    char nilai;
    int bobot;

    // Konstruktor untuk menginisialisasi data
    public Latihan2MataKuliah(String namaMataKuliah, int sks, char nilai) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.nilai = nilai;
        this.bobot = konversiNilai(nilai); // Menghitung bobot berdasarkan nilai
    }

    // Fungsi untuk konversi nilai ke bobot
    private int konversiNilai(char nilai) {
        switch (nilai) {
            case 'A': return 4;
            case 'B': return 3;
            case 'C': return 2;
            case 'D': return 1;
            case 'E': return 0;
            default: return 0; // Untuk nilai yang tidak valid
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat daftar mata kuliah
        List<MataKuliah> mataKuliahList = new ArrayList<>();
        mataKuliahList.add(new MataKuliah("Algoritma", 3, 'A'));
        mataKuliahList.add(new MataKuliah("Struktur Data", 2, 'B'));
        mataKuliahList.add(new MataKuliah("Basis Data", 3, 'A'));
        mataKuliahList.add(new MataKuliah("Pemrograman", 2, 'C'));

        // Menampilkan tabel Mata Kuliah, SKS, Nilai, Bobot
        System.out.println("Mata Kuliah\tSKS\tNilai\tBobot");
        int totalSks = 0;
        int totalBobot = 0;

        for (MataKuliah mk : mataKuliahList) {
            System.out.println(mk.namaMataKuliah + "\t\t" + mk.sks + "\t" + mk.nilai + "\t" + mk.bobot);
            totalSks += mk.sks;
            totalBobot += mk.sks * mk.bobot;  // Menghitung total bobot (sks * bobot)
        }

        // Menghitung nilai rata-rata
        double nilaiRataRata = (double) totalBobot / totalSks;

        // Menampilkan hasil akhir
        System.out.println("\nTotal SKS yang diambil: " + totalSks);
        System.out.println("Nilai rata-rata: " + nilaiRataRata);
    }
}
