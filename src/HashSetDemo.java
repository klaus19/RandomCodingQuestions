import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public Set<Integer> getArray(int nums[]){

        HashSet<Integer>set = new HashSet<>();
        for (int t:nums) {
             set.add(t);
        }
        return set;
    }

    public static void main(String[] args) {
        HashSetDemo hst = new HashSetDemo();
        int[]a = new int[]{1,2,3,1};
        System.out.println(hst.getArray(a));
    }
}
