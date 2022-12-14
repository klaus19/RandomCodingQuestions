package Strings;

public class Pallindrome {


    private boolean isPallindrome(String str){

        String reverse =  new StringBuilder(str).reverse().toString();
        return  str.equals(reverse)?true:false;}


    public static void main(String[] args) {

        Pallindrome pd = new Pallindrome();
        String s = "czjwinostawcz";
        System.out.println(pd.isPallindrome(s));

    }
}
