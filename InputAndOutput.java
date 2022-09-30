import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        System.out.println("Enter int, String and double");
        Scanner myScanner = new Scanner(System.in);
        String b=myScanner.nextLine();
        int a=myScanner.nextInt();
        double c=myScanner.nextDouble();
        System.out.println("your int is: " + a);
        System.out.println("your String is: " + b);
        System.out.println("your double is: " + c);
        myScanner.close();
    }
    
}
