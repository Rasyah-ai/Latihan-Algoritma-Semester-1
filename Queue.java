package LatihanAlgoritmaSemester1;

import java.util.LinkedList;
import java.util.Queue;

public class Queque {
    
    public static void main(String[] args) {
        // Membuat queue
        Queue<Integer> queue = new LinkedList<>();

        // Menambahkan elemen ke queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Menampilkan elemen terdepan
        System.out.println("Elemen terdepan: " + queue.peek());

        // Menghapus elemen dari queue
        System.out.println("Menghapus elemen: " + queue.poll());
        System.out.println("Elemen terdepan setelah dequeue: " + queue.peek());

        // Menampilkan ukuran queue
        System.out.println("Ukuran queue: " + queue.size());

        // Memeriksa apakah queue kosong
        System.out.println("Apakah queue kosong? " + queue.isEmpty());
    }
}
