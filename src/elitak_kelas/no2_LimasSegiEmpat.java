
package elitak_kelas;
class LimasSegiEmpat{
    double panjang;
    double lebar;
    double tinggi;
}
public class no2_LimasSegiEmpat {
    public static void main(String[] args) {
        double volume1, volume2;
        LimasSegiEmpat l1 = new LimasSegiEmpat();
        LimasSegiEmpat l2 = new LimasSegiEmpat();
        
        l1.panjang = 6;
        l1.lebar = 5;
        l1.tinggi = 10;
        l2.panjang = 12;
        l2.lebar = 8;
        l2.tinggi = 15;
        
        volume1= (l1.panjang * l1.lebar * l1.tinggi)/3;
        volume2= (l2.panjang * l2.lebar * l2.tinggi)/3;
        
        System.out.println("Volume Limas 1: "+volume1);
        System.out.println("Volume Limas 1: "+volume2);
    }
    
}
