package Recursion;
public class Tower_Of_Hanoi {
     public static void towerOfHanoi(int n, char src, char hel, char dest){
        if (n == 1) {
            System.out.println("Move Disk 1 from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, hel);
        System.out.println("Move disk " + n + " from rod " + src + " to " + dest);
        towerOfHanoi(n-1,hel,src,dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(3,'A','B','C');
    }
}
