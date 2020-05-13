package elitak_method;
class Balok{
    double panjang;
    double lebar;
    double tinggi;
    void  cetakVolume(){
        System.out.println("Volume Balok= "+(panjang*lebar*tinggi));
    }
}
public class no1_definisiMethod {
    public static void main(String[] args) {
        Balok b1,b2,b3;
        
        b1 = new Balok();
        b2 = new Balok();
        b3 = new Balok();
        
        b1.panjang=4;
        b1.lebar=3;
        b1.tinggi=2;
        
        b2.panjang=10;
        b2.lebar=10;
        b2.tinggi=2;
        
        b3.panjang=6;
        b3.lebar=7;
        b3.tinggi=8;
        
        b1.cetakVolume();
        b2.cetakVolume();
        b3.cetakVolume();
    }
}
