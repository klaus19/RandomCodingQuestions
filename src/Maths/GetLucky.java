package Maths;
public class GetLucky {

    public int getLucky(String s, int k) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String temp = "";
        for(int i=0;i<s.length();i++){
            String st = Character.toString(s.charAt(i));
            temp=temp+Integer.toString(str.indexOf(st)+1);
        }
        int sum=0;
        for(int j=0;j<temp.length();j++)
            sum=sum+Integer.parseInt(Character.toString(temp.charAt(j)));
        for(int z=0;z<k-1;z++){
            int nsum=0;
            while(sum>0){
                nsum=nsum+sum%10;
                sum=sum/10;
            }
            sum=nsum;
        }
        return sum;

    }

    public static void main(String[] args) {
        GetLucky g = new GetLucky();
        String str = "iiii";
        int k=1;
        System.out.println(g.getLucky(str,k));
    }
}
