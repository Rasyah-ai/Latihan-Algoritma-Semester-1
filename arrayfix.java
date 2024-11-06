package LatihanAlgoritmaSemeter1;

public class arrayfix {
        public static void main(String[] args) {
            // 1. Mendefinisikan array dengan nilai tetap
            int[] angka = {10, 20, 30, 40, 50};
    
            // 2. Menghitung total dan rata-rata
            int total = 0;
            for (int i = 0; i < angka.length; i++) {
                total += angka[i];
            }
            double rataRata = (double) total / angka.length;
    
            // 3. Menampilkan hasil
            System.out.println("Angka: ");
            for (int num : angka) {
                System.out.print(num + " ");
            }
            System.out.println("\nTotal: " + total);
            System.out.println("Rata-rata: " + rataRata);
        }
    }
