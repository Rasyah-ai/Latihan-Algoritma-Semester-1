package LatihanAlgoritmaSemester1;

import java.util.Scanner;

public class contoh {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan pengeluaran anda : ");
        double pengeluaran = input.nextDouble();

        if (pengeluaran >1000000) {
            System.err.println("boros banget!!");
        }else if (pengeluaran == 1000000 )
        {
            System.err.println("boros :((((((");
        }else  {
            System.err.println("madep gaboros bor");
        }
        input.close();
    }
}
