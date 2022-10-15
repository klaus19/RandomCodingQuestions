public class RandomCounting {

    int solution(String commands) {

        boolean bSide=false;
        int count=0;
        for(int i=0;i<commands.length();i++){

            if(commands.charAt(i) != 'A') {
                bSide = !bSide;
            }
            if(!bSide){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RandomCounting rc = new RandomCounting();
        String str = "LLARL";
        System.out.println(rc.solution(str));
    }
}
