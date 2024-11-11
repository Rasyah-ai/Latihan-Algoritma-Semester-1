public class Latihan1HitungGaji {
    public static void main(String[] args) {
        int gajiBulanan = 7500000; 
        int jamLembur = 6; 

        
        int upahLemburPerJam = (int) Math.ceil((double) gajiBulanan / 150);

        
        int upahLembur;
        if (jamLembur <= 5) {
            upahLembur = jamLembur * upahLemburPerJam;
        } else {
            int jamLemburNormal = 5;
            int jamLemburTambahan = jamLembur - jamLemburNormal;
            upahLembur = (jamLemburNormal * upahLemburPerJam) + (int) (jamLemburTambahan * 1.5 * upahLemburPerJam);
        }

        
        int totalGaji = gajiBulanan + upahLembur;

        
        System.out.println("Gaji Pokok Bulanan: " + gajiBulanan);
        System.out.println("Jam Lembur: " + jamLembur);
        System.out.println("Upah Lembur per Jam: " + upahLemburPerJam);
        System.out.println("Upah Lembur: " + upahLembur);
        System.out.println("Total Gaji yang Diberikan: " + totalGaji);
    }
}
