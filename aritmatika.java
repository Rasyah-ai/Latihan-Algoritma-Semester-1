package LatihanAlgoritmaSemester1;

import java.util.Scanner;

public class aritmatika {
   public static void main(String[] args) {
    //aritmatika memiliki pertambahan + , - , / , * ,  %
    //contoh yg udah fiks nilai variabelnya
    // int angka1 = 10;
    // int angka2 = 10;
    // //ini buat hasilnya 
    // int hasil = angka1 % angka2;

    // //contoh mengguankan printf
    // System.out.printf("%d /  %d = %d "+ "\n",angka1,angka2,hasil);
    // System.out.println(" ");
    
    //contoh menggunakan inputan 
    Scanner userinput = new Scanner(System.in);
    System.out.print("silakan masukan angka ke 1 : ");
    int angka3 = userinput.nextInt();
    System.out.print("silakan masukan angka ke 2 : ");
    int angka4 = userinput.nextInt();
    int jumlah = angka3 + angka4;
    System.out.println(angka3 + "*" + angka4+" = " + jumlah);
    System.out.printf("%d * %d = %d ",angka3,angka4,jumlah );
    userinput.close();

    }   
}
