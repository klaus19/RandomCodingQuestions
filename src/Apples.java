public class Apples {

    public int getDifference(int k){
        return ((int)Math.pow(-1,k))*k*(k+1)/2;}


    public static void main(String[] args) {
        Apples app = new Apples();
        int s =5;
        System.out.println(app.getDifference(s));
    }
}
