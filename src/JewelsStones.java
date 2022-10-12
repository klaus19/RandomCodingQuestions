

public class JewelsStones {

    public int numJewelsInStones(String J, String S) {
        int counter = 0;
        for (int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if(J.indexOf(c) > -1) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        JewelsStones js = new JewelsStones();
        String str = "aA";
        String str2 = "aAabdb";

        System.out.println(js.numJewelsInStones(str,str2));
    }

}
