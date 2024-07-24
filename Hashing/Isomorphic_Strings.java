package Hashing;
import java.util.HashMap;
import java.util.HashSet;
public class Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t){
        if (s.length() != t.length()) return false;
        HashMap<Character,Character> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            if (mp.containsKey(sCh)){
                if (mp.get(sCh) != tCh) return false;
            }else if (st.contains(tCh)) return false;
            else {
                mp.put(sCh,tCh);
                st.add(tCh);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println("Isomorphic checking - " + isIsomorphic("adda","eggx"));
    }
}
