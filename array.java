package LatihanAlgoritmaSemester1;

public class array {
        public static void main(String[] args) {
            // 1. Array Satu Dimensi
            int[] angka = {1, 2, 3, 4, 5};
            System.out.println("Array Satu Dimensi:");
            for (int num : angka) {
                System.out.print(num + " ");
            }
            
            // 2. Array Dua Dimensi
            int[][] matriks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            System.out.println("\n\nArray Dua Dimensi:");
            for (int i = 0; i < matriks.length; i++) {
                for (int j = 0; j < matriks[i].length; j++) {
                    System.out.print(matriks[i][j] + " ");
                }
                System.out.println();
            }
            
            // 3. Array Tiga Dimensi
            int[][][] kubus = {
                {
                    {1, 2}, 
                    {3, 4}
                },
                {
                    {5, 6},
                    {7, 8}
                }
            };
            System.out.println("\nArray Tiga Dimensi:");
            for (int i = 0; i < kubus.length; i++) {
                for (int j = 0; j < kubus[i].length; j++) {
                    for (int k = 0; k < kubus[i][j].length; k++) {
                        System.out.print(kubus[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            
            // 4. Array Jagged (Array Beraneka Ragam)
            int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
            };
            System.out.println("Array Jagged:");
            for (int i = 0; i < jaggedArray.length; i++) {
                for (int j = 0; j < jaggedArray[i].length; j++) {
                    System.out.print(jaggedArray[i][j] + " ");
                }
                System.out.println();
            }
            
            // 5. Array Objek
            String[] nama = {"Alice", "Bob", "Charlie"};
            System.out.println("\nArray Objek (String):");
            for (String n : nama) {
                System.out.print(n + " ");
            }
            
            // 6. Array String
            String[] daftarNama = {"David", "Eva", "Frank"};
            System.out.println("\n\nArray String:");
            for (String n : daftarNama) {
                System.out.print(n + " ");
            }
        }
    }
