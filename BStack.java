package LatihanAlgoritmaSemester1;

import java.util.Stack;

public class BStack {
    public static void main(String[] args) {
        Stack<String> tumpukannama = new Stack<>();

        // Menambahkan elemen
        tumpukannama.push("Alice");
        tumpukannama.push("Bob");
        tumpukannama.push("Charlie");
        tumpukannama.push("latip");
        tumpukannama.push("raz");
        tumpukannama.push("lutfi");
        tumpukannama.push("andika");
        // Mengeluarkan elemen teratas
        // System.out.println(tumpukannama.pop()); // Output: Charlie
        // System.out.println(tumpukannama.pop());
        // System.out.println(tumpukannama.pop());
        // System.out.println(tumpukannama.pop());
        // System.out.println(tumpukannama.pop());
        
        // Melihat elemen teratas tanpa mengeluarkannya
        System.out.println(tumpukannama.peek()); // Output: Bob
        System.out.println(tumpukannama.peek());
        System.out.println(tumpukannama.peek());
        System.out.println(tumpukannama.peek());
        System.out.println(tumpukannama.peek());
        System.out.println(tumpukannama.peek());

        // // Memeriksa ukuran stack
        // System.out.println(tumpukannama.size()); // Output: 2

        // // Memeriksa apakah stack kosong
        // System.out.println(tumpukannama.empty()); // Output: false
    }
}
