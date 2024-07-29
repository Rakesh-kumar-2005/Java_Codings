package Recursion;

/*
    Rat maze question -
    it can only move in 2 direction - right and downwards
    for the following code we have the starting point at 0,0 cell and the destination is at the 5,5 cell
*/

public class Rat_Maze_I {
    private static void printWays(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        printWays(sr + 1, sc, er, ec, s + "D");
        printWays(sr, sc + 1, er, ec, s + "R");
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        printWays(0,0,rows-1,cols-1,"");
    }
}
