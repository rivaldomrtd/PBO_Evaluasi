package elitak_method;
class Balokk {
    double panjang;
    double lebar;
    double tinggi;
    
    double cetakVolume(){
        double volume=panjang*lebar*tinggi;
        return volume;
    }
}
public class no2_nilaiKembaliMethod {
    public static void main(String[] args) {
        Balokk b1,b2,b3;
        
        b1 = new Balokk();
        b2 = new Balokk();
        b3 = new Balokk();
        
        b1.panjang=4;
        b1.lebar=3;
        b1.tinggi=2;
        
        b2.panjang=10;
        b2.lebar=10;
        b2.tinggi=2;
        
        b3.panjang=6;
        b3.lebar=7;
        b3.tinggi=8;
        
        System.out.println("Volume b1 = " + b1.cetakVolume());
        System.out.println("Volume b2 = " + b2.cetakVolume());
        System.out.println("Volume b3 = " + b3.cetakVolume());
        
    }
}
