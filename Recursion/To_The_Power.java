package Recursion;
public class To_The_Power {
    public static int calcPow(int m ,int n){
        if(n==0)return 1;
        if (m==0)return 0;
        if (n==1)return m;
        return m * calcPow(m,n-1);
    }
    public static void main(String[] args) {
        System.out.println(calcPow(5,4));
    }
}
