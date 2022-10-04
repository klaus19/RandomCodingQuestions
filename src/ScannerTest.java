import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String input
        String name = sc.nextLine();


        //char array
        char gender = sc.next().charAt(0);


        System.out.println("Name" +name);
        System.out.println("Gender" +gender);

    }
}
