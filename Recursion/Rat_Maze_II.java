package Recursion;

/*
    Here's the question is also to find the ways that a rat can reach its destination
    but there's a twist it can move in every direction, so we have to track its path so
    that it wouldn't return to its previous path. If it does that then the recursion won't
    stop. That's why we hve to maintain a boolean type array to mark its path as true.
 */

public class Rat_Maze_II {
    public static void printWays(int sr, int sc, int er, int ec, String s, boolean[][] isVisited){
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc > ec) return;
        if(isVisited[sr][sc]) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        printWays(sr+1, sc, er, ec, s+'D', isVisited);
        printWays(sr, sc+1, er, ec, s+'R', isVisited);
        printWays(sr, sc-1, er, ec, s+'L', isVisited);
        printWays(sr-1, sc, er, ec, s+'U', isVisited);
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
        printWays(0,0,rows-1,cols-1,"",isVisited);
    }
}
