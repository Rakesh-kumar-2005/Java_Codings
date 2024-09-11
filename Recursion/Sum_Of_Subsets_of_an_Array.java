package Recursion;
public class Sum_Of_Subsets_of_an_Array {
    private static void printSumOfSubsets(int[] arr, int length, int idx, int sum) {
        if(idx == length){
            System.out.println(sum);
        }
        printSumOfSubsets(arr, length,idx+1, sum);
        printSumOfSubsets(arr, length, idx+1, sum+arr[idx]);
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        int n = arr.length;;
        printSumOfSubsets(arr, n, 0, 0);
    }
}
