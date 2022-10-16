public class RepeatingString {

    //aaabbccd = a3b2c2d

    public String getAnswer(String str){
        int count=1;
        int first = str.charAt(0);
        String s1 = "";
        for (int i=1;i<str.length();i++){
            if (str.charAt(i)==first){
                count++;
                count = str.charAt(i);
            }else{
                i++;
            }
        }
        return
    }

}
