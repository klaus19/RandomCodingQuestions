import java.util.HashMap;

public class Charactercount {

    public int getUnique(String str){

        HashMap<Character,Integer>hmp = new HashMap<>();
        char ch = str.charAt(0);
        int count =0;

        for(int i=1;i<str.toCharArray().length;i++){
            if (!hmp.containsKey(str.charAt(i))){
                hmp.put(str.charAt(i),count++);
            }else{
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Charactercount ch = new Charactercount();
        String str = "Tejass";
        System.out.println(ch.getUnique(str));
    }
}
