package LatihanAlgoritmaSemester1;
import java.util.Scanner;
public class semuapercabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        
        // 1. If Statement
        if (angka > 0) {
            System.out.println("Angka positif");
        }
        
        // 2. If-Else Statement
        if (angka > 0) {
            System.out.println("Angka positif");
        } else {
            System.out.println("Angka bukan positif");
        }
        
        // 3. Else If Statement
        if (angka > 0) {
            System.out.println("Angka positif");
        } else if (angka < 0) {
            System.out.println("Angka negatif");
        } else {
            System.out.println("Angka nol");
        }
        
        // 4. Switch Statement
        switch (angka) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            default:
                System.out.println("Angka tidak dalam range 1-3");
                break;
        }
        
        // 5. Ternary Operator
        String hasil = (angka > 0) ? "Angka positif" : "Angka bukan positif";
        System.out.println(hasil);
        
        // 6. Nested If
        if (angka > 0) {
            System.out.println("Angka positif");
            if (angka % 2 == 0) {
                System.out.println("Angka genap");
            } else {
                System.out.println("Angka ganjil");
            }
        } else {
            System.out.println("Angka bukan positif");
        }
        
        scanner.close();
    }
}
