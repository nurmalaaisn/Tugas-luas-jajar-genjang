import java.util.Scanner;

public class Luas {
    public static void main(String[] args) {
        
        System.out.println("Selamat datang di program luas jajar genjang");
        double alas,tinggi,hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan alas jajar genjang: ");
        alas = input.nextDouble();
        System.out.println("Masukkan tinggi jajar genjang: ");
        tinggi = input.nextDouble();
        hasil = alas*tinggi;
        System.out.println("Hasil luas jajar genjang adalah: "+hasil);
    }
}
