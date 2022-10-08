import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class IsomorphicStrings {

    public boolean finIsomorphic(String s,String t){

        if (s.length()!=t.length()){
            return false;
        }
        int N = s.length();
        HashMap<Character,Character>hmp = new HashMap<>();
        for (int i=0;i<s.length();i++){
             if (hmp.containsKey(s.charAt(i))){
                 char c = hmp.get(s.charAt(i));
                 if (c!=hmp.get(t.charAt(i))) return false;
             }else {
                 if (hmp.containsValue(t.charAt(i))) return false;
                 hmp.put(s.charAt(i),t.charAt(i));
             }
        }
        return true;
    }


    //Using HashTable
    public boolean getIsomorphic(String s,String t){
        char[]Sarray = s.toCharArray();
        char[]Tarray = t.toCharArray();

        // Sets up the hashtable for mapping char to char, e -> a
        Hashtable<Character,Character>hb = new Hashtable<>();

        // Iterate through a string, should be same length
        for (int i=0;i<s.length();i++){

            // If no key or value is detected, add into the hashtable
            if (hb.containsKey(Sarray[i])==false && hb.containsValue(Tarray[i])==false){
                hb.put(Sarray[i],Tarray[i]);
            }

            //If key is detected but not the same value then we return false
            else if (hb.containsKey(Sarray[i])==true && hb.containsValue(Tarray[i])==false){

                  return false;
            }
            //If the key is not detected but value is already mapped then also return false;
            else if (hb.containsKey(Sarray[i])==false && hb.containsValue(Tarray[i])==true) {
                return false;

            }

        }
             return true;
    }


    public static void main(String[] args) {
        IsomorphicStrings is = new IsomorphicStrings();
        String s1 = "egg";
        String s2 =  "add";

      //  System.out.println(is.finIsomorphic(s1,s2));
        System.out.println(is.getIsomorphic(s1,s2));
    }
}
