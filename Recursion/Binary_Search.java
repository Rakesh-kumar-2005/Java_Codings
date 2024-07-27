package Recursion;
public class Binary_Search {
    public static void binarySearch(int[] arr,int start, int end, int ele){
        int mid = (start+end)/2;
        if (start > mid){
            System.out.println("Element isn't in the array...");
            return;
        } else if (arr[mid] == ele) {
            System.out.println("Desired element found at index " + mid);
            return;
        }else if (arr[mid] > ele)
            binarySearch(arr, start, mid-1, ele);
        else
            binarySearch(arr, mid, end, ele);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        binarySearch(arr,0,8,7);
    }
}
