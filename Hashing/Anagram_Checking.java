package Hashing;
import java.util.HashMap;
public class Anagram_Checking {
    public static HashMap<Character,Integer> makeMap(String st){
        HashMap<Character,Integer> mp = new HashMap<>();
        for (int i=0; i< st.length(); i++){
            char ch = st.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        return mp;
    }
    public static boolean isAnagram(String s,String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mp = makeMap(s);
        for (int i=0; i<t.length(); i++){
           char ch = t.charAt(i);
           if(!mp.containsKey(ch)) return false;
           else {
               mp.put(ch,mp.get(ch)-1);
           }
           if(mp.get(ch) == 0) mp.remove(ch);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Anagram checking - " + isAnagram("silent","lis"));
    }
}
