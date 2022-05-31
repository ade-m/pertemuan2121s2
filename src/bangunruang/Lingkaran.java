package bangunruang;
public class Lingkaran {
    //attribut
    public final float PI= 22.0f/7;
    public int r=10;
    public float luas=0;
      

    //method hitung luas lingkaran
    public void hitungLuasLingkaran(){
         //luas lingkaran ==> A = pi*r2
        luas = PI*r*r;
    }

    //menampilkan luas lingkaran
    public void tampilkanLuasLingkaran(){
        hitungLuasLingkaran();
        System.out.println("Luas Lingkaran (jari:"+r+"cm) = "+ luas + "cm2");
    }
}
