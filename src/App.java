public class App {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Datang di matakuliah Pemrograman Berorientasi Objek";
        Integer tahun = 2022;
        int tahun2 = 2022;
        String penutup= "Sampai Jumpa";
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(pesan + " Tahun " + tahun);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        hitungLuasKubus();
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r=15;
        //lingkaran.PI=40;
        lingkaran.tampilkanLuasLingkaran(); 
    }
    //hitung volume kubus => V=s3
    public static void hitungLuasKubus(){
        int v=0;
        int s=10;//dalam cm
        v=s*s*s;
        System.out.println("Menghitung Volume Kubus");
        System.out.println("Panjang Sisi = " +s + " cm");
        System.out.println("Volume Kubus = s*s*s = " +v + " cm3");
    }
 
}
