package LatihanAlgoritmaSemester1;

    import java.util.Scanner;

public class arrayinput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Mendefinisikan ukuran array
        System.out.print("Masukkan jumlah angka yang ingin diinput: ");
        int n = scanner.nextInt();
        
        // 2. Membuat array untuk menyimpan angka
        int[] angka = new int[n];
        
        // 3. Mengisi array dengan input dari pengguna
        System.out.println("Masukkan " + n + " angka:");
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }
        
        // 4. Menghitung total dan rata-rata
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }
        double rataRata = (double) total / n;
        
        // 5. Menampilkan hasil
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
        
        scanner.close();
    }
}
