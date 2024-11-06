package LatihanAlgoritmaSemester1;

import java.util.ArrayList;

public class arraylist {

        public static void main(String[] args) {
            // 1. Membuat ArrayList
            ArrayList<String> daftarNama = new ArrayList<>();
    
            // 2. Menambahkan elemen
            daftarNama.add("Alice");
            daftarNama.add("Bob");
            daftarNama.add("Charlie");
    
            // 3. Menampilkan elemen
            System.out.println("Daftar Nama: " + daftarNama);
    
            // 4. Mengambil elemen berdasarkan indeks
            String namaPertama = daftarNama.get(0);
            System.out.println("Nama Pertama: " + namaPertama);
    
            // 5. Menghapus elemen
            daftarNama.remove("Bob");
            System.out.println("Setelah menghapus Bob: " + daftarNama);
    
            // 6. Menampilkan ukuran ArrayList
            System.out.println("Jumlah Nama: " + daftarNama.size());
        }
    }
