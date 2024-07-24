package Hashing;
import java.util.HashMap;
public class Two_Sum {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] ans = {-1};
        for(int i=0; i<arr.length; i++){
            int partner = target-arr[i];
            if(mp.containsKey(partner)){
                ans = new int[]{i,mp.get(partner)};
                return ans;
            }else{
                mp.put(arr[i],i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,95,35};
        int target = 100;
        System.out.print("The target sum " + target + " can be found if we add ");
        int[] arr2 = twoSum(arr,target);
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + ",");
        }

        System.out.print(" these indices...");
    }
}
