package elitak_method;
public class no4_methodNilaiTertinggi {
    static int nilaitertinggi(int x, int y, int z){
        if(x>y){
            if(x>z)return x;
            else return z;
        }
        else{
            if(y>z)return y;
            else return z;
        }
    }
    public static void main(String[] args) {
        int a,b,c, max;
        a=4;
        b=5;
        c=16;
        max=nilaitertinggi(a,b,c);
        System.out.println("Nilai teringgi dari "+a+", "+b+", "+c+" Adalah "+max);
        
        a=14;
        b=5;
        c=6;
        max=nilaitertinggi(a,b,c);
        System.out.println("Nilai teringgi dari "+a+", "+b+", "+c+" Adalah "+max);
        
        a=4;
        b=15;
        c=6;
        max=nilaitertinggi(a,b,c);
        System.out.println("Nilai teringgi dari "+a+", "+b+", "+c+" Adalah "+max);
    }
    
}
