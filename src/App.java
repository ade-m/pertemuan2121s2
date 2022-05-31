import bangunruang.Lingkaran;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Datang \ndi matakuliah \"Pemrograman Berorientasi Objek\"";
        Integer tahun = 2022;
        int tahun2 = 2022;
        String penutup= "Sampai Jumpa";
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(pesan + " Tahun " + tahun);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        //scanner inputankeyboard
        Scanner keyboard = new Scanner(System.in);

        int s=0;
        System.out.print("Masukkan Panjang sisi kubus (cm) : ");
        s=keyboard.nextInt();
        hitungLuasKubus(s);

        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Masukkan Panjang jari2 Lingkaran (cm) : ");
        lingkaran.r=keyboard.nextInt();
        //lingkaran.PI=40;
        lingkaran.tampilkanLuasLingkaran(); 
    }
    //hitung volume kubus => V=s3
    public static void hitungLuasKubus(int s){
        Double v=0.0;
//        int s=10;//dalam cm
        v= Math.pow(s,3); //s*s*s;
        System.out.println("Menghitung Volume Kubus");
        System.out.println("Panjang Sisi = " +s + " cm");
        System.out.println("Volume Kubus = s*s*s = " +v + " cm3");
    }
 
}
