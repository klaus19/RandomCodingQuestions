public class RepeatingString {

    public String findSubstring(String s, int k){
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);

        for (int i=1; i<s.length()-k+1; i++) {
            String substr = s.substring(i, i+k);
            if (smallest.compareTo(substr) > 0)
                smallest = substr;
            if (largest.compareTo(substr) < 0)
                largest = substr;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        RepeatingString rs = new RepeatingString();
        String s = "GeeksForGeeks";
        System.out.println(rs.findSubstring(s,3));
    }
}
