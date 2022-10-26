public class GenerateOddCharactersCount {

    public String generateTheString(int n) {

        StringBuilder res = new StringBuilder("");
        if(n%2==0){
            n--;
            res.append('z');
        }
        while(n-->0)res.append('a');
        return res.toString();
    }

}
