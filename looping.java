package LatihanAlgoritmanSemester1;

public class looping {
        public static void main(String[] args) {
            // 1. For Loop
            System.out.println("For Loop:");
            for (int i = 0; i < 10; i++) {
                System.out.println("Iterasi ke-" + i);
            }
            
            // 2. While Loop
            System.out.println("\nWhile Loop:");
            int j = 0;
            while (j < 10) {
                System.out.println("Iterasi ke-" + j);
                j++;
            }
            
            // 3. Do-While Loop
            System.out.println("\nDo-While Loop:");
            int k = 0;
            do {
                System.out.println("Iterasi ke-" + k);
                k++;
            } while (k < 10);
            
            // 4. Enhanced For Loop (For-Each)
            System.out.println("\nEnhanced For Loop:");
            int[] angka = {1, 2, 3, 4, 5};
            for (int num : angka) {
                System.out.println("Angka: " + num);
            }
        }
    }
