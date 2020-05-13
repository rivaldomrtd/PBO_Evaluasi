
package elitak_kelas;
class Balok{
    double panjang;
    double lebar;
    double tinggi;
}
public class no1_Balok {
    public static void main(String[] args) {
        double volume;
        Balok b = new Balok();
        b.panjang=4;
        b.lebar=3;
        b.tinggi=2;
        
        volume=b.panjang*b.lebar*b.tinggi;
        
        System.out.println("Volume Balok: "+volume);
    }
    
}
