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
        
        /*
         Aplikasi Bangun Ruang
        1. Kubus
        2. Lingkaran
        3. Limas
        4. Keluar
        Pilihan Anda (1/2/3/4) :

        Apakah anda ingin kembali ke menu utama (y/n)?

        percabangan untuk 1,2,3,4
        while => bungkus code untuk mengulang ke perintah pertama?
         */
        
         //cetak menu
         //terima input pilihan 1,2,3,4 => int pilihan
        
         //percabangan
         //terima input pilihan y/n => String yn
        //perulangan

        Scanner keyboard = new Scanner(System.in);

        int pilihan=0;
        String yn="y";
        do{
             //cetak menu
            cetakMenu();
            //terima input pilihan 1,2,3,4 => int pilihan
            pilihan = keyboard.nextInt();
            //percabangan
            if(pilihan==1){
                hitungLuasKubus(keyboard);
            }
            else if(pilihan==2){
               menuLingkaran(keyboard);
            }
            else if(pilihan==3){
                System.out.println("Dalam Pembangunan");
            }
            else if(pilihan==4) break;

            //terima input pilihan y/n => String yn
            System.out.println("Apakah anda ingin kembali ke menu utama (y/n)?");
            yn= keyboard.next();
            bersihkanLayar();
        }while(yn.equalsIgnoreCase("y"));
       
    }

    public static void cetakMenu(){
        System.out.println("Aplikasi Bangun Ruang");
        System.out.println("1. Kubus");
        System.out.println("2. Lingkaran");
        System.out.println("3. Limas");
        System.out.println("4. Keluar");
        System.out.print(" Pilihan Anda (1/2/3/4) :");
    }
    public static void bersihkanLayar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    //hitung volume kubus => V=s3
    public static void hitungLuasKubus(Scanner keyboard){
        int s=0;
        System.out.print("Masukkan Panjang sisi kubus (cm) : ");
        s=keyboard.nextInt();
        Double v=0.0;
//        int s=10;//dalam cm
        v= Math.pow(s,3); //s*s*s;
        System.out.println("Menghitung Volume Kubus");
        System.out.println("Panjang Sisi = " +s + " cm");
        System.out.println("Volume Kubus = s*s*s = " +v + " cm3");
    }
    public static void menuLingkaran(Scanner keyboard){
        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Masukkan Panjang jari2 Lingkaran (cm) : ");
        lingkaran.r=keyboard.nextInt();
        //lingkaran.PI=40;
        lingkaran.tampilkanLuasLingkaran(); 
    }
 
}
