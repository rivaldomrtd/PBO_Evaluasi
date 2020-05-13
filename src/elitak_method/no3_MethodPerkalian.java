package elitak_method;
public class no3_MethodPerkalian {
    static int hitungPerkalian(int x, int y){
        return x*y;
    }
    public static void main(String[] args) {
        int a,b,hasil;
        
        a=4;
        b=5;
        hasil=hitungPerkalian(a,b);
        System.out.println("Hasil Ke-1 = "+hasil);
        
        a=10;
        b=10;
        hasil=hitungPerkalian(a,b);
        System.out.println("Hasil Ke-2 = "+hasil);
    }
}
