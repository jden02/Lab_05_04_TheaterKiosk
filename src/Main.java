import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 21){
            System.out.println("You are over 21yo. Please collect your wrist band.");
        }
    }
}