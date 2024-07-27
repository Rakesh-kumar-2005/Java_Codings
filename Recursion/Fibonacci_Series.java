package Recursion;
public class Fibonacci_Series {
    public static void fibonacci(int a,int b,int x){
        if(a == 0 && b == 0)return;
        if (x==0)return;
        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b,c,x-1);
    }
    public static void main(String[] args) {
        fibonacci(0,1,5);
    }
}
